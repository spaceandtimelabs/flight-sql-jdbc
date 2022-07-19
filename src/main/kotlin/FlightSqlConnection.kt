import org.slf4j.LoggerFactory
import java.sql.*
import java.util.*
import java.util.concurrent.Executor

class FlightSqlConnection : Connection {
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

    override fun createStatement(): Statement {
        TODO("Implement createStatement()")
    }

    override fun createStatement(p0: Int, p1: Int): Statement {
        TODO("Implement createStatement()")
    }

    override fun createStatement(p0: Int, p1: Int, p2: Int): Statement {
        TODO("Implement createStatement()")
    }

    override fun prepareStatement(p0: String?): PreparedStatement {
        TODO("Implement prepareStatement()")
    }

    override fun prepareStatement(p0: String?, p1: Int, p2: Int): PreparedStatement {
        TODO("Implement prepareStatement()")
    }

    override fun prepareStatement(p0: String?, p1: Int, p2: Int, p3: Int): PreparedStatement {
        TODO("Implement prepareStatement()")
    }

    override fun prepareStatement(p0: String?, p1: Int): PreparedStatement {
        TODO("Implement prepareStatement()")
    }

    override fun prepareStatement(p0: String?, p1: IntArray?): PreparedStatement {
        TODO("Implement prepareStatement()")
    }

    override fun prepareStatement(p0: String?, p1: Array<out String>?): PreparedStatement {
        TODO("Implement prepareStatement()")
    }

    override fun prepareCall(p0: String?): CallableStatement {
        TODO("Implement prepareCall()")
    }

    override fun prepareCall(p0: String?, p1: Int, p2: Int): CallableStatement {
        TODO("Implement prepareCall()")
    }

    override fun prepareCall(p0: String?, p1: Int, p2: Int, p3: Int): CallableStatement {
        TODO("Implement prepareCall()")
    }

    override fun nativeSQL(p0: String?): String {
        TODO("Implement nativeSQL()")
    }

    override fun setAutoCommit(p0: Boolean) {
        TODO("Implement setAutoCommit()")
    }

    override fun getAutoCommit(): Boolean {
        TODO("Implement getAutoCommit()")
    }

    override fun commit() {
        TODO("Implement commit()")
    }

    override fun rollback() {
        TODO("Implement rollback()")
    }

    override fun rollback(p0: Savepoint?) {
        TODO("Implement rollback()")
    }

    override fun isClosed(): Boolean {
        return false
    }

    override fun getMetaData(): DatabaseMetaData {
        log.info("getMetaData")
        val md = FlightSqlMetadata()
        return md
    }

    override fun setReadOnly(p0: Boolean) {
        TODO("Implement setReadOnly()")
    }

    override fun isReadOnly(): Boolean {
        TODO("Implement isReadOnly()")
    }

    override fun setCatalog(p0: String?) {
        TODO("Implement setCatalog()")
    }

    override fun getCatalog(): String {
        TODO("Implement getCatalog()")
    }

    override fun setTransactionIsolation(p0: Int) {
        TODO("Implement setTransactionIsolation()")
    }

    override fun getTransactionIsolation(): Int {
        TODO("Implement getTransactionIsolation()")
    }

    override fun getWarnings(): SQLWarning {
        return SQLWarning() // TODO: real impl
    }

    override fun clearWarnings() {
        // TODO: real impl
    }

    override fun getTypeMap(): MutableMap<String, Class<*>> {
        TODO("Implement getTypeMap()")
    }

    override fun setTypeMap(p0: MutableMap<String, Class<*>>?) {
        TODO("Implement setTypeMap()")
    }

    override fun setHoldability(p0: Int) {
        TODO("Implement setHoldability()")
    }

    override fun getHoldability(): Int {
        TODO("Implement getHoldability()")
    }

    override fun setSavepoint(): Savepoint {
        TODO("Implement setSavepoint()")
    }

    override fun setSavepoint(p0: String?): Savepoint {
        TODO("Implement setSavepoint()")
    }

    override fun releaseSavepoint(p0: Savepoint?) {
        TODO("Implement releaseSavepoint()")
    }

    override fun createClob(): Clob {
        TODO("Implement createClob()")
    }

    override fun createBlob(): Blob {
        TODO("Implement createBlob()")
    }

    override fun createNClob(): NClob {
        TODO("Implement createNClob()")
    }

    override fun createSQLXML(): SQLXML {
        TODO("Implement createSQLXML()")
    }

    override fun isValid(p0: Int): Boolean {
        TODO("Implement isValid()")
    }

    override fun setClientInfo(p0: String?, p1: String?) {
        TODO("Implement setClientInfo()")
    }

    override fun setClientInfo(p0: Properties?) {
        TODO("Implement setClientInfo()")
    }

    override fun getClientInfo(p0: String?): String {
        TODO("Implement getClientInfo()")
    }

    override fun getClientInfo(): Properties {
        TODO("Implement getClientInfo()")
    }

    override fun createArrayOf(p0: String?, p1: Array<out Any>?): java.sql.Array {
        TODO("Implement createArrayOf()")
    }

    override fun createStruct(p0: String?, p1: Array<out Any>?): Struct {
        TODO("Implement createStruct()")
    }

    override fun setSchema(p0: String?) {
        TODO("Implement setSchema()")
    }

    override fun getSchema(): String {
        TODO("Implement getSchema()")
    }

    override fun abort(p0: Executor?) {
        TODO("Implement abort()")
    }

    override fun setNetworkTimeout(p0: Executor?, p1: Int) {
        TODO("Implement setNetworkTimeout()")
    }

    override fun getNetworkTimeout(): Int {
        TODO("Implement getNetworkTimeout()")
    }
}