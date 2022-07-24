package io.spaceandtime

import org.apache.arrow.flight.sql.impl.FlightSql
import org.junit.jupiter.api.Test
import java.sql.DriverManager
import java.sql.ResultSet
import java.util.Properties
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class FlightSqlResultSetTests {
    @Test
    fun `should get metadata`() {
        val url = "jdbc:arrow-flight://127.0.0.1:50050"
        val driver = FlightSqlJdbcDriver()
        val con = driver.connect(url, Properties())
        val stmt = con.createStatement()
        val rs = stmt.executeQuery("SELECT 'keep alive'")
        val actual = rs.metaData
        assertNotNull(actual, "metadata should be returned")
    }

    @Test
    fun `should get type`() {
        val url = "jdbc:arrow-flight://127.0.0.1:50050"
        val driver = FlightSqlJdbcDriver()
        val con = driver.connect(url, Properties())
        val stmt = con.createStatement()
        val rs = stmt.executeQuery("SELECT 'keep alive'")
        val actual = rs.type
        assertEquals(actual, ResultSet.TYPE_FORWARD_ONLY, "should be forward only")
    }

    @Test
    fun `should get next`() {
        val url = "jdbc:arrow-flight://127.0.0.1:50050"
        val driver = FlightSqlJdbcDriver()
        val con = driver.connect(url, Properties())
        val stmt = con.createStatement()
        val rs = stmt.executeQuery("SELECT 'keep alive'")
        assertEquals(rs.next(), true, "should be a record")
        assertEquals(rs.next(), false, "should be only one record")
    }

    @Test
    fun `should get value`() {
        val url = "jdbc:arrow-flight://127.0.0.1:50050"
        val driver = FlightSqlJdbcDriver()
        val con = driver.connect(url, Properties())
        val stmt = con.createStatement()
        val rs = stmt.executeQuery("SELECT 'keep alive'")
        assertEquals(rs.next(), true, "should be a record")
        val actual = rs.getString(1)
        assertEquals(actual, "keep alive", "should return the value from the select statement")
    }
}