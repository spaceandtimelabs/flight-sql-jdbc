package io.spaceandtime

import org.junit.jupiter.api.Test
import java.sql.DriverManager
import kotlin.test.assertNotNull

class FlightSqlJdbcDriverTests {
    @Test
    fun `connect should succeed`() {
        DriverManager.registerDriver(FlightSqlJdbcDriver())

        val url = "flightsql://127.0.0.1:32010"
        val user = "dremio"
        val password = "dremio11"
        val con = DriverManager.getConnection(url, user, password)

        assertNotNull(con, "Expected a Connection object")
    }
}