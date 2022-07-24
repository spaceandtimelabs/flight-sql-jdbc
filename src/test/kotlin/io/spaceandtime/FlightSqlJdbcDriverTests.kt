package io.spaceandtime

import org.junit.jupiter.api.Test
import java.sql.DriverManager
import kotlin.test.assertEquals
import kotlin.test.assertNotNull

class FlightSqlJdbcDriverTests {
    @Test
    fun `select should return a value`() {
        DriverManager.registerDriver(FlightSqlJdbcDriver())

        val url = "flightsql://127.0.0.1:50050" // ballista
//        val url = "flightsql://127.0.0.1:32010" // dremio
        val user = "dremio"
        val password = "dremio123"
        val con = DriverManager.getConnection(url, user, password)
        val stmt = con.createStatement()
        val result = stmt.execute("SELECT 'keep alive'")

        assertEquals(result, true)
    }
}