package io.spaceandtime

import org.apache.arrow.flight.FlightClient
import org.apache.arrow.flight.Location
import org.apache.arrow.memory.RootAllocator
import org.slf4j.LoggerFactory
import java.net.URI
import java.net.URLClassLoader
import java.sql.Connection
import java.sql.Driver
import java.sql.DriverPropertyInfo
import java.util.*
import java.util.jar.Manifest
import java.util.logging.Logger

class FlightSqlJdbcDriver : Driver {
    val log = LoggerFactory.getLogger(this.javaClass.name)

    override fun connect(url: String?, props: Properties?): Connection {
        val uri = URI(url)
        log.info("connecting to ${uri.host}:${uri.port}") // 127.0.0.1:32010

        val user = props?.get("user") as String?
        val password = props?.get("password") as String?
        val allocator = RootAllocator()
        val client = FlightClient.builder()
            .allocator(allocator)
            .location(Location.forGrpcInsecure(uri.host, uri.port))
            .build()
        client.authenticateBasic(user, password)

        return FlightSqlConnection(client)
    }

    override fun acceptsURL(url: String?): Boolean {
        val uri = URI(url)
        return uri.scheme == "flightsql"
    }

    override fun getPropertyInfo(p0: String?, p1: Properties?): Array<DriverPropertyInfo> {
        TODO("Implement getPropertyInfo()")
    }

    override fun getMajorVersion(): Int {
        TODO("Implement getMajorVersion()")
    }

    override fun getMinorVersion(): Int {
        TODO("Implement getMinorVersion()")
    }

    override fun jdbcCompliant(): Boolean {
        TODO("Implement jdbcCompliant()")
    }

    override fun getParentLogger(): Logger {
        TODO("Implement getParentLogger()")
    }

    companion object {
        fun getVersion(): String {
            val loader = FlightSqlJdbcDriver.javaClass::class.java.getClassLoader() as URLClassLoader
            val url = loader.findResource("META-INF/MANIFEST.MF")
            val manifest = Manifest(url.openStream())
            val attr = manifest.getMainAttributes()
            val version = attr.getValue("Implementation-Version")
            return version
        }
    }
}