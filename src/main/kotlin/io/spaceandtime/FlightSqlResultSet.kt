package io.spaceandtime

import org.slf4j.LoggerFactory
import java.io.InputStream
import java.io.Reader
import java.math.BigDecimal
import java.net.URL
import java.sql.*
import java.sql.Array
import java.sql.Date
import java.util.*

class FlightSqlResultSet(
    val vals: List<String>
) : ResultSet {
    val log = LoggerFactory.getLogger(this.javaClass.name)
    var cursorPos = -1

    override fun <T : Any?> unwrap(p0: Class<T>?): T {
        TODO("Implement unwrap")
    }

    override fun isWrapperFor(p0: Class<*>?): Boolean {
        TODO("Implement isWrapperFor")
    }

    override fun close() {
        TODO("Implement close")
    }

    override fun next(): Boolean {
        log.info("next()")
        cursorPos++
        return cursorPos < vals.size
    }

    override fun wasNull(): Boolean {
        TODO("Implement wasNull")
    }

    override fun getString(colIdx: Int): String {
        log.info("getString()")
        return vals[cursorPos]
    }

    override fun getString(p0: String?): String {
        TODO("Implement getString(String)")
    }

    override fun getBoolean(p0: Int): Boolean {
        TODO("Implement getBoolean")
    }

    override fun getBoolean(p0: String?): Boolean {
        TODO("Implement getBoolean")
    }

    override fun getByte(p0: Int): Byte {
        TODO("Implement getByte")
    }

    override fun getByte(p0: String?): Byte {
        TODO("Implement getByte")
    }

    override fun getShort(p0: Int): Short {
        TODO("Implement getShort")
    }

    override fun getShort(p0: String?): Short {
        TODO("Implement getShort")
    }

    override fun getInt(p0: Int): Int {
        TODO("Implement getInt")
    }

    override fun getInt(p0: String?): Int {
        TODO("Implement getInt")
    }

    override fun getLong(p0: Int): Long {
        TODO("Implement getLong")
    }

    override fun getLong(p0: String?): Long {
        TODO("Implement getLong")
    }

    override fun getFloat(p0: Int): Float {
        TODO("Implement getFloat")
    }

    override fun getFloat(p0: String?): Float {
        TODO("Implement getFloat")
    }

    override fun getDouble(p0: Int): Double {
        TODO("Implement getDouble")
    }

    override fun getDouble(p0: String?): Double {
        TODO("Implement getDouble")
    }

    override fun getBigDecimal(p0: Int, p1: Int): BigDecimal {
        TODO("Implement getBigDecimal")
    }

    override fun getBigDecimal(p0: String?, p1: Int): BigDecimal {
        TODO("Implement getBigDecimal")
    }

    override fun getBigDecimal(p0: Int): BigDecimal {
        TODO("Implement getBigDecimal")
    }

    override fun getBigDecimal(p0: String?): BigDecimal {
        TODO("Implement getBigDecimal")
    }

    override fun getBytes(p0: Int): ByteArray {
        TODO("Implement getBytes")
    }

    override fun getBytes(p0: String?): ByteArray {
        TODO("Implement getBytes")
    }

    override fun getDate(p0: Int): Date {
        TODO("Implement getDate")
    }

    override fun getDate(p0: String?): Date {
        TODO("Implement getDate")
    }

    override fun getDate(p0: Int, p1: Calendar?): Date {
        TODO("Implement getDate")
    }

    override fun getDate(p0: String?, p1: Calendar?): Date {
        TODO("Implement getDate")
    }

    override fun getTime(p0: Int): Time {
        TODO("Implement getTime")
    }

    override fun getTime(p0: String?): Time {
        TODO("Implement getTime")
    }

    override fun getTime(p0: Int, p1: Calendar?): Time {
        TODO("Implement getTime")
    }

    override fun getTime(p0: String?, p1: Calendar?): Time {
        TODO("Implement getTime")
    }

    override fun getTimestamp(p0: Int): Timestamp {
        TODO("Implement getTimestamp")
    }

    override fun getTimestamp(p0: String?): Timestamp {
        TODO("Implement getTimestamp")
    }

    override fun getTimestamp(p0: Int, p1: Calendar?): Timestamp {
        TODO("Implement getTimestamp")
    }

    override fun getTimestamp(p0: String?, p1: Calendar?): Timestamp {
        TODO("Implement getTimestamp")
    }

    override fun getAsciiStream(p0: Int): InputStream {
        TODO("Implement getAsciiStream")
    }

    override fun getAsciiStream(p0: String?): InputStream {
        TODO("Implement getAsciiStream")
    }

    override fun getUnicodeStream(p0: Int): InputStream {
        TODO("Implement getUnicodeStream")
    }

    override fun getUnicodeStream(p0: String?): InputStream {
        TODO("Implement getUnicodeStream")
    }

    override fun getBinaryStream(p0: Int): InputStream {
        TODO("Implement getBinaryStream")
    }

    override fun getBinaryStream(p0: String?): InputStream {
        TODO("Implement getBinaryStream")
    }

    override fun getWarnings(): SQLWarning {
        TODO("Implement getWarnings")
    }

    override fun clearWarnings() {
        TODO("Implement clearWarnings")
    }

    override fun getCursorName(): String {
        TODO("Implement getCursorName")
    }

    override fun getMetaData(): ResultSetMetaData {
        log.info("getMetaData()")
        return FlightSqlResultSetMetaData()
    }

    override fun getObject(p0: Int): Any {
        TODO("Implement getObject")
    }

    override fun getObject(p0: String?): Any {
        TODO("Implement getObject")
    }

    override fun getObject(p0: Int, p1: MutableMap<String, Class<*>>?): Any {
        TODO("Implement getObject")
    }

    override fun getObject(p0: String?, p1: MutableMap<String, Class<*>>?): Any {
        TODO("Implement getObject")
    }

    override fun <T : Any?> getObject(p0: Int, p1: Class<T>?): T {
        TODO("Implement getObject int")
    }

    override fun <T : Any?> getObject(p0: String?, p1: Class<T>?): T {
        TODO("Implement getObject string")
    }

    override fun findColumn(p0: String?): Int {
        TODO("Implement findColumn")
    }

    override fun getCharacterStream(p0: Int): Reader {
        TODO("Implement getCharacterStream")
    }

    override fun getCharacterStream(p0: String?): Reader {
        TODO("Implement getCharacterStream")
    }

    override fun isBeforeFirst(): Boolean {
        TODO("Implement isBeforeFirst")
    }

    override fun isAfterLast(): Boolean {
        TODO("Implement isAfterLast")
    }

    override fun isFirst(): Boolean {
        TODO("Implement isFirst")
    }

    override fun isLast(): Boolean {
        TODO("Implement isLast")
    }

    override fun beforeFirst() {
        TODO("Implement beforeFirst")
    }

    override fun afterLast() {
        TODO("Implement afterLast")
    }

    override fun first(): Boolean {
        TODO("Implement first")
    }

    override fun last(): Boolean {
        TODO("Implement last")
    }

    override fun getRow(): Int {
        TODO("Implement getRow")
    }

    override fun absolute(p0: Int): Boolean {
        TODO("Implement absolute")
    }

    override fun relative(p0: Int): Boolean {
        TODO("Implement relative")
    }

    override fun previous(): Boolean {
        TODO("Implement previous")
    }

    override fun setFetchDirection(p0: Int) {
        TODO("Implement setFetchDirection")
    }

    override fun getFetchDirection(): Int {
        TODO("Implement getFetchDirection")
    }

    override fun setFetchSize(p0: Int) {
        TODO("Implement setFetchSize")
    }

    override fun getFetchSize(): Int {
        TODO("Implement getFetchSize")
    }

    override fun getType(): Int {
        log.info("getType()")
        return ResultSet.TYPE_FORWARD_ONLY
    }

    override fun getConcurrency(): Int {
        TODO("Implement getConcurrency")
    }

    override fun rowUpdated(): Boolean {
        TODO("Implement rowUpdated")
    }

    override fun rowInserted(): Boolean {
        TODO("Implement rowInserted")
    }

    override fun rowDeleted(): Boolean {
        TODO("Implement rowDeleted")
    }

    override fun updateNull(p0: Int) {
        TODO("Implement updateNull")
    }

    override fun updateNull(p0: String?) {
        TODO("Implement updateNull")
    }

    override fun updateBoolean(p0: Int, p1: Boolean) {
        TODO("Implement updateBoolean")
    }

    override fun updateBoolean(p0: String?, p1: Boolean) {
        TODO("Implement updateBoolean")
    }

    override fun updateByte(p0: Int, p1: Byte) {
        TODO("Implement updateByte")
    }

    override fun updateByte(p0: String?, p1: Byte) {
        TODO("Implement updateByte")
    }

    override fun updateShort(p0: Int, p1: Short) {
        TODO("Implement updateShort")
    }

    override fun updateShort(p0: String?, p1: Short) {
        TODO("Implement updateShort")
    }

    override fun updateInt(p0: Int, p1: Int) {
        TODO("Implement updateInt")
    }

    override fun updateInt(p0: String?, p1: Int) {
        TODO("Implement updateInt")
    }

    override fun updateLong(p0: Int, p1: Long) {
        TODO("Implement updateLong")
    }

    override fun updateLong(p0: String?, p1: Long) {
        TODO("Implement updateLong")
    }

    override fun updateFloat(p0: Int, p1: Float) {
        TODO("Implement updateFloat")
    }

    override fun updateFloat(p0: String?, p1: Float) {
        TODO("Implement updateFloat")
    }

    override fun updateDouble(p0: Int, p1: Double) {
        TODO("Implement updateDouble")
    }

    override fun updateDouble(p0: String?, p1: Double) {
        TODO("Implement updateDouble")
    }

    override fun updateBigDecimal(p0: Int, p1: BigDecimal?) {
        TODO("Implement updateBigDecimal")
    }

    override fun updateBigDecimal(p0: String?, p1: BigDecimal?) {
        TODO("Implement updateBigDecimal")
    }

    override fun updateString(p0: Int, p1: String?) {
        TODO("Implement updateString")
    }

    override fun updateString(p0: String?, p1: String?) {
        TODO("Implement updateString")
    }

    override fun updateBytes(p0: Int, p1: ByteArray?) {
        TODO("Implement updateBytes")
    }

    override fun updateBytes(p0: String?, p1: ByteArray?) {
        TODO("Implement updateBytes")
    }

    override fun updateDate(p0: Int, p1: Date?) {
        TODO("Implement updateDate")
    }

    override fun updateDate(p0: String?, p1: Date?) {
        TODO("Implement updateDate")
    }

    override fun updateTime(p0: Int, p1: Time?) {
        TODO("Implement updateTime")
    }

    override fun updateTime(p0: String?, p1: Time?) {
        TODO("Implement updateTime")
    }

    override fun updateTimestamp(p0: Int, p1: Timestamp?) {
        TODO("Implement updateTimestamp")
    }

    override fun updateTimestamp(p0: String?, p1: Timestamp?) {
        TODO("Implement updateTimestamp")
    }

    override fun updateAsciiStream(p0: Int, p1: InputStream?, p2: Int) {
        TODO("Implement updateAsciiStream")
    }

    override fun updateAsciiStream(p0: String?, p1: InputStream?, p2: Int) {
        TODO("Implement updateAsciiStream")
    }

    override fun updateAsciiStream(p0: Int, p1: InputStream?, p2: Long) {
        TODO("Implement updateAsciiStream")
    }

    override fun updateAsciiStream(p0: String?, p1: InputStream?, p2: Long) {
        TODO("Implement updateAsciiStream")
    }

    override fun updateAsciiStream(p0: Int, p1: InputStream?) {
        TODO("Implement updateAsciiStream")
    }

    override fun updateAsciiStream(p0: String?, p1: InputStream?) {
        TODO("Implement updateAsciiStream")
    }

    override fun updateBinaryStream(p0: Int, p1: InputStream?, p2: Int) {
        TODO("Implement updateBinaryStream")
    }

    override fun updateBinaryStream(p0: String?, p1: InputStream?, p2: Int) {
        TODO("Implement updateBinaryStream")
    }

    override fun updateBinaryStream(p0: Int, p1: InputStream?, p2: Long) {
        TODO("Implement updateBinaryStream")
    }

    override fun updateBinaryStream(p0: String?, p1: InputStream?, p2: Long) {
        TODO("Implement updateBinaryStream")
    }

    override fun updateBinaryStream(p0: Int, p1: InputStream?) {
        TODO("Implement updateBinaryStream")
    }

    override fun updateBinaryStream(p0: String?, p1: InputStream?) {
        TODO("Implement updateBinaryStream")
    }

    override fun updateCharacterStream(p0: Int, p1: Reader?, p2: Int) {
        TODO("Implement updateCharacterStream")
    }

    override fun updateCharacterStream(p0: String?, p1: Reader?, p2: Int) {
        TODO("Implement updateCharacterStream")
    }

    override fun updateCharacterStream(p0: Int, p1: Reader?, p2: Long) {
        TODO("Implement updateCharacterStream")
    }

    override fun updateCharacterStream(p0: String?, p1: Reader?, p2: Long) {
        TODO("Implement updateCharacterStream")
    }

    override fun updateCharacterStream(p0: Int, p1: Reader?) {
        TODO("Implement updateCharacterStream")
    }

    override fun updateCharacterStream(p0: String?, p1: Reader?) {
        TODO("Implement updateCharacterStream")
    }

    override fun updateObject(p0: Int, p1: Any?, p2: Int) {
        TODO("Implement updateObject")
    }

    override fun updateObject(p0: Int, p1: Any?) {
        TODO("Implement updateObject")
    }

    override fun updateObject(p0: String?, p1: Any?, p2: Int) {
        TODO("Implement updateObject")
    }

    override fun updateObject(p0: String?, p1: Any?) {
        TODO("Implement updateObject")
    }

    override fun insertRow() {
        TODO("Implement insertRow")
    }

    override fun updateRow() {
        TODO("Implement updateRow")
    }

    override fun deleteRow() {
        TODO("Implement deleteRow")
    }

    override fun refreshRow() {
        TODO("Implement refreshRow")
    }

    override fun cancelRowUpdates() {
        TODO("Implement cancelRowUpdates")
    }

    override fun moveToInsertRow() {
        TODO("Implement moveToInsertRow")
    }

    override fun moveToCurrentRow() {
        TODO("Implement moveToCurrentRow")
    }

    override fun getStatement(): Statement {
        TODO("Implement getStatement")
    }

    override fun getRef(p0: Int): Ref {
        TODO("Implement getRef")
    }

    override fun getRef(p0: String?): Ref {
        TODO("Implement getRef")
    }

    override fun getBlob(p0: Int): Blob {
        TODO("Implement getBlob")
    }

    override fun getBlob(p0: String?): Blob {
        TODO("Implement getBlob")
    }

    override fun getClob(p0: Int): Clob {
        TODO("Implement getClob")
    }

    override fun getClob(p0: String?): Clob {
        TODO("Implement getClob")
    }

    override fun getArray(p0: Int): Array {
        TODO("Implement getArray")
    }

    override fun getArray(p0: String?): Array {
        TODO("Implement getArray")
    }

    override fun getURL(p0: Int): URL {
        TODO("Implement getURL")
    }

    override fun getURL(p0: String?): URL {
        TODO("Implement getURL")
    }

    override fun updateRef(p0: Int, p1: Ref?) {
        TODO("Implement updateRef")
    }

    override fun updateRef(p0: String?, p1: Ref?) {
        TODO("Implement updateRef")
    }

    override fun updateBlob(p0: Int, p1: Blob?) {
        TODO("Implement updateBlob")
    }

    override fun updateBlob(p0: String?, p1: Blob?) {
        TODO("Implement updateBlob")
    }

    override fun updateBlob(p0: Int, p1: InputStream?, p2: Long) {
        TODO("Implement updateBlob")
    }

    override fun updateBlob(p0: String?, p1: InputStream?, p2: Long) {
        TODO("Implement updateBlob")
    }

    override fun updateBlob(p0: Int, p1: InputStream?) {
        TODO("Implement updateBlob")
    }

    override fun updateBlob(p0: String?, p1: InputStream?) {
        TODO("Implement updateBlob")
    }

    override fun updateClob(p0: Int, p1: Clob?) {
        TODO("Implement updateClob")
    }

    override fun updateClob(p0: String?, p1: Clob?) {
        TODO("Implement updateClob")
    }

    override fun updateClob(p0: Int, p1: Reader?, p2: Long) {
        TODO("Implement updateClob")
    }

    override fun updateClob(p0: String?, p1: Reader?, p2: Long) {
        TODO("Implement updateClob")
    }

    override fun updateClob(p0: Int, p1: Reader?) {
        TODO("Implement updateClob")
    }

    override fun updateClob(p0: String?, p1: Reader?) {
        TODO("Implement updateClob")
    }

    override fun updateArray(p0: Int, p1: Array?) {
        TODO("Implement updateArray")
    }

    override fun updateArray(p0: String?, p1: Array?) {
        TODO("Implement updateArray")
    }

    override fun getRowId(p0: Int): RowId {
        TODO("Implement getRowId")
    }

    override fun getRowId(p0: String?): RowId {
        TODO("Implement getRowId")
    }

    override fun updateRowId(p0: Int, p1: RowId?) {
        TODO("Implement updateRowId")
    }

    override fun updateRowId(p0: String?, p1: RowId?) {
        TODO("Implement updateRowId")
    }

    override fun getHoldability(): Int {
        TODO("Implement getHoldability")
    }

    override fun isClosed(): Boolean {
        TODO("Implement isClosed")
    }

    override fun updateNString(p0: Int, p1: String?) {
        TODO("Implement updateNString")
    }

    override fun updateNString(p0: String?, p1: String?) {
        TODO("Implement updateNString")
    }

    override fun updateNClob(p0: Int, p1: NClob?) {
        TODO("Implement updateNClob")
    }

    override fun updateNClob(p0: String?, p1: NClob?) {
        TODO("Implement updateNClob")
    }

    override fun updateNClob(p0: Int, p1: Reader?, p2: Long) {
        TODO("Implement updateNClob")
    }

    override fun updateNClob(p0: String?, p1: Reader?, p2: Long) {
        TODO("Implement updateNClob")
    }

    override fun updateNClob(p0: Int, p1: Reader?) {
        TODO("Implement updateNClob")
    }

    override fun updateNClob(p0: String?, p1: Reader?) {
        TODO("Implement updateNClob")
    }

    override fun getNClob(p0: Int): NClob {
        TODO("Implement getNClob")
    }

    override fun getNClob(p0: String?): NClob {
        TODO("Implement getNClob")
    }

    override fun getSQLXML(p0: Int): SQLXML {
        TODO("Implement getSQLXML")
    }

    override fun getSQLXML(p0: String?): SQLXML {
        TODO("Implement getSQLXML")
    }

    override fun updateSQLXML(p0: Int, p1: SQLXML?) {
        TODO("Implement updateSQLXML")
    }

    override fun updateSQLXML(p0: String?, p1: SQLXML?) {
        TODO("Implement updateSQLXML")
    }

    override fun getNString(p0: Int): String {
        TODO("Implement getNString")
    }

    override fun getNString(p0: String?): String {
        TODO("Implement getNString")
    }

    override fun getNCharacterStream(p0: Int): Reader {
        TODO("Implement getNCharacterStream")
    }

    override fun getNCharacterStream(p0: String?): Reader {
        TODO("Implement getNCharacterStream")
    }

    override fun updateNCharacterStream(p0: Int, p1: Reader?, p2: Long) {
        TODO("Implement updateNCharacterStream")
    }

    override fun updateNCharacterStream(p0: String?, p1: Reader?, p2: Long) {
        TODO("Implement updateNCharacterStream")
    }

    override fun updateNCharacterStream(p0: Int, p1: Reader?) {
        TODO("Implement updateNCharacterStream")
    }

    override fun updateNCharacterStream(p0: String?, p1: Reader?) {
        TODO("Implement updateNCharacterStream")
    }
}