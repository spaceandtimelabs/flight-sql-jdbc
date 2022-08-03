package io.spaceandtime

import org.junit.jupiter.api.Test
import java.sql.DriverManager
import java.util.*
import kotlin.test.assertEquals
import kotlin.test.assertFalse
import kotlin.test.assertNotNull

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
    @Throws(Exception::class)
    fun testBallista() {
        var sql = """create external table customer STORED AS CSV WITH HEADER ROW
    LOCATION '/home/bgardner/workspace/ballista/arrow-datafusion/datafusion/core/tests/tpch-csv/customer.csv';
"""
        val url = "jdbc:arrow-flight://127.0.0.1:50050"
        val driver = FlightSqlJdbcDriver()
        val props = Properties()
        props["user"] = "admin"
        props["password"] = "password"
        val con = driver.connect(url, props)
        val stmt = con.createStatement()
        var result = stmt.execute(sql)
//        assertEquals(result, false)
        val updateCount = stmt.updateCount
//        assertEquals(updateCount, 0)
        sql = "select top 1 c_name from customer order by c_name"
        result = stmt.execute(sql)
        assertEquals(result, true)
        val rs = stmt.resultSet
        var count = 0
        while (rs.next()) {
            val c_name = rs.getString(1)
            assertEquals(c_name, "Customer#000000002")
            count++
        }
        assertEquals(count, 1)
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