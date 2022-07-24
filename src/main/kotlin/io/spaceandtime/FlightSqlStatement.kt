package io.spaceandtime

import org.apache.arrow.flight.FlightClient
import org.apache.arrow.flight.Location
import org.apache.arrow.flight.sql.FlightSqlClient
import org.apache.arrow.memory.RootAllocator
import org.apache.arrow.vector.VarCharVector
import org.slf4j.LoggerFactory
import java.sql.Connection
import java.sql.ResultSet
import java.sql.SQLWarning
import java.sql.Statement

class FlightSqlStatement(val sqlClient: FlightSqlClient) : Statement {
    val log = LoggerFactory.getLogger(this.javaClass.name)

    override fun <T : Any?> unwrap(p0: Class<T>?): T {
        TODO("Implement unwrap()")
    }

    override fun isWrapperFor(p0: Class<*>?): Boolean {
        TODO("Implement isWrapperFor()")
    }

    override fun close() {
        TODO("Implement close()")
    }

    override fun executeQuery(p0: String?): ResultSet {
        TODO("Implement executeQuery1()")
    }

    override fun executeUpdate(p0: String?): Int {
        TODO("Implement executeUpdate2()")
    }

    override fun executeUpdate(p0: String?, p1: Int): Int {
        TODO("Implement executeUpdate3()")
    }

    override fun executeUpdate(p0: String?, p1: IntArray?): Int {
        TODO("Implement executeUpdate4()")
    }

    override fun executeUpdate(p0: String?, p1: Array<out String>?): Int {
        TODO("Implement executeUpdate5()")
    }

    override fun getMaxFieldSize(): Int {
        TODO("Implement getMaxFieldSize()")
    }

    override fun setMaxFieldSize(p0: Int) {
        TODO("Implement setMaxFieldSize()")
    }

    override fun getMaxRows(): Int {
        TODO("Implement getMaxRows()")
    }

    override fun setMaxRows(p0: Int) {
        TODO("Implement setMaxRows()")
    }

    override fun setEscapeProcessing(p0: Boolean) {
        TODO("Implement setEscapeProcessing()")
    }

    override fun getQueryTimeout(): Int {
        TODO("Implement getQueryTimeout()")
    }

    override fun setQueryTimeout(p0: Int) {
        TODO("Implement setQueryTimeout()")
    }

    override fun cancel() {
        TODO("Implement cancel()")
    }

    override fun getWarnings(): SQLWarning {
        TODO("Implement getWarnings()")
    }

    override fun clearWarnings() {
        TODO("Implement clearWarnings()")
    }

    override fun setCursorName(p0: String?) {
        TODO("Implement setCursorName()")
    }

    override fun execute(sql: String?): Boolean {
        log.info("Execute SQL: $sql") // Execute SQL: SELECT 'keep alive'
        val info = sqlClient.execute(sql)

        for(ep in info.endpoints) {
            for(loc in ep.locations) {
                val allocator = RootAllocator()
                val client = FlightClient.builder()
                    .allocator(allocator)
                    .location(loc)
                    .build()
//        client.authenticateBasic(user, password)
                val stream = client.getStream(ep.ticket)
                while(stream.next()) {
                    val vector = stream.root!!.fieldVectors[0] as VarCharVector
                    val value = String(vector[0])
                    log.info("Got response: $value")
                }
            }
        }

        return false
    }

    override fun execute(p0: String?, p1: Int): Boolean {
        TODO("Implement execute2()")
    }

    override fun execute(p0: String?, p1: IntArray?): Boolean {
        TODO("Implement execute3()")
    }

    override fun execute(p0: String?, p1: Array<out String>?): Boolean {
        TODO("Implement execute4()")
    }

    override fun getResultSet(): ResultSet {
        TODO("Implement getResultSet()")
    }

    override fun getUpdateCount(): Int {
        TODO("Implement getUpdateCount()")
    }

    override fun getMoreResults(): Boolean {
        TODO("Implement getMoreResults()")
    }

    override fun getMoreResults(p0: Int): Boolean {
        TODO("Implement getMoreResults()")
    }

    override fun setFetchDirection(p0: Int) {
        TODO("Implement setFetchDirection()")
    }

    override fun getFetchDirection(): Int {
        TODO("Implement getFetchDirection()")
    }

    override fun setFetchSize(p0: Int) {
        TODO("Implement setFetchSize()")
    }

    override fun getFetchSize(): Int {
        TODO("Implement getFetchSize()")
    }

    override fun getResultSetConcurrency(): Int {
        TODO("Implement getResultSetConcurrency()")
    }

    override fun getResultSetType(): Int {
        TODO("Implement getResultSetType()")
    }

    override fun addBatch(p0: String?) {
        TODO("Implement addBatch()")
    }

    override fun clearBatch() {
        TODO("Implement clearBatch()")
    }

    override fun executeBatch(): IntArray {
        TODO("Implement executeBatch()")
    }

    override fun getConnection(): Connection {
        TODO("Implement getConnection()")
    }

    override fun getGeneratedKeys(): ResultSet {
        TODO("Implement getGeneratedKeys()")
    }

    override fun getResultSetHoldability(): Int {
        TODO("Implement getResultSetHoldability()")
    }

    override fun isClosed(): Boolean {
        TODO("Implement isClosed()")
    }

    override fun setPoolable(p0: Boolean) {
        TODO("Implement setPoolable()")
    }

    override fun isPoolable(): Boolean {
        TODO("Implement isPoolable()")
    }

    override fun closeOnCompletion() {
        TODO("Implement closeOnCompletion()")
    }

    override fun isCloseOnCompletion(): Boolean {
        TODO("Implement isCloseOnCompletion()")
    }
}