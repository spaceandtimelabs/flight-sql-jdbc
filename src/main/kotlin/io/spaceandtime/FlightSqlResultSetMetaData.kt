package io.spaceandtime

import org.slf4j.LoggerFactory
import java.sql.ResultSetMetaData
import java.sql.Types

class FlightSqlResultSetMetaData : ResultSetMetaData {
    val log = LoggerFactory.getLogger(this.javaClass.name)

    override fun <T : Any?> unwrap(p0: Class<T>?): T {
        TODO("Implement <")
    }

    override fun isWrapperFor(p0: Class<*>?): Boolean {
        TODO("Implement isWrapperFor")
    }

    override fun getColumnCount(): Int {
        log.info("getColumnCount()")
        return 1
    }

    override fun isAutoIncrement(p0: Int): Boolean {
        TODO("Implement isAutoIncrement")
    }

    override fun isCaseSensitive(p0: Int): Boolean {
        TODO("Implement isCaseSensitive")
    }

    override fun isSearchable(p0: Int): Boolean {
        TODO("Implement isSearchable")
    }

    override fun isCurrency(p0: Int): Boolean {
        TODO("Implement isCurrency")
    }

    override fun isNullable(p0: Int): Int {
        TODO("Implement isNullable")
    }

    override fun isSigned(p0: Int): Boolean {
        TODO("Implement isSigned")
    }

    override fun getColumnDisplaySize(p0: Int): Int {
        TODO("Implement getColumnDisplaySize")
    }

    override fun getColumnLabel(p0: Int): String {
        TODO("Implement getColumnLabel")
    }

    override fun getColumnName(p0: Int): String {
        TODO("Implement getColumnName")
    }

    override fun getSchemaName(p0: Int): String {
        TODO("Implement getSchemaName")
    }

    override fun getPrecision(p0: Int): Int {
        TODO("Implement getPrecision")
    }

    override fun getScale(p0: Int): Int {
        TODO("Implement getScale")
    }

    override fun getTableName(p0: Int): String {
        TODO("Implement getTableName")
    }

    override fun getCatalogName(p0: Int): String {
        TODO("Implement getCatalogName")
    }

    override fun getColumnType(colIdx: Int): Int {
        log.info("getColumnType")
        return Types.VARCHAR
    }

    override fun getColumnTypeName(colIdx: Int): String {
        log.info("getColumnTypeName")
        return "VARCHAR"
    }

    override fun isReadOnly(p0: Int): Boolean {
        TODO("Implement isReadOnly")
    }

    override fun isWritable(p0: Int): Boolean {
        TODO("Implement isWritable")
    }

    override fun isDefinitelyWritable(p0: Int): Boolean {
        TODO("Implement isDefinitelyWritable")
    }

    override fun getColumnClassName(p0: Int): String {
        log.info("getColumnClassName")
        return "java.lang.String"
    }
}