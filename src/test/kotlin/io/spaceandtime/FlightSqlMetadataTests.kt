package io.spaceandtime

import org.apache.arrow.flight.sql.impl.FlightSql
import org.junit.jupiter.api.Test
import java.sql.DriverManager
import java.util.Properties
import kotlin.test.assertEquals
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class FlightSqlMetadataTests {
    @Test
    fun `should get version`() {
        val actual = FlightSqlMetadata().driverVersion
        assertEquals(actual, "1.6.21-release-334(1.6.21)", "metadata should be returned")
    }

    @Test
    fun `should get name`() {
        val actual = FlightSqlMetadata().driverName
        assertEquals(actual, "Apache Arrow Flight SQL JDBC Driver", "metadata should be returned")
    }

    @Test
    fun `should get product name`() {
        val actual = FlightSqlMetadata().databaseProductName
        assertEquals(actual, "Apache Arrow Flight SQL JDBC Driver", "metadata should be returned")
    }
}