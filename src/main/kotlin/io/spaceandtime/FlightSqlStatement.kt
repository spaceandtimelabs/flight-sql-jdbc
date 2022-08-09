package io.spaceandtime

import org.apache.arrow.flight.FlightClient
import org.apache.arrow.flight.Location
import org.apache.arrow.flight.grpc.CredentialCallOption
import org.apache.arrow.flight.sql.FlightSqlClient
import org.apache.arrow.memory.RootAllocator
import org.apache.arrow.vector.VarCharVector
import org.slf4j.LoggerFactory
import java.sql.Connection
import java.sql.ResultSet
import java.sql.SQLWarning
import java.sql.Statement

class FlightSqlStatement(
    val sqlClient: FlightSqlClient,
    val token: CredentialCallOption
) : Statement {
    val log = LoggerFactory.getLogger(this.javaClass.name)
    var maxRowCount = 500
    var _fetchSize = 500
    val vals = mutableListOf<String>()

    override fun <T : Any?> unwrap(p0: Class<T>?): T {
        log.info("unwrap")
        TODO("Implement unwrap()")
    }

    override fun isWrapperFor(p0: Class<*>?): Boolean {
        log.info("isWrapperFor")
        TODO("Implement isWrapperFor()")
    }

    override fun close() {
        log.info("close")
        TODO("Implement close()")
    }

    override fun executeQuery(sql: String?): ResultSet {
        log.info("executeQuery() $sql")
        val info = sqlClient.execute(sql, token)

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
                    vals.add(value)
                }
            }
        }

        return FlightSqlResultSet(vals)
    }

    override fun executeUpdate(p0: String?): Int {
        log.info("executeUpdate")
        TODO("Implement executeUpdate2()")
    }

    override fun executeUpdate(p0: String?, p1: Int): Int {
        log.info("executeUpdate")
        TODO("Implement executeUpdate3()")
    }

    override fun executeUpdate(p0: String?, p1: IntArray?): Int {
        log.info("executeUpdate")
        TODO("Implement executeUpdate4()")
    }

    override fun executeUpdate(p0: String?, p1: Array<out String>?): Int {
        log.info("executeUpdate")
        TODO("Implement executeUpdate5()")
    }

    override fun getMaxFieldSize(): Int {
        log.info("getMaxFieldSize")
        TODO("Implement getMaxFieldSize()")
    }

    override fun setMaxFieldSize(p0: Int) {
        log.info("setMaxFieldSize")
        TODO("Implement setMaxFieldSize()")
    }

    override fun getMaxRows(): Int {
        log.info("getMaxRows")
        return maxRowCount
    }

    override fun setMaxRows(count: Int) {
        log.info("setMaxRows: $count")
        maxRowCount = count
    }

    override fun setEscapeProcessing(p0: Boolean) {
        log.info("setEscapeProcessing($p0)")
    }

    override fun getQueryTimeout(): Int {
        log.info("getQueryTimeout")
        TODO("Implement getQueryTimeout()")
    }

    override fun setQueryTimeout(p0: Int) {
        log.info("setQueryTimeout")
        TODO("Implement setQueryTimeout()")
    }

    override fun cancel() {
        log.info("cancel")
        TODO("Implement cancel()")
    }

    override fun getWarnings(): SQLWarning {
        log.info("getWarnings")
        TODO("Implement getWarnings()")
    }

    override fun clearWarnings() {
        log.info("clearWarnings")
        TODO("Implement clearWarnings()")
    }

    override fun setCursorName(p0: String?) {
        log.info("setCursorName")
        TODO("Implement setCursorName()")
    }

    override fun execute(sql: String?): Boolean {
        log.info("execute($sql)") // Execute SQL: SELECT 'keep alive'
        val info = sqlClient.execute(sql, token)

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
                    vals.add(value)
                }
            }
        }

        return true
    }

    override fun execute(p0: String?, p1: Int): Boolean {
        log.info("execute($p0, $p1)")
        TODO("Implement execute2()")
    }

    override fun execute(p0: String?, p1: IntArray?): Boolean {
        log.info("execute($p0, $p1)")
        TODO("Implement execute3()")
    }

    override fun execute(p0: String?, p1: Array<out String>?): Boolean {
        log.info("execute($p0, $p1)")
        TODO("Implement execute4()")
    }

    override fun getResultSet(): ResultSet? {
        log.info("getResultSet")
        return FlightSqlResultSet(vals)
    }

    override fun getUpdateCount(): Int {
        log.info("getUpdateCount()")
        return -1
    }

    override fun getMoreResults(): Boolean {
        log.info("getMoreResults")
        return false
    }

    override fun getMoreResults(p0: Int): Boolean {
        log.info("getMoreResults")
        TODO("Implement getMoreResults2(${p0})")
    }

    override fun setFetchDirection(p0: Int) {
        log.info("setFetchDirection")
        TODO("Implement setFetchDirection(${p0})")
    }

    override fun getFetchDirection(): Int {
        log.info("getFetchDirection")
        TODO("Implement getFetchDirection()")
    }

    override fun setFetchSize(value: Int) {
        log.info("setFetchSize() $value")
        _fetchSize = value
    }

    override fun getFetchSize(): Int {
        log.info("getFetchSize")
        return _fetchSize
    }

    override fun getResultSetConcurrency(): Int {
        log.info("getResultSetConcurrency")
        TODO("Implement getResultSetConcurrency()")
    }

    override fun getResultSetType(): Int {
        log.info("getResultSetType")
        TODO("Implement getResultSetType()")
    }

    override fun addBatch(p0: String?) {
        log.info("addBatch")
        TODO("Implement addBatch()")
    }

    override fun clearBatch() {
        log.info("clearBatch")
        TODO("Implement clearBatch()")
    }

    override fun executeBatch(): IntArray {
        log.info("executeBatch")
        TODO("Implement executeBatch()")
    }

    override fun getConnection(): Connection {
        log.info("getConnection")
        TODO("Implement getConnection()")
    }

    override fun getGeneratedKeys(): ResultSet {
        log.info("getGeneratedKeys")
        TODO("Implement getGeneratedKeys()")
    }

    override fun getResultSetHoldability(): Int {
        log.info("getResultSetHoldability")
        TODO("Implement getResultSetHoldability()")
    }

    override fun isClosed(): Boolean {
        log.info("isClosed")
        TODO("Implement isClosed()")
    }

    override fun setPoolable(p0: Boolean) {
        log.info("setPoolable")
        TODO("Implement setPoolable()")
    }

    override fun isPoolable(): Boolean {
        log.info("isPoolable")
        TODO("Implement isPoolable()")
    }

    override fun closeOnCompletion() {
        log.info("closeOnCompletion")
        TODO("Implement closeOnCompletion()")
    }

    override fun isCloseOnCompletion(): Boolean {
        log.info("isCloseOnCompletion")
        TODO("Implement isCloseOnCompletion()")
    }
}