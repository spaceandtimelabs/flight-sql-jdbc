package io.spaceandtime

import org.junit.jupiter.api.Test
import java.sql.Connection
import java.sql.DriverManager
import java.util.Properties
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertNull
import kotlin.test.assertTrue

class FlightSqlConnectionTests {
    @Test
    fun `should get metadata`() {
        val url = "jdbc:arrow-flight://127.0.0.1:50050"
        val driver = FlightSqlJdbcDriver()
        val con = driver.connect(url, Properties())
        val actual = con.metaData
        assertNotNull(actual, "metadata should be returned")
    }

    @Test
    fun `should return transaction isolation level`() {
        val url = "jdbc:arrow-flight://127.0.0.1:50050"
        val driver = FlightSqlJdbcDriver()
        val con = driver.connect(url, Properties())
        val actual = con.transactionIsolation
        assertEquals(actual, Connection.TRANSACTION_READ_UNCOMMITTED, "isolation level should be returned")
    }

    @Test
    fun `should return no warnings`() {
        val url = "jdbc:arrow-flight://127.0.0.1:50050"
        val driver = FlightSqlJdbcDriver()
        val con = driver.connect(url, Properties())
        val actual = con.warnings
        assertNull(actual, "no warnings should be returned")
    }

    @Test
    fun `should create a statement`() {
        val url = "jdbc:arrow-flight://127.0.0.1:50050"
        val driver = FlightSqlJdbcDriver()
        val con = driver.connect(url, Properties())
        val actual = con.createStatement()
        assertNotNull(actual, "a statement should be returned")
    }

    @Test
    fun `should get auto commit status`() {
        val url = "jdbc:arrow-flight://127.0.0.1:50050"
        val driver = FlightSqlJdbcDriver()
        val con = driver.connect(url, Properties())
        val actual = con.autoCommit
        assertEquals(actual, true, "should return correct auto commit status")
    }
}