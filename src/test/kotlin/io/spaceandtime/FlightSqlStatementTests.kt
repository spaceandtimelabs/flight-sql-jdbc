package io.spaceandtime

import org.apache.arrow.flight.sql.impl.FlightSql
import org.junit.jupiter.api.Test
import java.sql.DriverManager
import java.util.Properties
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class FlightSqlStatementTests {
    @Test
    fun `should get version`() {
        val url = "jdbc:arrow-flight://127.0.0.1:50050"
        val driver = FlightSqlJdbcDriver()
        val props = Properties()
        props["user"] = "admin"
        props["password"] = "password"
        val con = driver.connect(url, props)
        val stmt = con.createStatement()
        val actual = stmt.execute("SELECT 'keep alive'")
        assertEquals(actual, true, "select should return a row")
    }

    @Test
    fun `should get and set max rows`() {
        val expected = 10
        val url = "jdbc:arrow-flight://127.0.0.1:50050"
        val driver = FlightSqlJdbcDriver()
        val con = driver.connect(url, Properties())
        val stmt = con.createStatement()
        stmt.maxRows = expected
        val actual = stmt.maxRows
        assertEquals(actual, expected, "select return what was set")
    }

    @Test
    fun `should set and get fetch size`() {
        val expected = 10
        val url = "jdbc:arrow-flight://127.0.0.1:50050"
        val driver = FlightSqlJdbcDriver()
        val con = driver.connect(url, Properties())
        val stmt = con.createStatement()
        stmt.fetchSize = expected
        val actual = stmt.fetchSize
        assertEquals(actual, expected, "select return what was set")
    }

    @Test
    fun `should execute query`() {
        val url = "jdbc:arrow-flight://127.0.0.1:50050"
        val driver = FlightSqlJdbcDriver()
        val con = driver.connect(url, Properties())
        val stmt = con.createStatement()
        val rs = stmt.executeQuery("SELECT 'keep alive'")
        assertNotNull(rs, "should return a ResultSet")
    }

    @Test
    fun `should not have multiple active ResultSets`() {
        val url = "jdbc:arrow-flight://127.0.0.1:50050"
        val driver = FlightSqlJdbcDriver()
        val con = driver.connect(url, Properties())
        val stmt = con.createStatement()
        val actual = stmt.moreResults
        assertFalse(actual, "should not have MARS")
    }

    @Test
    fun `should return update count`() {
        val url = "jdbc:arrow-flight://127.0.0.1:50050"
        val driver = FlightSqlJdbcDriver()
        val con = driver.connect(url, Properties())
        val stmt = con.createStatement()
        val actual = stmt.updateCount
        assertEquals(actual, -1, "should not be doing updates")
    }
}