package io.spaceandtime

import org.apache.arrow.flight.sql.impl.FlightSql
import org.junit.jupiter.api.Test
import java.sql.DriverManager
import java.sql.Types.TINYINT
import java.sql.Types.VARCHAR
import java.util.Properties
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class FlightSqlResultSetMetaDataTests {
    @Test
    fun `should get metadata`() {
        val url = "jdbc:arrow-flight://127.0.0.1:50050"
        val driver = FlightSqlJdbcDriver()
        val con = driver.connect(url, Properties())
        val stmt = con.createStatement()
        val rs = stmt.executeQuery("SELECT 'keep alive'")
        val md = rs.metaData
        val actual = md.columnCount
        assertEquals(actual, 1, "results should have one column")
    }

    @Test
    fun `should get column type`() {
        val url = "jdbc:arrow-flight://127.0.0.1:50050"
        val driver = FlightSqlJdbcDriver()
        val con = driver.connect(url, Properties())
        val stmt = con.createStatement()
        val rs = stmt.executeQuery("SELECT 'keep alive'")
        val md = rs.metaData
        val actual = md.getColumnType(1)
        assertEquals(actual, VARCHAR, "column 1 should be a VARCHAR")
    }

    @Test
    fun `should get column type name`() {
        val url = "jdbc:arrow-flight://127.0.0.1:50050"
        val driver = FlightSqlJdbcDriver()
        val con = driver.connect(url, Properties())
        val stmt = con.createStatement()
        val rs = stmt.executeQuery("SELECT 'keep alive'")
        val md = rs.metaData
        val actual = md.getColumnTypeName(1)
        assertEquals(actual, "VARCHAR", "column 1 should be a VARCHAR")
    }

    @Test
    fun `should get column class name`() {
        val url = "jdbc:arrow-flight://127.0.0.1:50050"
        val driver = FlightSqlJdbcDriver()
        val con = driver.connect(url, Properties())
        val stmt = con.createStatement()
        val rs = stmt.executeQuery("SELECT 'keep alive'")
        val md = rs.metaData
        val actual = md.getColumnClassName(1)
        assertEquals(actual, "java.lang.String", "column 1 should be a String")
    }
}