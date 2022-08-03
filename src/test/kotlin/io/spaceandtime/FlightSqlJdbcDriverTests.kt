package io.spaceandtime

import org.junit.jupiter.api.Test
import java.sql.DriverManager
import java.util.Properties
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class FlightSqlJdbcDriverTests {
//    @Test
    fun `select should return a value`() {
        DriverManager.registerDriver(FlightSqlJdbcDriver())

//        val url = "flightsql://127.0.0.1:50051" // FlightSql examples
        val url = "flightsql://127.0.0.1:50050" // ballista
//        val url = "flightsql://127.0.0.1:32010" // dremio
        val user = "admin" //""dremio"
        val password = "password" //"dremio123"
        val con = DriverManager.getConnection(url, user, password)
        val stmt = con.createStatement()
        val result = stmt.execute("SELECT 'keep alive'")

        assertEquals(result, true)
    }

    @Test
    fun `should accept url`() {
        val url = "jdbc:arrow-flight://127.0.0.1:50050"
        val driver = FlightSqlJdbcDriver()
        val actual = driver.acceptsURL(url)
        assertTrue(actual, "The driver should accept the standard FlightSQL URL")
    }

    @Test
    fun `should connect`() {
        val url = "jdbc:arrow-flight://127.0.0.1:50050"
        val driver = FlightSqlJdbcDriver()
        val props = Properties()
        val actual = driver.connect(url, props)
        assertNotNull(actual, "connect() should return a connection")
    }

    @Test
    fun `should return version`() {
        val version = FlightSqlJdbcDriver.getVersion()
        assertEquals(version, "1.6.21-release-334(1.6.21)", "version should be current")
    }
}