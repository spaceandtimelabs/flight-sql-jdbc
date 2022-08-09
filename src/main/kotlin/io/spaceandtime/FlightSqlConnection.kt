package io.spaceandtime

import org.apache.arrow.flight.grpc.CredentialCallOption
import org.apache.arrow.flight.sql.FlightSqlClient
import org.slf4j.LoggerFactory
import java.sql.*
import java.util.*
import java.util.concurrent.Executor

class FlightSqlConnection(
    val sqlClient: FlightSqlClient,
    val token: CredentialCallOption
) : Connection {
    val log = LoggerFactory.getLogger(this.javaClass.name)

    init {
        log.info("init")
    }

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

    override fun createStatement(): Statement {
        log.info("createStatement()")
        return FlightSqlStatement(sqlClient, token)
    }

    override fun createStatement(p0: Int, p1: Int): Statement {
        log.info("createStatement(0, 1)")
        TODO("Implement createStatement2()")
    }

    override fun createStatement(p0: Int, p1: Int, p2: Int): Statement {
        log.info("createStatement(0, 1, 2)")
        TODO("Implement createStatement3()")
    }

    override fun prepareStatement(p0: String?): PreparedStatement {
        log.info("prepareStatement")
        TODO("Implement prepareStatement()")
    }

    override fun prepareStatement(p0: String?, p1: Int, p2: Int): PreparedStatement {
        log.info("prepareStatement(0, 1, 2)")
        TODO("Implement prepareStatement()")
    }

    override fun prepareStatement(p0: String?, p1: Int, p2: Int, p3: Int): PreparedStatement {
        log.info("prepareStatement(0, 1, 2, 3)")
        TODO("Implement prepareStatement()")
    }

    override fun prepareStatement(p0: String?, p1: Int): PreparedStatement {
        log.info("prepareStatement(String, Int)")
        TODO("Implement prepareStatement()")
    }

    override fun prepareStatement(p0: String?, p1: IntArray?): PreparedStatement {
        log.info("prepareStatement(String, IntArray)")
        TODO("Implement prepareStatement()")
    }

    override fun prepareStatement(p0: String?, p1: Array<out String>?): PreparedStatement {
        log.info("prepareStatement(String, Out String Array)")
        TODO("Implement prepareStatement()")
    }

    override fun prepareCall(p0: String?): CallableStatement {
        log.info("prepareCall(0)")
        TODO("Implement prepareCall()")
    }

    override fun prepareCall(p0: String?, p1: Int, p2: Int): CallableStatement {
        log.info("prepareCall(0, 1, 2)")
        TODO("Implement prepareCall()")
    }

    override fun prepareCall(p0: String?, p1: Int, p2: Int, p3: Int): CallableStatement {
        log.info("prepareCall(0, 1, 2, 3)")
        TODO("Implement prepareCall()")
    }

    override fun nativeSQL(p0: String?): String {
        log.info("nativeSQL(0)")
        TODO("Implement nativeSQL()")
    }

    override fun setAutoCommit(p0: Boolean) {
        log.info("setAutoCommit(0)")
        TODO("Implement setAutoCommit()")
    }

    override fun getAutoCommit(): Boolean {
        log.info("getAutoCommit")
        return true
    }

    override fun commit() {
        log.info("commit")
        TODO("Implement commit()")
    }

    override fun rollback() {
        log.info("rollback")
        TODO("Implement rollback()")
    }

    override fun rollback(p0: Savepoint?) {
        log.info("rollback(0)")
        TODO("Implement rollback()")
    }

    override fun isClosed(): Boolean {
        log.info("isClosed")
        return false
    }

    override fun getMetaData(): DatabaseMetaData {
        log.info("getMetaData")
        return FlightSqlMetadata()
    }

    override fun setReadOnly(p0: Boolean) {
        log.info("setReadOnly")
        TODO("Implement setReadOnly()")
    }

    override fun isReadOnly(): Boolean {
        log.info("isReadOnly")
        TODO("Implement isReadOnly()")
    }

    override fun setCatalog(p0: String?) {
        log.info("setCatalog")
        TODO("Implement setCatalog()")
    }

    override fun getCatalog(): String {
        log.info("getCatalog")
        TODO("Implement getCatalog()")
    }

    override fun setTransactionIsolation(p0: Int) {
        log.info("setTransactionIsolation(0)")
        TODO("Implement setTransactionIsolation()")
    }

    override fun getTransactionIsolation(): Int {
        log.info("getTransactionIsolation")
        return Connection.TRANSACTION_READ_UNCOMMITTED
    }

    override fun getWarnings(): SQLWarning? {
        log.info("getWarnings")
        return null // TODO: real impl
    }

    override fun clearWarnings() {
        log.info("clearWarnings")
        // TODO: real impl
    }

    override fun getTypeMap(): MutableMap<String, Class<*>> {
        log.info("getTypeMap")
        TODO("Implement getTypeMap()")
    }

    override fun setTypeMap(p0: MutableMap<String, Class<*>>?) {
        log.info("setTypeMap")
        TODO("Implement setTypeMap()")
    }

    override fun setHoldability(p0: Int) {
        log.info("setHoldability")
        TODO("Implement setHoldability()")
    }

    override fun getHoldability(): Int {
        log.info("getHoldability")
        TODO("Implement getHoldability()")
    }

    override fun setSavepoint(): Savepoint {
        log.info("setSavepoint")
        TODO("Implement setSavepoint()")
    }

    override fun setSavepoint(p0: String?): Savepoint {
        log.info("setSavepoint")
        TODO("Implement setSavepoint()")
    }

    override fun releaseSavepoint(p0: Savepoint?) {
        log.info("releaseSavepoint")
        TODO("Implement releaseSavepoint()")
    }

    override fun createClob(): Clob {
        log.info("createClob")
        TODO("Implement createClob()")
    }

    override fun createBlob(): Blob {
        log.info("createBlob")
        TODO("Implement createBlob()")
    }

    override fun createNClob(): NClob {
        log.info("createNClob")
        TODO("Implement createNClob()")
    }

    override fun createSQLXML(): SQLXML {
        log.info("createSQLXML")
        TODO("Implement createSQLXML()")
    }

    override fun isValid(p0: Int): Boolean {
        log.info("isValid")
        TODO("Implement isValid()")
    }

    override fun setClientInfo(p0: String?, p1: String?) {
        log.info("setClientInfo")
        TODO("Implement setClientInfo()")
    }

    override fun setClientInfo(p0: Properties?) {
        log.info("setClientInfo")
        TODO("Implement setClientInfo()")
    }

    override fun getClientInfo(p0: String?): String {
        log.info("getClientInfo")
        TODO("Implement getClientInfo()")
    }

    override fun getClientInfo(): Properties {
        log.info("getClientInfo")
        TODO("Implement getClientInfo()")
    }

    override fun createArrayOf(p0: String?, p1: Array<out Any>?): java.sql.Array {
        log.info("createArrayOf")
        TODO("Implement createArrayOf()")
    }

    override fun createStruct(p0: String?, p1: Array<out Any>?): Struct {
        log.info("createStruct")
        TODO("Implement createStruct()")
    }

    override fun setSchema(p0: String?) {
        log.info("setSchema")
        TODO("Implement setSchema()")
    }

    override fun getSchema(): String {
        log.info("getSchema")
        TODO("Implement getSchema()")
    }

    override fun abort(p0: Executor?) {
        log.info("abort")
        TODO("Implement abort()")
    }

    override fun setNetworkTimeout(p0: Executor?, p1: Int) {
        log.info("setNetworkTimeout")
        TODO("Implement setNetworkTimeout()")
    }

    override fun getNetworkTimeout(): Int {
        log.info("getNetworkTimeout")
        TODO("Implement getNetworkTimeout()")
    }
}