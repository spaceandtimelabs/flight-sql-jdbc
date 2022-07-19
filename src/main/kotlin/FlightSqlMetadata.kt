import org.slf4j.LoggerFactory
import java.net.URLClassLoader
import java.sql.Connection
import java.sql.DatabaseMetaData
import java.sql.ResultSet
import java.sql.RowIdLifetime
import java.util.jar.Manifest


class FlightSqlMetadata : DatabaseMetaData {
    val log = LoggerFactory.getLogger(this.javaClass.name)

    override fun <T : Any?> unwrap(p0: Class<T>?): T {
        TODO("Implement unwrap()")
    }

    override fun isWrapperFor(p0: Class<*>?): Boolean {
        TODO("Implement isWrapperFor()")
    }

    override fun allProceduresAreCallable(): Boolean {
        TODO("Implement allProceduresAreCallable()")
    }

    override fun allTablesAreSelectable(): Boolean {
        TODO("Implement allTablesAreSelectable()")
    }

    override fun getURL(): String {
        TODO("Implement getURL()")
    }

    override fun getUserName(): String {
        TODO("Implement getUserName()")
    }

    override fun isReadOnly(): Boolean {
        TODO("Implement isReadOnly()")
    }

    override fun nullsAreSortedHigh(): Boolean {
        TODO("Implement nullsAreSortedHigh()")
    }

    override fun nullsAreSortedLow(): Boolean {
        TODO("Implement nullsAreSortedLow()")
    }

    override fun nullsAreSortedAtStart(): Boolean {
        TODO("Implement nullsAreSortedAtStart()")
    }

    override fun nullsAreSortedAtEnd(): Boolean {
        TODO("Implement nullsAreSortedAtEnd()")
    }

    override fun getDatabaseProductName(): String {
        TODO("Implement getDatabaseProductName()")
    }

    override fun getDatabaseProductVersion(): String {
        TODO("Implement getDatabaseProductVersion()")
    }

    override fun getDriverName(): String {
        return "Apache Arrow Flight SQL JDBC Driver"
    }

    override fun getDriverVersion(): String {
        log.info("getDriverVersion()")
        
        val loader = this.javaClass::class.java.getClassLoader() as URLClassLoader
        val url = loader.findResource("META-INF/MANIFEST.MF")
        val manifest = Manifest(url.openStream())
        val attr = manifest.getMainAttributes()
        val version = attr.getValue("Implementation-Version")
        log.info("Got version {}", version)

        return version
    }

    override fun getDriverMajorVersion(): Int {
        TODO("Implement getDriverMajorVersion()")
    }

    override fun getDriverMinorVersion(): Int {
        TODO("Implement getDriverMinorVersion()")
    }

    override fun usesLocalFiles(): Boolean {
        TODO("Implement usesLocalFiles()")
    }

    override fun usesLocalFilePerTable(): Boolean {
        TODO("Implement usesLocalFilePerTable()")
    }

    override fun supportsMixedCaseIdentifiers(): Boolean {
        TODO("Implement supportsMixedCaseIdentifiers()")
    }

    override fun storesUpperCaseIdentifiers(): Boolean {
        TODO("Implement storesUpperCaseIdentifiers()")
    }

    override fun storesLowerCaseIdentifiers(): Boolean {
        TODO("Implement storesLowerCaseIdentifiers()")
    }

    override fun storesMixedCaseIdentifiers(): Boolean {
        TODO("Implement storesMixedCaseIdentifiers()")
    }

    override fun supportsMixedCaseQuotedIdentifiers(): Boolean {
        TODO("Implement supportsMixedCaseQuotedIdentifiers()")
    }

    override fun storesUpperCaseQuotedIdentifiers(): Boolean {
        TODO("Implement storesUpperCaseQuotedIdentifiers()")
    }

    override fun storesLowerCaseQuotedIdentifiers(): Boolean {
        TODO("Implement storesLowerCaseQuotedIdentifiers()")
    }

    override fun storesMixedCaseQuotedIdentifiers(): Boolean {
        TODO("Implement storesMixedCaseQuotedIdentifiers()")
    }

    override fun getIdentifierQuoteString(): String {
        TODO("Implement getIdentifierQuoteString()")
    }

    override fun getSQLKeywords(): String {
        TODO("Implement getSQLKeywords()")
    }

    override fun getNumericFunctions(): String {
        TODO("Implement getNumericFunctions()")
    }

    override fun getStringFunctions(): String {
        TODO("Implement getStringFunctions()")
    }

    override fun getSystemFunctions(): String {
        TODO("Implement getSystemFunctions()")
    }

    override fun getTimeDateFunctions(): String {
        TODO("Implement getTimeDateFunctions()")
    }

    override fun getSearchStringEscape(): String {
        TODO("Implement getSearchStringEscape()")
    }

    override fun getExtraNameCharacters(): String {
        TODO("Implement getExtraNameCharacters()")
    }

    override fun supportsAlterTableWithAddColumn(): Boolean {
        TODO("Implement supportsAlterTableWithAddColumn()")
    }

    override fun supportsAlterTableWithDropColumn(): Boolean {
        TODO("Implement supportsAlterTableWithDropColumn()")
    }

    override fun supportsColumnAliasing(): Boolean {
        TODO("Implement supportsColumnAliasing()")
    }

    override fun nullPlusNonNullIsNull(): Boolean {
        TODO("Implement nullPlusNonNullIsNull()")
    }

    override fun supportsConvert(): Boolean {
        TODO("Implement supportsConvert()")
    }

    override fun supportsConvert(p0: Int, p1: Int): Boolean {
        TODO("Implement supportsConvert()")
    }

    override fun supportsTableCorrelationNames(): Boolean {
        TODO("Implement supportsTableCorrelationNames()")
    }

    override fun supportsDifferentTableCorrelationNames(): Boolean {
        TODO("Implement supportsDifferentTableCorrelationNames()")
    }

    override fun supportsExpressionsInOrderBy(): Boolean {
        TODO("Implement supportsExpressionsInOrderBy()")
    }

    override fun supportsOrderByUnrelated(): Boolean {
        TODO("Implement supportsOrderByUnrelated()")
    }

    override fun supportsGroupBy(): Boolean {
        TODO("Implement supportsGroupBy()")
    }

    override fun supportsGroupByUnrelated(): Boolean {
        TODO("Implement supportsGroupByUnrelated()")
    }

    override fun supportsGroupByBeyondSelect(): Boolean {
        TODO("Implement supportsGroupByBeyondSelect()")
    }

    override fun supportsLikeEscapeClause(): Boolean {
        TODO("Implement supportsLikeEscapeClause()")
    }

    override fun supportsMultipleResultSets(): Boolean {
        TODO("Implement supportsMultipleResultSets()")
    }

    override fun supportsMultipleTransactions(): Boolean {
        TODO("Implement supportsMultipleTransactions()")
    }

    override fun supportsNonNullableColumns(): Boolean {
        TODO("Implement supportsNonNullableColumns()")
    }

    override fun supportsMinimumSQLGrammar(): Boolean {
        TODO("Implement supportsMinimumSQLGrammar()")
    }

    override fun supportsCoreSQLGrammar(): Boolean {
        TODO("Implement supportsCoreSQLGrammar()")
    }

    override fun supportsExtendedSQLGrammar(): Boolean {
        TODO("Implement supportsExtendedSQLGrammar()")
    }

    override fun supportsANSI92EntryLevelSQL(): Boolean {
        TODO("Implement supportsANSI92EntryLevelSQL()")
    }

    override fun supportsANSI92IntermediateSQL(): Boolean {
        TODO("Implement supportsANSI92IntermediateSQL()")
    }

    override fun supportsANSI92FullSQL(): Boolean {
        TODO("Implement supportsANSI92FullSQL()")
    }

    override fun supportsIntegrityEnhancementFacility(): Boolean {
        TODO("Implement supportsIntegrityEnhancementFacility()")
    }

    override fun supportsOuterJoins(): Boolean {
        TODO("Implement supportsOuterJoins()")
    }

    override fun supportsFullOuterJoins(): Boolean {
        TODO("Implement supportsFullOuterJoins()")
    }

    override fun supportsLimitedOuterJoins(): Boolean {
        TODO("Implement supportsLimitedOuterJoins()")
    }

    override fun getSchemaTerm(): String {
        TODO("Implement getSchemaTerm()")
    }

    override fun getProcedureTerm(): String {
        TODO("Implement getProcedureTerm()")
    }

    override fun getCatalogTerm(): String {
        TODO("Implement getCatalogTerm()")
    }

    override fun isCatalogAtStart(): Boolean {
        TODO("Implement isCatalogAtStart()")
    }

    override fun getCatalogSeparator(): String {
        TODO("Implement getCatalogSeparator()")
    }

    override fun supportsSchemasInDataManipulation(): Boolean {
        TODO("Implement supportsSchemasInDataManipulation()")
    }

    override fun supportsSchemasInProcedureCalls(): Boolean {
        TODO("Implement supportsSchemasInProcedureCalls()")
    }

    override fun supportsSchemasInTableDefinitions(): Boolean {
        TODO("Implement supportsSchemasInTableDefinitions()")
    }

    override fun supportsSchemasInIndexDefinitions(): Boolean {
        TODO("Implement supportsSchemasInIndexDefinitions()")
    }

    override fun supportsSchemasInPrivilegeDefinitions(): Boolean {
        TODO("Implement supportsSchemasInPrivilegeDefinitions()")
    }

    override fun supportsCatalogsInDataManipulation(): Boolean {
        TODO("Implement supportsCatalogsInDataManipulation()")
    }

    override fun supportsCatalogsInProcedureCalls(): Boolean {
        TODO("Implement supportsCatalogsInProcedureCalls()")
    }

    override fun supportsCatalogsInTableDefinitions(): Boolean {
        TODO("Implement supportsCatalogsInTableDefinitions()")
    }

    override fun supportsCatalogsInIndexDefinitions(): Boolean {
        TODO("Implement supportsCatalogsInIndexDefinitions()")
    }

    override fun supportsCatalogsInPrivilegeDefinitions(): Boolean {
        TODO("Implement supportsCatalogsInPrivilegeDefinitions()")
    }

    override fun supportsPositionedDelete(): Boolean {
        TODO("Implement supportsPositionedDelete()")
    }

    override fun supportsPositionedUpdate(): Boolean {
        TODO("Implement supportsPositionedUpdate()")
    }

    override fun supportsSelectForUpdate(): Boolean {
        TODO("Implement supportsSelectForUpdate()")
    }

    override fun supportsStoredProcedures(): Boolean {
        TODO("Implement supportsStoredProcedures()")
    }

    override fun supportsSubqueriesInComparisons(): Boolean {
        TODO("Implement supportsSubqueriesInComparisons()")
    }

    override fun supportsSubqueriesInExists(): Boolean {
        TODO("Implement supportsSubqueriesInExists()")
    }

    override fun supportsSubqueriesInIns(): Boolean {
        TODO("Implement supportsSubqueriesInIns()")
    }

    override fun supportsSubqueriesInQuantifieds(): Boolean {
        TODO("Implement supportsSubqueriesInQuantifieds()")
    }

    override fun supportsCorrelatedSubqueries(): Boolean {
        TODO("Implement supportsCorrelatedSubqueries()")
    }

    override fun supportsUnion(): Boolean {
        TODO("Implement supportsUnion()")
    }

    override fun supportsUnionAll(): Boolean {
        TODO("Implement supportsUnionAll()")
    }

    override fun supportsOpenCursorsAcrossCommit(): Boolean {
        TODO("Implement supportsOpenCursorsAcrossCommit()")
    }

    override fun supportsOpenCursorsAcrossRollback(): Boolean {
        TODO("Implement supportsOpenCursorsAcrossRollback()")
    }

    override fun supportsOpenStatementsAcrossCommit(): Boolean {
        TODO("Implement supportsOpenStatementsAcrossCommit()")
    }

    override fun supportsOpenStatementsAcrossRollback(): Boolean {
        TODO("Implement supportsOpenStatementsAcrossRollback()")
    }

    override fun getMaxBinaryLiteralLength(): Int {
        TODO("Implement getMaxBinaryLiteralLength()")
    }

    override fun getMaxCharLiteralLength(): Int {
        TODO("Implement getMaxCharLiteralLength()")
    }

    override fun getMaxColumnNameLength(): Int {
        TODO("Implement getMaxColumnNameLength()")
    }

    override fun getMaxColumnsInGroupBy(): Int {
        TODO("Implement getMaxColumnsInGroupBy()")
    }

    override fun getMaxColumnsInIndex(): Int {
        TODO("Implement getMaxColumnsInIndex()")
    }

    override fun getMaxColumnsInOrderBy(): Int {
        TODO("Implement getMaxColumnsInOrderBy()")
    }

    override fun getMaxColumnsInSelect(): Int {
        TODO("Implement getMaxColumnsInSelect()")
    }

    override fun getMaxColumnsInTable(): Int {
        TODO("Implement getMaxColumnsInTable()")
    }

    override fun getMaxConnections(): Int {
        TODO("Implement getMaxConnections()")
    }

    override fun getMaxCursorNameLength(): Int {
        TODO("Implement getMaxCursorNameLength()")
    }

    override fun getMaxIndexLength(): Int {
        TODO("Implement getMaxIndexLength()")
    }

    override fun getMaxSchemaNameLength(): Int {
        TODO("Implement getMaxSchemaNameLength()")
    }

    override fun getMaxProcedureNameLength(): Int {
        TODO("Implement getMaxProcedureNameLength()")
    }

    override fun getMaxCatalogNameLength(): Int {
        TODO("Implement getMaxCatalogNameLength()")
    }

    override fun getMaxRowSize(): Int {
        TODO("Implement getMaxRowSize()")
    }

    override fun doesMaxRowSizeIncludeBlobs(): Boolean {
        TODO("Implement doesMaxRowSizeIncludeBlobs()")
    }

    override fun getMaxStatementLength(): Int {
        TODO("Implement getMaxStatementLength()")
    }

    override fun getMaxStatements(): Int {
        TODO("Implement getMaxStatements()")
    }

    override fun getMaxTableNameLength(): Int {
        TODO("Implement getMaxTableNameLength()")
    }

    override fun getMaxTablesInSelect(): Int {
        TODO("Implement getMaxTablesInSelect()")
    }

    override fun getMaxUserNameLength(): Int {
        TODO("Implement getMaxUserNameLength()")
    }

    override fun getDefaultTransactionIsolation(): Int {
        TODO("Implement getDefaultTransactionIsolation()")
    }

    override fun supportsTransactions(): Boolean {
        TODO("Implement supportsTransactions()")
    }

    override fun supportsTransactionIsolationLevel(p0: Int): Boolean {
        TODO("Implement supportsTransactionIsolationLevel()")
    }

    override fun supportsDataDefinitionAndDataManipulationTransactions(): Boolean {
        TODO("Implement supportsDataDefinitionAndDataManipulationTransactions()")
    }

    override fun supportsDataManipulationTransactionsOnly(): Boolean {
        TODO("Implement supportsDataManipulationTransactionsOnly()")
    }

    override fun dataDefinitionCausesTransactionCommit(): Boolean {
        TODO("Implement dataDefinitionCausesTransactionCommit()")
    }

    override fun dataDefinitionIgnoredInTransactions(): Boolean {
        TODO("Implement dataDefinitionIgnoredInTransactions()")
    }

    override fun getProcedures(p0: String?, p1: String?, p2: String?): ResultSet {
        TODO("Implement getProcedures()")
    }

    override fun getProcedureColumns(p0: String?, p1: String?, p2: String?, p3: String?): ResultSet {
        TODO("Implement getProcedureColumns()")
    }

    override fun getTables(p0: String?, p1: String?, p2: String?, p3: Array<out String>?): ResultSet {
        TODO("Implement getTables()")
    }

    override fun getSchemas(): ResultSet {
        TODO("Implement getSchemas()")
    }

    override fun getSchemas(p0: String?, p1: String?): ResultSet {
        TODO("Implement getSchemas()")
    }

    override fun getCatalogs(): ResultSet {
        TODO("Implement getCatalogs()")
    }

    override fun getTableTypes(): ResultSet {
        TODO("Implement getTableTypes()")
    }

    override fun getColumns(p0: String?, p1: String?, p2: String?, p3: String?): ResultSet {
        TODO("Implement getColumns()")
    }

    override fun getColumnPrivileges(p0: String?, p1: String?, p2: String?, p3: String?): ResultSet {
        TODO("Implement getColumnPrivileges()")
    }

    override fun getTablePrivileges(p0: String?, p1: String?, p2: String?): ResultSet {
        TODO("Implement getTablePrivileges()")
    }

    override fun getBestRowIdentifier(p0: String?, p1: String?, p2: String?, p3: Int, p4: Boolean): ResultSet {
        TODO("Implement getBestRowIdentifier()")
    }

    override fun getVersionColumns(p0: String?, p1: String?, p2: String?): ResultSet {
        TODO("Implement getVersionColumns()")
    }

    override fun getPrimaryKeys(p0: String?, p1: String?, p2: String?): ResultSet {
        TODO("Implement getPrimaryKeys()")
    }

    override fun getImportedKeys(p0: String?, p1: String?, p2: String?): ResultSet {
        TODO("Implement getImportedKeys()")
    }

    override fun getExportedKeys(p0: String?, p1: String?, p2: String?): ResultSet {
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
        TODO("Implement getCrossReference()")
    }

    override fun getTypeInfo(): ResultSet {
        TODO("Implement getTypeInfo()")
    }

    override fun getIndexInfo(p0: String?, p1: String?, p2: String?, p3: Boolean, p4: Boolean): ResultSet {
        TODO("Implement getIndexInfo()")
    }

    override fun supportsResultSetType(p0: Int): Boolean {
        TODO("Implement supportsResultSetType()")
    }

    override fun supportsResultSetConcurrency(p0: Int, p1: Int): Boolean {
        TODO("Implement supportsResultSetConcurrency()")
    }

    override fun ownUpdatesAreVisible(p0: Int): Boolean {
        TODO("Implement ownUpdatesAreVisible()")
    }

    override fun ownDeletesAreVisible(p0: Int): Boolean {
        TODO("Implement ownDeletesAreVisible()")
    }

    override fun ownInsertsAreVisible(p0: Int): Boolean {
        TODO("Implement ownInsertsAreVisible()")
    }

    override fun othersUpdatesAreVisible(p0: Int): Boolean {
        TODO("Implement othersUpdatesAreVisible()")
    }

    override fun othersDeletesAreVisible(p0: Int): Boolean {
        TODO("Implement othersDeletesAreVisible()")
    }

    override fun othersInsertsAreVisible(p0: Int): Boolean {
        TODO("Implement othersInsertsAreVisible()")
    }

    override fun updatesAreDetected(p0: Int): Boolean {
        TODO("Implement updatesAreDetected()")
    }

    override fun deletesAreDetected(p0: Int): Boolean {
        TODO("Implement deletesAreDetected()")
    }

    override fun insertsAreDetected(p0: Int): Boolean {
        TODO("Implement insertsAreDetected()")
    }

    override fun supportsBatchUpdates(): Boolean {
        TODO("Implement supportsBatchUpdates()")
    }

    override fun getUDTs(p0: String?, p1: String?, p2: String?, p3: IntArray?): ResultSet {
        TODO("Implement getUDTs()")
    }

    override fun getConnection(): Connection {
        TODO("Implement getConnection()")
    }

    override fun supportsSavepoints(): Boolean {
        TODO("Implement supportsSavepoints()")
    }

    override fun supportsNamedParameters(): Boolean {
        TODO("Implement supportsNamedParameters()")
    }

    override fun supportsMultipleOpenResults(): Boolean {
        TODO("Implement supportsMultipleOpenResults()")
    }

    override fun supportsGetGeneratedKeys(): Boolean {
        TODO("Implement supportsGetGeneratedKeys()")
    }

    override fun getSuperTypes(p0: String?, p1: String?, p2: String?): ResultSet {
        TODO("Implement getSuperTypes()")
    }

    override fun getSuperTables(p0: String?, p1: String?, p2: String?): ResultSet {
        TODO("Implement getSuperTables()")
    }

    override fun getAttributes(p0: String?, p1: String?, p2: String?, p3: String?): ResultSet {
        TODO("Implement getAttributes()")
    }

    override fun supportsResultSetHoldability(p0: Int): Boolean {
        TODO("Implement supportsResultSetHoldability()")
    }

    override fun getResultSetHoldability(): Int {
        TODO("Implement getResultSetHoldability()")
    }

    override fun getDatabaseMajorVersion(): Int {
        TODO("Implement getDatabaseMajorVersion()")
    }

    override fun getDatabaseMinorVersion(): Int {
        TODO("Implement getDatabaseMinorVersion()")
    }

    override fun getJDBCMajorVersion(): Int {
        TODO("Implement getJDBCMajorVersion()")
    }

    override fun getJDBCMinorVersion(): Int {
        TODO("Implement getJDBCMinorVersion()")
    }

    override fun getSQLStateType(): Int {
        TODO("Implement getSQLStateType()")
    }

    override fun locatorsUpdateCopy(): Boolean {
        TODO("Implement locatorsUpdateCopy()")
    }

    override fun supportsStatementPooling(): Boolean {
        TODO("Implement supportsStatementPooling()")
    }

    override fun getRowIdLifetime(): RowIdLifetime {
        TODO("Implement getRowIdLifetime()")
    }

    override fun supportsStoredFunctionsUsingCallSyntax(): Boolean {
        TODO("Implement supportsStoredFunctionsUsingCallSyntax()")
    }

    override fun autoCommitFailureClosesAllResultSets(): Boolean {
        TODO("Implement autoCommitFailureClosesAllResultSets()")
    }

    override fun getClientInfoProperties(): ResultSet {
        TODO("Implement getClientInfoProperties()")
    }

    override fun getFunctions(p0: String?, p1: String?, p2: String?): ResultSet {
        TODO("Implement getFunctions()")
    }

    override fun getFunctionColumns(p0: String?, p1: String?, p2: String?, p3: String?): ResultSet {
        TODO("Implement getFunctionColumns()")
    }

    override fun getPseudoColumns(p0: String?, p1: String?, p2: String?, p3: String?): ResultSet {
        TODO("Implement getPseudoColumns()")
    }

    override fun generatedKeyAlwaysReturned(): Boolean {
        TODO("Implement generatedKeyAlwaysReturned()")
    }
}