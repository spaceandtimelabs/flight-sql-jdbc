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
        log.info("<")
        TODO("Implement unwrap")
    }

    override fun isWrapperFor(p0: Class<*>?): Boolean {
        log.info("isWrapperFor")
        TODO("Implement isWrapperFor")
    }

    override fun close() {
        log.info("close")
        TODO("Implement close")
    }

    override fun next(): Boolean {
        log.info("next()")
        cursorPos++
        return cursorPos < vals.size
    }

    override fun wasNull(): Boolean {
        log.info("wasNull")
        TODO("Implement wasNull")
    }

    override fun getString(colIdx: Int): String {
        log.info("getString()")
        return vals[cursorPos]
    }

    override fun getString(p0: String?): String {
        log.info("getString")
        TODO("Implement getString(String)")
    }

    override fun getBoolean(p0: Int): Boolean {
        log.info("getBoolean")
        TODO("Implement getBoolean")
    }

    override fun getBoolean(p0: String?): Boolean {
        log.info("getBoolean")
        TODO("Implement getBoolean")
    }

    override fun getByte(p0: Int): Byte {
        log.info("getByte")
        TODO("Implement getByte")
    }

    override fun getByte(p0: String?): Byte {
        log.info("getByte")
        TODO("Implement getByte")
    }

    override fun getShort(p0: Int): Short {
        log.info("getShort")
        TODO("Implement getShort")
    }

    override fun getShort(p0: String?): Short {
        log.info("getShort")
        TODO("Implement getShort")
    }

    override fun getInt(p0: Int): Int {
        log.info("getInt")
        TODO("Implement getInt")
    }

    override fun getInt(p0: String?): Int {
        log.info("getInt")
        TODO("Implement getInt")
    }

    override fun getLong(p0: Int): Long {
        log.info("getLong")
        TODO("Implement getLong")
    }

    override fun getLong(p0: String?): Long {
        log.info("getLong")
        TODO("Implement getLong")
    }

    override fun getFloat(p0: Int): Float {
        log.info("getFloat")
        TODO("Implement getFloat")
    }

    override fun getFloat(p0: String?): Float {
        log.info("getFloat")
        TODO("Implement getFloat")
    }

    override fun getDouble(p0: Int): Double {
        log.info("getDouble")
        TODO("Implement getDouble")
    }

    override fun getDouble(p0: String?): Double {
        log.info("getDouble")
        TODO("Implement getDouble")
    }

    override fun getBigDecimal(p0: Int, p1: Int): BigDecimal {
        log.info("getBigDecimal")
        TODO("Implement getBigDecimal")
    }

    override fun getBigDecimal(p0: String?, p1: Int): BigDecimal {
        log.info("getBigDecimal")
        TODO("Implement getBigDecimal")
    }

    override fun getBigDecimal(p0: Int): BigDecimal {
        log.info("getBigDecimal")
        TODO("Implement getBigDecimal")
    }

    override fun getBigDecimal(p0: String?): BigDecimal {
        log.info("getBigDecimal")
        TODO("Implement getBigDecimal")
    }

    override fun getBytes(p0: Int): ByteArray {
        log.info("getBytes")
        TODO("Implement getBytes")
    }

    override fun getBytes(p0: String?): ByteArray {
        log.info("getBytes")
        TODO("Implement getBytes")
    }

    override fun getDate(p0: Int): Date {
        log.info("getDate")
        TODO("Implement getDate")
    }

    override fun getDate(p0: String?): Date {
        log.info("getDate")
        TODO("Implement getDate")
    }

    override fun getDate(p0: Int, p1: Calendar?): Date {
        log.info("getDate")
        TODO("Implement getDate")
    }

    override fun getDate(p0: String?, p1: Calendar?): Date {
        log.info("getDate")
        TODO("Implement getDate")
    }

    override fun getTime(p0: Int): Time {
        log.info("getTime")
        TODO("Implement getTime")
    }

    override fun getTime(p0: String?): Time {
        log.info("getTime")
        TODO("Implement getTime")
    }

    override fun getTime(p0: Int, p1: Calendar?): Time {
        log.info("getTime")
        TODO("Implement getTime")
    }

    override fun getTime(p0: String?, p1: Calendar?): Time {
        log.info("getTime")
        TODO("Implement getTime")
    }

    override fun getTimestamp(p0: Int): Timestamp {
        log.info("getTimestamp")
        TODO("Implement getTimestamp")
    }

    override fun getTimestamp(p0: String?): Timestamp {
        log.info("getTimestamp")
        TODO("Implement getTimestamp")
    }

    override fun getTimestamp(p0: Int, p1: Calendar?): Timestamp {
        log.info("getTimestamp")
        TODO("Implement getTimestamp")
    }

    override fun getTimestamp(p0: String?, p1: Calendar?): Timestamp {
        log.info("getTimestamp")
        TODO("Implement getTimestamp")
    }

    override fun getAsciiStream(p0: Int): InputStream {
        log.info("getAsciiStream")
        TODO("Implement getAsciiStream")
    }

    override fun getAsciiStream(p0: String?): InputStream {
        log.info("getAsciiStream")
        TODO("Implement getAsciiStream")
    }

    override fun getUnicodeStream(p0: Int): InputStream {
        log.info("getUnicodeStream")
        TODO("Implement getUnicodeStream")
    }

    override fun getUnicodeStream(p0: String?): InputStream {
        log.info("getUnicodeStream")
        TODO("Implement getUnicodeStream")
    }

    override fun getBinaryStream(p0: Int): InputStream {
        log.info("getBinaryStream")
        TODO("Implement getBinaryStream")
    }

    override fun getBinaryStream(p0: String?): InputStream {
        log.info("getBinaryStream")
        TODO("Implement getBinaryStream")
    }

    override fun getWarnings(): SQLWarning {
        log.info("getWarnings")
        TODO("Implement getWarnings")
    }

    override fun clearWarnings() {
        log.info("clearWarnings")
        TODO("Implement clearWarnings")
    }

    override fun getCursorName(): String {
        log.info("getCursorName")
        TODO("Implement getCursorName")
    }

    override fun getMetaData(): ResultSetMetaData {
        log.info("getMetaData()")
        return FlightSqlResultSetMetaData()
    }

    override fun getObject(p0: Int): Any {
        log.info("getObject")
        TODO("Implement getObject")
    }

    override fun getObject(p0: String?): Any {
        log.info("getObject")
        TODO("Implement getObject")
    }

    override fun getObject(p0: Int, p1: MutableMap<String, Class<*>>?): Any {
        log.info("getObject")
        TODO("Implement getObject")
    }

    override fun getObject(p0: String?, p1: MutableMap<String, Class<*>>?): Any {
        log.info("getObject")
        TODO("Implement getObject")
    }

    override fun <T : Any?> getObject(p0: Int, p1: Class<T>?): T {
        log.info("getObject")
        TODO("Implement getObject int")
    }

    override fun <T : Any?> getObject(p0: String?, p1: Class<T>?): T {
        log.info("getObject")
        TODO("Implement getObject string")
    }

    override fun findColumn(p0: String?): Int {
        log.info("findColumn")
        TODO("Implement findColumn")
    }

    override fun getCharacterStream(p0: Int): Reader {
        log.info("getCharacterStream")
        TODO("Implement getCharacterStream")
    }

    override fun getCharacterStream(p0: String?): Reader {
        log.info("getCharacterStream")
        TODO("Implement getCharacterStream")
    }

    override fun isBeforeFirst(): Boolean {
        log.info("isBeforeFirst")
        TODO("Implement isBeforeFirst")
    }

    override fun isAfterLast(): Boolean {
        log.info("isAfterLast")
        TODO("Implement isAfterLast")
    }

    override fun isFirst(): Boolean {
        log.info("isFirst")
        TODO("Implement isFirst")
    }

    override fun isLast(): Boolean {
        log.info("isLast")
        TODO("Implement isLast")
    }

    override fun beforeFirst() {
        log.info("beforeFirst")
        TODO("Implement beforeFirst")
    }

    override fun afterLast() {
        log.info("afterLast")
        TODO("Implement afterLast")
    }

    override fun first(): Boolean {
        log.info("first")
        TODO("Implement first")
    }

    override fun last(): Boolean {
        log.info("last")
        TODO("Implement last")
    }

    override fun getRow(): Int {
        log.info("getRow")
        TODO("Implement getRow")
    }

    override fun absolute(p0: Int): Boolean {
        log.info("absolute")
        TODO("Implement absolute")
    }

    override fun relative(p0: Int): Boolean {
        log.info("relative")
        TODO("Implement relative")
    }

    override fun previous(): Boolean {
        log.info("previous")
        TODO("Implement previous")
    }

    override fun setFetchDirection(p0: Int) {
        log.info("setFetchDirection")
        TODO("Implement setFetchDirection")
    }

    override fun getFetchDirection(): Int {
        log.info("getFetchDirection")
        TODO("Implement getFetchDirection")
    }

    override fun setFetchSize(p0: Int) {
        log.info("setFetchSize")
        TODO("Implement setFetchSize")
    }

    override fun getFetchSize(): Int {
        log.info("getFetchSize")
        TODO("Implement getFetchSize")
    }

    override fun getType(): Int {
        log.info("getType()")
        return ResultSet.TYPE_FORWARD_ONLY
    }

    override fun getConcurrency(): Int {
        log.info("getConcurrency")
        TODO("Implement getConcurrency")
    }

    override fun rowUpdated(): Boolean {
        log.info("rowUpdated")
        TODO("Implement rowUpdated")
    }

    override fun rowInserted(): Boolean {
        log.info("rowInserted")
        TODO("Implement rowInserted")
    }

    override fun rowDeleted(): Boolean {
        log.info("rowDeleted")
        TODO("Implement rowDeleted")
    }

    override fun updateNull(p0: Int) {
        log.info("updateNull")
        TODO("Implement updateNull")
    }

    override fun updateNull(p0: String?) {
        log.info("updateNull")
        TODO("Implement updateNull")
    }

    override fun updateBoolean(p0: Int, p1: Boolean) {
        log.info("updateBoolean")
        TODO("Implement updateBoolean")
    }

    override fun updateBoolean(p0: String?, p1: Boolean) {
        log.info("updateBoolean")
        TODO("Implement updateBoolean")
    }

    override fun updateByte(p0: Int, p1: Byte) {
        log.info("updateByte")
        TODO("Implement updateByte")
    }

    override fun updateByte(p0: String?, p1: Byte) {
        log.info("updateByte")
        TODO("Implement updateByte")
    }

    override fun updateShort(p0: Int, p1: Short) {
        log.info("updateShort")
        TODO("Implement updateShort")
    }

    override fun updateShort(p0: String?, p1: Short) {
        log.info("updateShort")
        TODO("Implement updateShort")
    }

    override fun updateInt(p0: Int, p1: Int) {
        log.info("updateInt")
        TODO("Implement updateInt")
    }

    override fun updateInt(p0: String?, p1: Int) {
        log.info("updateInt")
        TODO("Implement updateInt")
    }

    override fun updateLong(p0: Int, p1: Long) {
        log.info("updateLong")
        TODO("Implement updateLong")
    }

    override fun updateLong(p0: String?, p1: Long) {
        log.info("updateLong")
        TODO("Implement updateLong")
    }

    override fun updateFloat(p0: Int, p1: Float) {
        log.info("updateFloat")
        TODO("Implement updateFloat")
    }

    override fun updateFloat(p0: String?, p1: Float) {
        log.info("updateFloat")
        TODO("Implement updateFloat")
    }

    override fun updateDouble(p0: Int, p1: Double) {
        log.info("updateDouble")
        TODO("Implement updateDouble")
    }

    override fun updateDouble(p0: String?, p1: Double) {
        log.info("updateDouble")
        TODO("Implement updateDouble")
    }

    override fun updateBigDecimal(p0: Int, p1: BigDecimal?) {
        log.info("updateBigDecimal")
        TODO("Implement updateBigDecimal")
    }

    override fun updateBigDecimal(p0: String?, p1: BigDecimal?) {
        log.info("updateBigDecimal")
        TODO("Implement updateBigDecimal")
    }

    override fun updateString(p0: Int, p1: String?) {
        log.info("updateString")
        TODO("Implement updateString")
    }

    override fun updateString(p0: String?, p1: String?) {
        log.info("updateString")
        TODO("Implement updateString")
    }

    override fun updateBytes(p0: Int, p1: ByteArray?) {
        log.info("updateBytes")
        TODO("Implement updateBytes")
    }

    override fun updateBytes(p0: String?, p1: ByteArray?) {
        log.info("updateBytes")
        TODO("Implement updateBytes")
    }

    override fun updateDate(p0: Int, p1: Date?) {
        log.info("updateDate")
        TODO("Implement updateDate")
    }

    override fun updateDate(p0: String?, p1: Date?) {
        log.info("updateDate")
        TODO("Implement updateDate")
    }

    override fun updateTime(p0: Int, p1: Time?) {
        log.info("updateTime")
        TODO("Implement updateTime")
    }

    override fun updateTime(p0: String?, p1: Time?) {
        log.info("updateTime")
        TODO("Implement updateTime")
    }

    override fun updateTimestamp(p0: Int, p1: Timestamp?) {
        log.info("updateTimestamp")
        TODO("Implement updateTimestamp")
    }

    override fun updateTimestamp(p0: String?, p1: Timestamp?) {
        log.info("updateTimestamp")
        TODO("Implement updateTimestamp")
    }

    override fun updateAsciiStream(p0: Int, p1: InputStream?, p2: Int) {
        log.info("updateAsciiStream")
        TODO("Implement updateAsciiStream")
    }

    override fun updateAsciiStream(p0: String?, p1: InputStream?, p2: Int) {
        log.info("updateAsciiStream")
        TODO("Implement updateAsciiStream")
    }

    override fun updateAsciiStream(p0: Int, p1: InputStream?, p2: Long) {
        log.info("updateAsciiStream")
        TODO("Implement updateAsciiStream")
    }

    override fun updateAsciiStream(p0: String?, p1: InputStream?, p2: Long) {
        log.info("updateAsciiStream")
        TODO("Implement updateAsciiStream")
    }

    override fun updateAsciiStream(p0: Int, p1: InputStream?) {
        log.info("updateAsciiStream")
        TODO("Implement updateAsciiStream")
    }

    override fun updateAsciiStream(p0: String?, p1: InputStream?) {
        log.info("updateAsciiStream")
        TODO("Implement updateAsciiStream")
    }

    override fun updateBinaryStream(p0: Int, p1: InputStream?, p2: Int) {
        log.info("updateBinaryStream")
        TODO("Implement updateBinaryStream")
    }

    override fun updateBinaryStream(p0: String?, p1: InputStream?, p2: Int) {
        log.info("updateBinaryStream")
        TODO("Implement updateBinaryStream")
    }

    override fun updateBinaryStream(p0: Int, p1: InputStream?, p2: Long) {
        log.info("updateBinaryStream")
        TODO("Implement updateBinaryStream")
    }

    override fun updateBinaryStream(p0: String?, p1: InputStream?, p2: Long) {
        log.info("updateBinaryStream")
        TODO("Implement updateBinaryStream")
    }

    override fun updateBinaryStream(p0: Int, p1: InputStream?) {
        log.info("updateBinaryStream")
        TODO("Implement updateBinaryStream")
    }

    override fun updateBinaryStream(p0: String?, p1: InputStream?) {
        log.info("updateBinaryStream")
        TODO("Implement updateBinaryStream")
    }

    override fun updateCharacterStream(p0: Int, p1: Reader?, p2: Int) {
        log.info("updateCharacterStream")
        TODO("Implement updateCharacterStream")
    }

    override fun updateCharacterStream(p0: String?, p1: Reader?, p2: Int) {
        log.info("updateCharacterStream")
        TODO("Implement updateCharacterStream")
    }

    override fun updateCharacterStream(p0: Int, p1: Reader?, p2: Long) {
        log.info("updateCharacterStream")
        TODO("Implement updateCharacterStream")
    }

    override fun updateCharacterStream(p0: String?, p1: Reader?, p2: Long) {
        log.info("updateCharacterStream")
        TODO("Implement updateCharacterStream")
    }

    override fun updateCharacterStream(p0: Int, p1: Reader?) {
        log.info("updateCharacterStream")
        TODO("Implement updateCharacterStream")
    }

    override fun updateCharacterStream(p0: String?, p1: Reader?) {
        log.info("updateCharacterStream")
        TODO("Implement updateCharacterStream")
    }

    override fun updateObject(p0: Int, p1: Any?, p2: Int) {
        log.info("updateObject")
        TODO("Implement updateObject")
    }

    override fun updateObject(p0: Int, p1: Any?) {
        log.info("updateObject")
        TODO("Implement updateObject")
    }

    override fun updateObject(p0: String?, p1: Any?, p2: Int) {
        log.info("updateObject")
        TODO("Implement updateObject")
    }

    override fun updateObject(p0: String?, p1: Any?) {
        log.info("updateObject")
        TODO("Implement updateObject")
    }

    override fun insertRow() {
        log.info("insertRow")
        TODO("Implement insertRow")
    }

    override fun updateRow() {
        log.info("updateRow")
        TODO("Implement updateRow")
    }

    override fun deleteRow() {
        log.info("deleteRow")
        TODO("Implement deleteRow")
    }

    override fun refreshRow() {
        log.info("refreshRow")
        TODO("Implement refreshRow")
    }

    override fun cancelRowUpdates() {
        log.info("cancelRowUpdates")
        TODO("Implement cancelRowUpdates")
    }

    override fun moveToInsertRow() {
        log.info("moveToInsertRow")
        TODO("Implement moveToInsertRow")
    }

    override fun moveToCurrentRow() {
        log.info("moveToCurrentRow")
        TODO("Implement moveToCurrentRow")
    }

    override fun getStatement(): Statement {
        log.info("getStatement")
        TODO("Implement getStatement")
    }

    override fun getRef(p0: Int): Ref {
        log.info("getRef")
        TODO("Implement getRef")
    }

    override fun getRef(p0: String?): Ref {
        log.info("getRef")
        TODO("Implement getRef")
    }

    override fun getBlob(p0: Int): Blob {
        log.info("getBlob")
        TODO("Implement getBlob")
    }

    override fun getBlob(p0: String?): Blob {
        log.info("getBlob")
        TODO("Implement getBlob")
    }

    override fun getClob(p0: Int): Clob {
        log.info("getClob")
        TODO("Implement getClob")
    }

    override fun getClob(p0: String?): Clob {
        log.info("getClob")
        TODO("Implement getClob")
    }

    override fun getArray(p0: Int): Array {
        log.info("getArray")
        TODO("Implement getArray")
    }

    override fun getArray(p0: String?): Array {
        log.info("getArray")
        TODO("Implement getArray")
    }

    override fun getURL(p0: Int): URL {
        log.info("getURL")
        TODO("Implement getURL")
    }

    override fun getURL(p0: String?): URL {
        log.info("getURL")
        TODO("Implement getURL")
    }

    override fun updateRef(p0: Int, p1: Ref?) {
        log.info("updateRef")
        TODO("Implement updateRef")
    }

    override fun updateRef(p0: String?, p1: Ref?) {
        log.info("updateRef")
        TODO("Implement updateRef")
    }

    override fun updateBlob(p0: Int, p1: Blob?) {
        log.info("updateBlob")
        TODO("Implement updateBlob")
    }

    override fun updateBlob(p0: String?, p1: Blob?) {
        log.info("updateBlob")
        TODO("Implement updateBlob")
    }

    override fun updateBlob(p0: Int, p1: InputStream?, p2: Long) {
        log.info("updateBlob")
        TODO("Implement updateBlob")
    }

    override fun updateBlob(p0: String?, p1: InputStream?, p2: Long) {
        log.info("updateBlob")
        TODO("Implement updateBlob")
    }

    override fun updateBlob(p0: Int, p1: InputStream?) {
        log.info("updateBlob")
        TODO("Implement updateBlob")
    }

    override fun updateBlob(p0: String?, p1: InputStream?) {
        log.info("updateBlob")
        TODO("Implement updateBlob")
    }

    override fun updateClob(p0: Int, p1: Clob?) {
        log.info("updateClob")
        TODO("Implement updateClob")
    }

    override fun updateClob(p0: String?, p1: Clob?) {
        log.info("updateClob")
        TODO("Implement updateClob")
    }

    override fun updateClob(p0: Int, p1: Reader?, p2: Long) {
        log.info("updateClob")
        TODO("Implement updateClob")
    }

    override fun updateClob(p0: String?, p1: Reader?, p2: Long) {
        log.info("updateClob")
        TODO("Implement updateClob")
    }

    override fun updateClob(p0: Int, p1: Reader?) {
        log.info("updateClob")
        TODO("Implement updateClob")
    }

    override fun updateClob(p0: String?, p1: Reader?) {
        log.info("updateClob")
        TODO("Implement updateClob")
    }

    override fun updateArray(p0: Int, p1: Array?) {
        log.info("updateArray")
        TODO("Implement updateArray")
    }

    override fun updateArray(p0: String?, p1: Array?) {
        log.info("updateArray")
        TODO("Implement updateArray")
    }

    override fun getRowId(p0: Int): RowId {
        log.info("getRowId")
        TODO("Implement getRowId")
    }

    override fun getRowId(p0: String?): RowId {
        log.info("getRowId")
        TODO("Implement getRowId")
    }

    override fun updateRowId(p0: Int, p1: RowId?) {
        log.info("updateRowId")
        TODO("Implement updateRowId")
    }

    override fun updateRowId(p0: String?, p1: RowId?) {
        log.info("updateRowId")
        TODO("Implement updateRowId")
    }

    override fun getHoldability(): Int {
        log.info("getHoldability")
        TODO("Implement getHoldability")
    }

    override fun isClosed(): Boolean {
        log.info("isClosed")
        TODO("Implement isClosed")
    }

    override fun updateNString(p0: Int, p1: String?) {
        log.info("updateNString")
        TODO("Implement updateNString")
    }

    override fun updateNString(p0: String?, p1: String?) {
        log.info("updateNString")
        TODO("Implement updateNString")
    }

    override fun updateNClob(p0: Int, p1: NClob?) {
        log.info("updateNClob")
        TODO("Implement updateNClob")
    }

    override fun updateNClob(p0: String?, p1: NClob?) {
        log.info("updateNClob")
        TODO("Implement updateNClob")
    }

    override fun updateNClob(p0: Int, p1: Reader?, p2: Long) {
        log.info("updateNClob")
        TODO("Implement updateNClob")
    }

    override fun updateNClob(p0: String?, p1: Reader?, p2: Long) {
        log.info("updateNClob")
        TODO("Implement updateNClob")
    }

    override fun updateNClob(p0: Int, p1: Reader?) {
        log.info("updateNClob")
        TODO("Implement updateNClob")
    }

    override fun updateNClob(p0: String?, p1: Reader?) {
        log.info("updateNClob")
        TODO("Implement updateNClob")
    }

    override fun getNClob(p0: Int): NClob {
        log.info("getNClob")
        TODO("Implement getNClob")
    }

    override fun getNClob(p0: String?): NClob {
        log.info("getNClob")
        TODO("Implement getNClob")
    }

    override fun getSQLXML(p0: Int): SQLXML {
        log.info("getSQLXML")
        TODO("Implement getSQLXML")
    }

    override fun getSQLXML(p0: String?): SQLXML {
        log.info("getSQLXML")
        TODO("Implement getSQLXML")
    }

    override fun updateSQLXML(p0: Int, p1: SQLXML?) {
        log.info("updateSQLXML")
        TODO("Implement updateSQLXML")
    }

    override fun updateSQLXML(p0: String?, p1: SQLXML?) {
        log.info("updateSQLXML")
        TODO("Implement updateSQLXML")
    }

    override fun getNString(p0: Int): String {
        log.info("getNString")
        TODO("Implement getNString")
    }

    override fun getNString(p0: String?): String {
        log.info("getNString")
        TODO("Implement getNString")
    }

    override fun getNCharacterStream(p0: Int): Reader {
        log.info("getNCharacterStream")
        TODO("Implement getNCharacterStream")
    }

    override fun getNCharacterStream(p0: String?): Reader {
        log.info("getNCharacterStream")
        TODO("Implement getNCharacterStream")
    }

    override fun updateNCharacterStream(p0: Int, p1: Reader?, p2: Long) {
        log.info("updateNCharacterStream")
        TODO("Implement updateNCharacterStream")
    }

    override fun updateNCharacterStream(p0: String?, p1: Reader?, p2: Long) {
        log.info("updateNCharacterStream")
        TODO("Implement updateNCharacterStream")
    }

    override fun updateNCharacterStream(p0: Int, p1: Reader?) {
        log.info("updateNCharacterStream")
        TODO("Implement updateNCharacterStream")
    }

    override fun updateNCharacterStream(p0: String?, p1: Reader?) {
        log.info("updateNCharacterStream")
        TODO("Implement updateNCharacterStream")
    }
}