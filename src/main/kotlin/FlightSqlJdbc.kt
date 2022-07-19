import org.slf4j.LoggerFactory
import java.sql.Connection
import java.sql.Driver
import java.sql.DriverPropertyInfo
import java.util.*
import java.util.logging.Logger

class FlightSqlJdbc : Driver {
    val log = LoggerFactory.getLogger(this.javaClass.name)

    override fun connect(url: String?, p1: Properties?): Connection {
        log.info("connecting to {}", url)
        return FlightSqlConnection()
    }

    override fun acceptsURL(p0: String?): Boolean {
        TODO("Implement acceptsURL()")
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
}