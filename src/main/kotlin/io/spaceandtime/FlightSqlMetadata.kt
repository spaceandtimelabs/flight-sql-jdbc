package io.spaceandtime

import org.slf4j.LoggerFactory
import java.sql.Connection
import java.sql.DatabaseMetaData
import java.sql.ResultSet
import java.sql.RowIdLifetime


class FlightSqlMetadata : DatabaseMetaData {
    val log = LoggerFactory.getLogger(this.javaClass.name)

    override fun <T : Any?> unwrap(p0: Class<T>?): T {
        log.info("unwrap")
        TODO("Implement unwrap()")
    }

    override fun isWrapperFor(p0: Class<*>?): Boolean {
        log.info("isWrapperFor")
        TODO("Implement isWrapperFor()")
    }

    override fun allProceduresAreCallable(): Boolean {
        log.info("allProceduresAreCallable")
        TODO("Implement allProceduresAreCallable()")
    }

    override fun allTablesAreSelectable(): Boolean {
        log.info("allTablesAreSelectable")
        TODO("Implement allTablesAreSelectable()")
    }

    override fun getURL(): String {
        log.info("getURL")
        TODO("Implement getURL()")
    }

    override fun getUserName(): String {
        log.info("getUserName")
        TODO("Implement getUserName()")
    }

    override fun isReadOnly(): Boolean {
        log.info("isReadOnly")
        TODO("Implement isReadOnly()")
    }

    override fun nullsAreSortedHigh(): Boolean {
        log.info("nullsAreSortedHigh")
        TODO("Implement nullsAreSortedHigh()")
    }

    override fun nullsAreSortedLow(): Boolean {
        log.info("nullsAreSortedLow")
        TODO("Implement nullsAreSortedLow()")
    }

    override fun nullsAreSortedAtStart(): Boolean {
        log.info("nullsAreSortedAtStart")
        TODO("Implement nullsAreSortedAtStart()")
    }

    override fun nullsAreSortedAtEnd(): Boolean {
        log.info("nullsAreSortedAtEnd")
        TODO("Implement nullsAreSortedAtEnd()")
    }

    override fun getDatabaseProductName(): String {
        log.info("getDatabaseProductName()")
        return "Apache Arrow Flight SQL JDBC Driver"
    }

    override fun getDatabaseProductVersion(): String {
        log.info("getDatabaseProductVersion")
        TODO("Implement getDatabaseProductVersion()")
    }

    override fun getDriverName(): String {
        log.info("getDriverName()")
        return "Apache Arrow Flight SQL JDBC Driver"
    }

    override fun getDriverVersion(): String {
        log.info("getDriverVersion()")
        return FlightSqlJdbcDriver.getVersion()
    }

    override fun getDriverMajorVersion(): Int {
        log.info("getDriverMajorVersion")
        TODO("Implement getDriverMajorVersion()")
    }

    override fun getDriverMinorVersion(): Int {
        log.info("getDriverMinorVersion")
        TODO("Implement getDriverMinorVersion()")
    }

    override fun usesLocalFiles(): Boolean {
        log.info("usesLocalFiles")
        TODO("Implement usesLocalFiles()")
    }

    override fun usesLocalFilePerTable(): Boolean {
        log.info("usesLocalFilePerTable")
        TODO("Implement usesLocalFilePerTable()")
    }

    override fun supportsMixedCaseIdentifiers(): Boolean {
        log.info("supportsMixedCaseIdentifiers")
        TODO("Implement supportsMixedCaseIdentifiers()")
    }

    override fun storesUpperCaseIdentifiers(): Boolean {
        log.info("storesUpperCaseIdentifiers")
        TODO("Implement storesUpperCaseIdentifiers()")
    }

    override fun storesLowerCaseIdentifiers(): Boolean {
        log.info("storesLowerCaseIdentifiers")
        TODO("Implement storesLowerCaseIdentifiers()")
    }

    override fun storesMixedCaseIdentifiers(): Boolean {
        log.info("storesMixedCaseIdentifiers")
        TODO("Implement storesMixedCaseIdentifiers()")
    }

    override fun supportsMixedCaseQuotedIdentifiers(): Boolean {
        log.info("supportsMixedCaseQuotedIdentifiers")
        TODO("Implement supportsMixedCaseQuotedIdentifiers()")
    }

    override fun storesUpperCaseQuotedIdentifiers(): Boolean {
        log.info("storesUpperCaseQuotedIdentifiers")
        TODO("Implement storesUpperCaseQuotedIdentifiers()")
    }

    override fun storesLowerCaseQuotedIdentifiers(): Boolean {
        log.info("storesLowerCaseQuotedIdentifiers")
        TODO("Implement storesLowerCaseQuotedIdentifiers()")
    }

    override fun storesMixedCaseQuotedIdentifiers(): Boolean {
        log.info("storesMixedCaseQuotedIdentifiers")
        TODO("Implement storesMixedCaseQuotedIdentifiers()")
    }

    override fun getIdentifierQuoteString(): String {
        log.info("getIdentifierQuoteString")
        TODO("Implement getIdentifierQuoteString()")
    }

    override fun getSQLKeywords(): String {
        log.info("getSQLKeywords")
        TODO("Implement getSQLKeywords()")
    }

    override fun getNumericFunctions(): String {
        log.info("getNumericFunctions")
        TODO("Implement getNumericFunctions()")
    }

    override fun getStringFunctions(): String {
        log.info("getStringFunctions")
        TODO("Implement getStringFunctions()")
    }

    override fun getSystemFunctions(): String {
        log.info("getSystemFunctions")
        TODO("Implement getSystemFunctions()")
    }

    override fun getTimeDateFunctions(): String {
        log.info("getTimeDateFunctions")
        TODO("Implement getTimeDateFunctions()")
    }

    override fun getSearchStringEscape(): String {
        log.info("getSearchStringEscape")
        TODO("Implement getSearchStringEscape()")
    }

    override fun getExtraNameCharacters(): String {
        log.info("getExtraNameCharacters")
        TODO("Implement getExtraNameCharacters()")
    }

    override fun supportsAlterTableWithAddColumn(): Boolean {
        log.info("supportsAlterTableWithAddColumn")
        TODO("Implement supportsAlterTableWithAddColumn()")
    }

    override fun supportsAlterTableWithDropColumn(): Boolean {
        log.info("supportsAlterTableWithDropColumn")
        TODO("Implement supportsAlterTableWithDropColumn()")
    }

    override fun supportsColumnAliasing(): Boolean {
        log.info("supportsColumnAliasing")
        TODO("Implement supportsColumnAliasing()")
    }

    override fun nullPlusNonNullIsNull(): Boolean {
        log.info("nullPlusNonNullIsNull")
        TODO("Implement nullPlusNonNullIsNull()")
    }

    override fun supportsConvert(): Boolean {
        log.info("supportsConvert")
        TODO("Implement supportsConvert()")
    }

    override fun supportsConvert(p0: Int, p1: Int): Boolean {
        log.info("supportsConvert")
        TODO("Implement supportsConvert()")
    }

    override fun supportsTableCorrelationNames(): Boolean {
        log.info("supportsTableCorrelationNames")
        TODO("Implement supportsTableCorrelationNames()")
    }

    override fun supportsDifferentTableCorrelationNames(): Boolean {
        log.info("supportsDifferentTableCorrelationNames")
        TODO("Implement supportsDifferentTableCorrelationNames()")
    }

    override fun supportsExpressionsInOrderBy(): Boolean {
        log.info("supportsExpressionsInOrderBy")
        TODO("Implement supportsExpressionsInOrderBy()")
    }

    override fun supportsOrderByUnrelated(): Boolean {
        log.info("supportsOrderByUnrelated")
        TODO("Implement supportsOrderByUnrelated()")
    }

    override fun supportsGroupBy(): Boolean {
        log.info("supportsGroupBy")
        TODO("Implement supportsGroupBy()")
    }

    override fun supportsGroupByUnrelated(): Boolean {
        log.info("supportsGroupByUnrelated")
        TODO("Implement supportsGroupByUnrelated()")
    }

    override fun supportsGroupByBeyondSelect(): Boolean {
        log.info("supportsGroupByBeyondSelect")
        TODO("Implement supportsGroupByBeyondSelect()")
    }

    override fun supportsLikeEscapeClause(): Boolean {
        log.info("supportsLikeEscapeClause")
        TODO("Implement supportsLikeEscapeClause()")
    }

    override fun supportsMultipleResultSets(): Boolean {
        log.info("supportsMultipleResultSets")
        TODO("Implement supportsMultipleResultSets()")
    }

    override fun supportsMultipleTransactions(): Boolean {
        log.info("supportsMultipleTransactions")
        TODO("Implement supportsMultipleTransactions()")
    }

    override fun supportsNonNullableColumns(): Boolean {
        log.info("supportsNonNullableColumns")
        TODO("Implement supportsNonNullableColumns()")
    }

    override fun supportsMinimumSQLGrammar(): Boolean {
        log.info("supportsMinimumSQLGrammar")
        TODO("Implement supportsMinimumSQLGrammar()")
    }

    override fun supportsCoreSQLGrammar(): Boolean {
        log.info("supportsCoreSQLGrammar")
        TODO("Implement supportsCoreSQLGrammar()")
    }

    override fun supportsExtendedSQLGrammar(): Boolean {
        log.info("supportsExtendedSQLGrammar")
        TODO("Implement supportsExtendedSQLGrammar()")
    }

    override fun supportsANSI92EntryLevelSQL(): Boolean {
        log.info("supportsANSI92EntryLevelSQL")
        TODO("Implement supportsANSI92EntryLevelSQL()")
    }

    override fun supportsANSI92IntermediateSQL(): Boolean {
        log.info("supportsANSI92IntermediateSQL")
        TODO("Implement supportsANSI92IntermediateSQL()")
    }

    override fun supportsANSI92FullSQL(): Boolean {
        log.info("supportsANSI92FullSQL")
        TODO("Implement supportsANSI92FullSQL()")
    }

    override fun supportsIntegrityEnhancementFacility(): Boolean {
        log.info("supportsIntegrityEnhancementFacility")
        TODO("Implement supportsIntegrityEnhancementFacility()")
    }

    override fun supportsOuterJoins(): Boolean {
        log.info("supportsOuterJoins")
        TODO("Implement supportsOuterJoins()")
    }

    override fun supportsFullOuterJoins(): Boolean {
        log.info("supportsFullOuterJoins")
        TODO("Implement supportsFullOuterJoins()")
    }

    override fun supportsLimitedOuterJoins(): Boolean {
        log.info("supportsLimitedOuterJoins")
        TODO("Implement supportsLimitedOuterJoins()")
    }

    override fun getSchemaTerm(): String {
        log.info("getSchemaTerm")
        TODO("Implement getSchemaTerm()")
    }

    override fun getProcedureTerm(): String {
        log.info("getProcedureTerm")
        TODO("Implement getProcedureTerm()")
    }

    override fun getCatalogTerm(): String {
        log.info("getCatalogTerm")
        TODO("Implement getCatalogTerm()")
    }

    override fun isCatalogAtStart(): Boolean {
        log.info("isCatalogAtStart")
        TODO("Implement isCatalogAtStart()")
    }

    override fun getCatalogSeparator(): String {
        log.info("getCatalogSeparator")
        TODO("Implement getCatalogSeparator()")
    }

    override fun supportsSchemasInDataManipulation(): Boolean {
        log.info("supportsSchemasInDataManipulation")
        TODO("Implement supportsSchemasInDataManipulation()")
    }

    override fun supportsSchemasInProcedureCalls(): Boolean {
        log.info("supportsSchemasInProcedureCalls")
        TODO("Implement supportsSchemasInProcedureCalls()")
    }

    override fun supportsSchemasInTableDefinitions(): Boolean {
        log.info("supportsSchemasInTableDefinitions")
        TODO("Implement supportsSchemasInTableDefinitions()")
    }

    override fun supportsSchemasInIndexDefinitions(): Boolean {
        log.info("supportsSchemasInIndexDefinitions")
        TODO("Implement supportsSchemasInIndexDefinitions()")
    }

    override fun supportsSchemasInPrivilegeDefinitions(): Boolean {
        log.info("supportsSchemasInPrivilegeDefinitions")
        TODO("Implement supportsSchemasInPrivilegeDefinitions()")
    }

    override fun supportsCatalogsInDataManipulation(): Boolean {
        log.info("supportsCatalogsInDataManipulation")
        TODO("Implement supportsCatalogsInDataManipulation()")
    }

    override fun supportsCatalogsInProcedureCalls(): Boolean {
        log.info("supportsCatalogsInProcedureCalls")
        TODO("Implement supportsCatalogsInProcedureCalls()")
    }

    override fun supportsCatalogsInTableDefinitions(): Boolean {
        log.info("supportsCatalogsInTableDefinitions")
        TODO("Implement supportsCatalogsInTableDefinitions()")
    }

    override fun supportsCatalogsInIndexDefinitions(): Boolean {
        log.info("supportsCatalogsInIndexDefinitions")
        TODO("Implement supportsCatalogsInIndexDefinitions()")
    }

    override fun supportsCatalogsInPrivilegeDefinitions(): Boolean {
        log.info("supportsCatalogsInPrivilegeDefinitions")
        TODO("Implement supportsCatalogsInPrivilegeDefinitions()")
    }

    override fun supportsPositionedDelete(): Boolean {
        log.info("supportsPositionedDelete")
        TODO("Implement supportsPositionedDelete()")
    }

    override fun supportsPositionedUpdate(): Boolean {
        log.info("supportsPositionedUpdate")
        TODO("Implement supportsPositionedUpdate()")
    }

    override fun supportsSelectForUpdate(): Boolean {
        log.info("supportsSelectForUpdate")
        TODO("Implement supportsSelectForUpdate()")
    }

    override fun supportsStoredProcedures(): Boolean {
        log.info("supportsStoredProcedures")
        TODO("Implement supportsStoredProcedures()")
    }

    override fun supportsSubqueriesInComparisons(): Boolean {
        log.info("supportsSubqueriesInComparisons")
        TODO("Implement supportsSubqueriesInComparisons()")
    }

    override fun supportsSubqueriesInExists(): Boolean {
        log.info("supportsSubqueriesInExists")
        TODO("Implement supportsSubqueriesInExists()")
    }

    override fun supportsSubqueriesInIns(): Boolean {
        log.info("supportsSubqueriesInIns")
        TODO("Implement supportsSubqueriesInIns()")
    }

    override fun supportsSubqueriesInQuantifieds(): Boolean {
        log.info("supportsSubqueriesInQuantifieds")
        TODO("Implement supportsSubqueriesInQuantifieds()")
    }

    override fun supportsCorrelatedSubqueries(): Boolean {
        log.info("supportsCorrelatedSubqueries")
        TODO("Implement supportsCorrelatedSubqueries()")
    }

    override fun supportsUnion(): Boolean {
        log.info("supportsUnion")
        TODO("Implement supportsUnion()")
    }

    override fun supportsUnionAll(): Boolean {
        log.info("supportsUnionAll")
        TODO("Implement supportsUnionAll()")
    }

    override fun supportsOpenCursorsAcrossCommit(): Boolean {
        log.info("supportsOpenCursorsAcrossCommit")
        TODO("Implement supportsOpenCursorsAcrossCommit()")
    }

    override fun supportsOpenCursorsAcrossRollback(): Boolean {
        log.info("supportsOpenCursorsAcrossRollback")
        TODO("Implement supportsOpenCursorsAcrossRollback()")
    }

    override fun supportsOpenStatementsAcrossCommit(): Boolean {
        log.info("supportsOpenStatementsAcrossCommit")
        TODO("Implement supportsOpenStatementsAcrossCommit()")
    }

    override fun supportsOpenStatementsAcrossRollback(): Boolean {
        log.info("supportsOpenStatementsAcrossRollback")
        TODO("Implement supportsOpenStatementsAcrossRollback()")
    }

    override fun getMaxBinaryLiteralLength(): Int {
        log.info("getMaxBinaryLiteralLength")
        TODO("Implement getMaxBinaryLiteralLength()")
    }

    override fun getMaxCharLiteralLength(): Int {
        log.info("getMaxCharLiteralLength")
        TODO("Implement getMaxCharLiteralLength()")
    }

    override fun getMaxColumnNameLength(): Int {
        log.info("getMaxColumnNameLength")
        TODO("Implement getMaxColumnNameLength()")
    }

    override fun getMaxColumnsInGroupBy(): Int {
        log.info("getMaxColumnsInGroupBy")
        TODO("Implement getMaxColumnsInGroupBy()")
    }

    override fun getMaxColumnsInIndex(): Int {
        log.info("getMaxColumnsInIndex")
        TODO("Implement getMaxColumnsInIndex()")
    }

    override fun getMaxColumnsInOrderBy(): Int {
        log.info("getMaxColumnsInOrderBy")
        TODO("Implement getMaxColumnsInOrderBy()")
    }

    override fun getMaxColumnsInSelect(): Int {
        log.info("getMaxColumnsInSelect")
        TODO("Implement getMaxColumnsInSelect()")
    }

    override fun getMaxColumnsInTable(): Int {
        log.info("getMaxColumnsInTable")
        TODO("Implement getMaxColumnsInTable()")
    }

    override fun getMaxConnections(): Int {
        log.info("getMaxConnections")
        TODO("Implement getMaxConnections()")
    }

    override fun getMaxCursorNameLength(): Int {
        log.info("getMaxCursorNameLength")
        TODO("Implement getMaxCursorNameLength()")
    }

    override fun getMaxIndexLength(): Int {
        log.info("getMaxIndexLength")
        TODO("Implement getMaxIndexLength()")
    }

    override fun getMaxSchemaNameLength(): Int {
        log.info("getMaxSchemaNameLength")
        TODO("Implement getMaxSchemaNameLength()")
    }

    override fun getMaxProcedureNameLength(): Int {
        log.info("getMaxProcedureNameLength")
        TODO("Implement getMaxProcedureNameLength()")
    }

    override fun getMaxCatalogNameLength(): Int {
        log.info("getMaxCatalogNameLength")
        TODO("Implement getMaxCatalogNameLength()")
    }

    override fun getMaxRowSize(): Int {
        log.info("getMaxRowSize")
        TODO("Implement getMaxRowSize()")
    }

    override fun doesMaxRowSizeIncludeBlobs(): Boolean {
        log.info("doesMaxRowSizeIncludeBlobs")
        TODO("Implement doesMaxRowSizeIncludeBlobs()")
    }

    override fun getMaxStatementLength(): Int {
        log.info("getMaxStatementLength")
        TODO("Implement getMaxStatementLength()")
    }

    override fun getMaxStatements(): Int {
        log.info("getMaxStatements")
        TODO("Implement getMaxStatements()")
    }

    override fun getMaxTableNameLength(): Int {
        log.info("getMaxTableNameLength")
        TODO("Implement getMaxTableNameLength()")
    }

    override fun getMaxTablesInSelect(): Int {
        log.info("getMaxTablesInSelect")
        TODO("Implement getMaxTablesInSelect()")
    }

    override fun getMaxUserNameLength(): Int {
        log.info("getMaxUserNameLength")
        TODO("Implement getMaxUserNameLength()")
    }

    override fun getDefaultTransactionIsolation(): Int {
        log.info("getDefaultTransactionIsolation")
        TODO("Implement getDefaultTransactionIsolation()")
    }

    override fun supportsTransactions(): Boolean {
        log.info("supportsTransactions")
        TODO("Implement supportsTransactions()")
    }

    override fun supportsTransactionIsolationLevel(p0: Int): Boolean {
        log.info("supportsTransactionIsolationLevel")
        TODO("Implement supportsTransactionIsolationLevel()")
    }

    override fun supportsDataDefinitionAndDataManipulationTransactions(): Boolean {
        log.info("supportsDataDefinitionAndDataManipulationTransactions")
        TODO("Implement supportsDataDefinitionAndDataManipulationTransactions()")
    }

    override fun supportsDataManipulationTransactionsOnly(): Boolean {
        log.info("supportsDataManipulationTransactionsOnly")
        TODO("Implement supportsDataManipulationTransactionsOnly()")
    }

    override fun dataDefinitionCausesTransactionCommit(): Boolean {
        log.info("dataDefinitionCausesTransactionCommit")
        TODO("Implement dataDefinitionCausesTransactionCommit()")
    }

    override fun dataDefinitionIgnoredInTransactions(): Boolean {
        log.info("dataDefinitionIgnoredInTransactions")
        TODO("Implement dataDefinitionIgnoredInTransactions()")
    }

    override fun getProcedures(p0: String?, p1: String?, p2: String?): ResultSet {
        log.info("getProcedures")
        TODO("Implement getProcedures()")
    }

    override fun getProcedureColumns(p0: String?, p1: String?, p2: String?, p3: String?): ResultSet {
        log.info("getProcedureColumns")
        TODO("Implement getProcedureColumns()")
    }

    override fun getTables(p0: String?, p1: String?, p2: String?, p3: Array<out String>?): ResultSet {
        log.info("getTables")
        TODO("Implement getTables()")
    }

    override fun getSchemas(): ResultSet {
        log.info("getSchemas")
        TODO("Implement getSchemas()")
    }

    override fun getSchemas(p0: String?, p1: String?): ResultSet {
        log.info("getSchemas")
        TODO("Implement getSchemas()")
    }

    override fun getCatalogs(): ResultSet {
        log.info("getCatalogs")
        TODO("Implement getCatalogs()")
    }

    override fun getTableTypes(): ResultSet {
        log.info("getTableTypes")
        TODO("Implement getTableTypes()")
    }

    override fun getColumns(p0: String?, p1: String?, p2: String?, p3: String?): ResultSet {
        log.info("getColumns")
        TODO("Implement getColumns()")
    }

    override fun getColumnPrivileges(p0: String?, p1: String?, p2: String?, p3: String?): ResultSet {
        log.info("getColumnPrivileges")
        TODO("Implement getColumnPrivileges()")
    }

    override fun getTablePrivileges(p0: String?, p1: String?, p2: String?): ResultSet {
        log.info("getTablePrivileges")
        TODO("Implement getTablePrivileges()")
    }

    override fun getBestRowIdentifier(p0: String?, p1: String?, p2: String?, p3: Int, p4: Boolean): ResultSet {
        log.info("getBestRowIdentifier")
        TODO("Implement getBestRowIdentifier()")
    }

    override fun getVersionColumns(p0: String?, p1: String?, p2: String?): ResultSet {
        log.info("getVersionColumns")
        TODO("Implement getVersionColumns()")
    }

    override fun getPrimaryKeys(p0: String?, p1: String?, p2: String?): ResultSet {
        log.info("getPrimaryKeys")
        TODO("Implement getPrimaryKeys()")
    }

    override fun getImportedKeys(p0: String?, p1: String?, p2: String?): ResultSet {
        log.info("getImportedKeys")
        TODO("Implement getImportedKeys()")
    }

    override fun getExportedKeys(p0: String?, p1: String?, p2: String?): ResultSet {
        log.info("getExportedKeys")
        TODO("Implement getExportedKeys()")
    }

    override fun getCrossReference(
        p0: String?,
        p1: String?,
        p2: String?,
        p3: String?,
        p4: String?,
        p5: String?
    ): ResultSet {
        log.info("ResultSet")
        TODO("Implement getCrossReference()")
    }

    override fun getTypeInfo(): ResultSet {
        log.info("getTypeInfo")
        TODO("Implement getTypeInfo()")
    }

    override fun getIndexInfo(p0: String?, p1: String?, p2: String?, p3: Boolean, p4: Boolean): ResultSet {
        log.info("getIndexInfo")
        TODO("Implement getIndexInfo()")
    }

    override fun supportsResultSetType(p0: Int): Boolean {
        log.info("supportsResultSetType")
        TODO("Implement supportsResultSetType()")
    }

    override fun supportsResultSetConcurrency(p0: Int, p1: Int): Boolean {
        log.info("supportsResultSetConcurrency")
        TODO("Implement supportsResultSetConcurrency()")
    }

    override fun ownUpdatesAreVisible(p0: Int): Boolean {
        log.info("ownUpdatesAreVisible")
        TODO("Implement ownUpdatesAreVisible()")
    }

    override fun ownDeletesAreVisible(p0: Int): Boolean {
        log.info("ownDeletesAreVisible")
        TODO("Implement ownDeletesAreVisible()")
    }

    override fun ownInsertsAreVisible(p0: Int): Boolean {
        log.info("ownInsertsAreVisible")
        TODO("Implement ownInsertsAreVisible()")
    }

    override fun othersUpdatesAreVisible(p0: Int): Boolean {
        log.info("othersUpdatesAreVisible")
        TODO("Implement othersUpdatesAreVisible()")
    }

    override fun othersDeletesAreVisible(p0: Int): Boolean {
        log.info("othersDeletesAreVisible")
        TODO("Implement othersDeletesAreVisible()")
    }

    override fun othersInsertsAreVisible(p0: Int): Boolean {
        log.info("othersInsertsAreVisible")
        TODO("Implement othersInsertsAreVisible()")
    }

    override fun updatesAreDetected(p0: Int): Boolean {
        log.info("updatesAreDetected")
        TODO("Implement updatesAreDetected()")
    }

    override fun deletesAreDetected(p0: Int): Boolean {
        log.info("deletesAreDetected")
        TODO("Implement deletesAreDetected()")
    }

    override fun insertsAreDetected(p0: Int): Boolean {
        log.info("insertsAreDetected")
        TODO("Implement insertsAreDetected()")
    }

    override fun supportsBatchUpdates(): Boolean {
        log.info("supportsBatchUpdates")
        TODO("Implement supportsBatchUpdates()")
    }

    override fun getUDTs(p0: String?, p1: String?, p2: String?, p3: IntArray?): ResultSet {
        log.info("getUDTs")
        TODO("Implement getUDTs()")
    }

    override fun getConnection(): Connection {
        log.info("getConnection")
        TODO("Implement getConnection()")
    }

    override fun supportsSavepoints(): Boolean {
        log.info("supportsSavepoints")
        TODO("Implement supportsSavepoints()")
    }

    override fun supportsNamedParameters(): Boolean {
        log.info("supportsNamedParameters")
        TODO("Implement supportsNamedParameters()")
    }

    override fun supportsMultipleOpenResults(): Boolean {
        log.info("supportsMultipleOpenResults")
        TODO("Implement supportsMultipleOpenResults()")
    }

    override fun supportsGetGeneratedKeys(): Boolean {
        log.info("supportsGetGeneratedKeys")
        TODO("Implement supportsGetGeneratedKeys()")
    }

    override fun getSuperTypes(p0: String?, p1: String?, p2: String?): ResultSet {
        log.info("getSuperTypes")
        TODO("Implement getSuperTypes()")
    }

    override fun getSuperTables(p0: String?, p1: String?, p2: String?): ResultSet {
        log.info("getSuperTables")
        TODO("Implement getSuperTables()")
    }

    override fun getAttributes(p0: String?, p1: String?, p2: String?, p3: String?): ResultSet {
        log.info("getAttributes")
        TODO("Implement getAttributes()")
    }

    override fun supportsResultSetHoldability(p0: Int): Boolean {
        log.info("supportsResultSetHoldability")
        TODO("Implement supportsResultSetHoldability()")
    }

    override fun getResultSetHoldability(): Int {
        log.info("getResultSetHoldability")
        TODO("Implement getResultSetHoldability()")
    }

    override fun getDatabaseMajorVersion(): Int {
        log.info("getDatabaseMajorVersion")
        val parts = FlightSqlJdbcDriver.getVersion().split(".")
        log.info("$parts")
        return parts[0].toInt()
    }

    override fun getDatabaseMinorVersion(): Int {
        log.info("getDatabaseMajorVersion")
        val parts = FlightSqlJdbcDriver.getVersion().split(".")
        log.info("$parts")
        return parts[1].toInt()
    }

    override fun getJDBCMajorVersion(): Int {
        log.info("getJDBCMajorVersion")
        TODO("Implement getJDBCMajorVersion()")
    }

    override fun getJDBCMinorVersion(): Int {
        log.info("getJDBCMinorVersion")
        TODO("Implement getJDBCMinorVersion()")
    }

    override fun getSQLStateType(): Int {
        log.info("getSQLStateType")
        TODO("Implement getSQLStateType()")
    }

    override fun locatorsUpdateCopy(): Boolean {
        log.info("locatorsUpdateCopy")
        TODO("Implement locatorsUpdateCopy()")
    }

    override fun supportsStatementPooling(): Boolean {
        log.info("supportsStatementPooling")
        TODO("Implement supportsStatementPooling()")
    }

    override fun getRowIdLifetime(): RowIdLifetime {
        log.info("getRowIdLifetime")
        TODO("Implement getRowIdLifetime()")
    }

    override fun supportsStoredFunctionsUsingCallSyntax(): Boolean {
        log.info("supportsStoredFunctionsUsingCallSyntax")
        TODO("Implement supportsStoredFunctionsUsingCallSyntax()")
    }

    override fun autoCommitFailureClosesAllResultSets(): Boolean {
        log.info("autoCommitFailureClosesAllResultSets")
        TODO("Implement autoCommitFailureClosesAllResultSets()")
    }

    override fun getClientInfoProperties(): ResultSet {
        log.info("getClientInfoProperties")
        TODO("Implement getClientInfoProperties()")
    }

    override fun getFunctions(p0: String?, p1: String?, p2: String?): ResultSet {
        log.info("getFunctions")
        TODO("Implement getFunctions()")
    }

    override fun getFunctionColumns(p0: String?, p1: String?, p2: String?, p3: String?): ResultSet {
        log.info("getFunctionColumns")
        TODO("Implement getFunctionColumns()")
    }

    override fun getPseudoColumns(p0: String?, p1: String?, p2: String?, p3: String?): ResultSet {
        log.info("getPseudoColumns")
        TODO("Implement getPseudoColumns()")
    }

    override fun generatedKeyAlwaysReturned(): Boolean {
        log.info("generatedKeyAlwaysReturned")
        TODO("Implement generatedKeyAlwaysReturned()")
    }
}