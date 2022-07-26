package io.spaceandtime

import org.apache.arrow.flight.FlightClient
import org.apache.arrow.flight.Location
import org.apache.arrow.flight.sql.FlightSqlClient
import org.apache.arrow.memory.RootAllocator
import org.slf4j.LoggerFactory
import java.net.URI
import java.sql.Connection
import java.sql.Driver
import java.sql.DriverPropertyInfo
import java.util.*
import java.util.jar.Manifest
import java.util.logging.Logger

class FlightSqlJdbcDriver : Driver {
    val log = LoggerFactory.getLogger(this.javaClass.name)
    val nonStandardHeader = "jdbc:"

    override fun connect(url: String?, props: Properties?): Connection {
        val realUrl = url!!.substring(nonStandardHeader.length)
        val uri = URI(realUrl)
        log.info("connecting to ${uri.host}:${uri.port}") // 127.0.0.1:32010

        val user = props?.get("user") as String?
        val password = props?.get("password") as String?
        val allocator = RootAllocator()

        val client = FlightClient.builder()
            .allocator(allocator)
            .location(Location.forGrpcInsecure(uri.host, uri.port))
            .build()
        val token = client.authenticateBasicToken(user, password).get()
//        client.authenticateBasic(user, password)
        val sqlClient = FlightSqlClient(client)

        return FlightSqlConnection(sqlClient, token)
    }

    override fun acceptsURL(url: String?): Boolean {
        if(url == null) return false
        if(!url!!.lowercase().startsWith(nonStandardHeader)) return false
        val realUrl = url.substring(nonStandardHeader.length)
        val uri = URI(realUrl)
        return uri.scheme == "arrow-flight"
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
            FlightSqlJdbcDriver::class.java.classLoader.getResourceAsStream("META-INF/MANIFEST.MF").use {
                return Manifest(it).mainAttributes.getValue("Implementation-Version")
            }
        }
    }
}