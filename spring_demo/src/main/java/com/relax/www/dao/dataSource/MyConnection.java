
package com.relax.www.dao.dataSource;

import java.sql.Array;
import java.sql.Blob;
import java.sql.CallableStatement;
import java.sql.Clob;
import java.sql.DatabaseMetaData;
import java.sql.NClob;
import java.sql.PreparedStatement;
import java.sql.SQLClientInfoException;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.SQLXML;
import java.sql.Savepoint;
import java.sql.Statement;
import java.sql.Struct;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;
import java.util.concurrent.Executor;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ExceptionInterceptor;
import com.mysql.jdbc.Extension;
import com.mysql.jdbc.MySQLConnection;
import com.mysql.jdbc.log.Log;

/** 
* @ClassName: MyConnection 
* @Description: TODO(自定义connection对象实现connection接口) 
* @author no_relax 
* @date 2016年9月28日 下午3:58:39 
*  
*/
public class MyConnection implements Connection {
	private Connection conn;
	private List<Connection> pool;//close方法中需要用

	@Override
	public Statement createStatement() throws SQLException {
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public PreparedStatement prepareStatement(String sql) throws SQLException {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#prepareCall(java.lang.String)
	 */
	@Override
	public CallableStatement prepareCall(String sql) throws SQLException {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#nativeSQL(java.lang.String)
	 */
	@Override
	public String nativeSQL(String sql) throws SQLException {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#setAutoCommit(boolean)
	 */
	@Override
	public void setAutoCommit(boolean autoCommit) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#getAutoCommit()
	 */
	@Override
	public boolean getAutoCommit() throws SQLException {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#commit()
	 */
	@Override
	public void commit() throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#rollback()
	 */
	@Override
	public void rollback() throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#close()
	 */
	@Override
	public void close() throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#isClosed()
	 */
	@Override
	public boolean isClosed() throws SQLException {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#getMetaData()
	 */
	@Override
	public DatabaseMetaData getMetaData() throws SQLException {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#setReadOnly(boolean)
	 */
	@Override
	public void setReadOnly(boolean readOnly) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#isReadOnly()
	 */
	@Override
	public boolean isReadOnly() throws SQLException {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#setCatalog(java.lang.String)
	 */
	@Override
	public void setCatalog(String catalog) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#getCatalog()
	 */
	@Override
	public String getCatalog() throws SQLException {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#setTransactionIsolation(int)
	 */
	@Override
	public void setTransactionIsolation(int level) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#getTransactionIsolation()
	 */
	@Override
	public int getTransactionIsolation() throws SQLException {
		
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#getWarnings()
	 */
	@Override
	public SQLWarning getWarnings() throws SQLException {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#clearWarnings()
	 */
	@Override
	public void clearWarnings() throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#createStatement(int, int)
	 */
	@Override
	public Statement createStatement(int resultSetType, int resultSetConcurrency) throws SQLException {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#prepareStatement(java.lang.String, int, int)
	 */
	@Override
	public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#prepareCall(java.lang.String, int, int)
	 */
	@Override
	public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#getTypeMap()
	 */
	@Override
	public Map<String, Class<?>> getTypeMap() throws SQLException {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#setTypeMap(java.util.Map)
	 */
	@Override
	public void setTypeMap(Map<String, Class<?>> map) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#setHoldability(int)
	 */
	@Override
	public void setHoldability(int holdability) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#getHoldability()
	 */
	@Override
	public int getHoldability() throws SQLException {
		
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#setSavepoint()
	 */
	@Override
	public Savepoint setSavepoint() throws SQLException {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#setSavepoint(java.lang.String)
	 */
	@Override
	public Savepoint setSavepoint(String name) throws SQLException {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#rollback(java.sql.Savepoint)
	 */
	@Override
	public void rollback(Savepoint savepoint) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#releaseSavepoint(java.sql.Savepoint)
	 */
	@Override
	public void releaseSavepoint(Savepoint savepoint) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#createStatement(int, int, int)
	 */
	@Override
	public Statement createStatement(int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#prepareStatement(java.lang.String, int, int, int)
	 */
	@Override
	public PreparedStatement prepareStatement(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#prepareCall(java.lang.String, int, int, int)
	 */
	@Override
	public CallableStatement prepareCall(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#prepareStatement(java.lang.String, int)
	 */
	@Override
	public PreparedStatement prepareStatement(String sql, int autoGeneratedKeys) throws SQLException {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#prepareStatement(java.lang.String, int[])
	 */
	@Override
	public PreparedStatement prepareStatement(String sql, int[] columnIndexes) throws SQLException {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#prepareStatement(java.lang.String, java.lang.String[])
	 */
	@Override
	public PreparedStatement prepareStatement(String sql, String[] columnNames) throws SQLException {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#createClob()
	 */
	@Override
	public Clob createClob() throws SQLException {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#createBlob()
	 */
	@Override
	public Blob createBlob() throws SQLException {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#createNClob()
	 */
	@Override
	public NClob createNClob() throws SQLException {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#createSQLXML()
	 */
	@Override
	public SQLXML createSQLXML() throws SQLException {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#isValid(int)
	 */
	@Override
	public boolean isValid(int timeout) throws SQLException {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#setClientInfo(java.lang.String, java.lang.String)
	 */
	@Override
	public void setClientInfo(String name, String value) throws SQLClientInfoException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#setClientInfo(java.util.Properties)
	 */
	@Override
	public void setClientInfo(Properties properties) throws SQLClientInfoException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#getClientInfo(java.lang.String)
	 */
	@Override
	public String getClientInfo(String name) throws SQLException {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#getClientInfo()
	 */
	@Override
	public Properties getClientInfo() throws SQLException {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#createArrayOf(java.lang.String, java.lang.Object[])
	 */
	@Override
	public Array createArrayOf(String typeName, Object[] elements) throws SQLException {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Connection#createStruct(java.lang.String, java.lang.Object[])
	 */
	@Override
	public Struct createStruct(String typeName, Object[] attributes) throws SQLException {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Wrapper#unwrap(java.lang.Class)
	 */
	@Override
	public <T> T unwrap(Class<T> iface) throws SQLException {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see java.sql.Wrapper#isWrapperFor(java.lang.Class)
	 */
	@Override
	public boolean isWrapperFor(Class<?> iface) throws SQLException {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#exposeAsXml()
	 */
	@Override
	public String exposeAsXml() throws SQLException {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getAllowLoadLocalInfile()
	 */
	@Override
	public boolean getAllowLoadLocalInfile() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getAllowMultiQueries()
	 */
	@Override
	public boolean getAllowMultiQueries() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getAllowNanAndInf()
	 */
	@Override
	public boolean getAllowNanAndInf() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getAllowUrlInLocalInfile()
	 */
	@Override
	public boolean getAllowUrlInLocalInfile() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getAlwaysSendSetIsolation()
	 */
	@Override
	public boolean getAlwaysSendSetIsolation() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getAutoDeserialize()
	 */
	@Override
	public boolean getAutoDeserialize() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getAutoGenerateTestcaseScript()
	 */
	@Override
	public boolean getAutoGenerateTestcaseScript() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getAutoReconnectForPools()
	 */
	@Override
	public boolean getAutoReconnectForPools() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getBlobSendChunkSize()
	 */
	@Override
	public int getBlobSendChunkSize() {
		
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getCacheCallableStatements()
	 */
	@Override
	public boolean getCacheCallableStatements() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getCachePreparedStatements()
	 */
	@Override
	public boolean getCachePreparedStatements() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getCacheResultSetMetadata()
	 */
	@Override
	public boolean getCacheResultSetMetadata() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getCacheServerConfiguration()
	 */
	@Override
	public boolean getCacheServerConfiguration() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getCallableStatementCacheSize()
	 */
	@Override
	public int getCallableStatementCacheSize() {
		
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getCapitalizeTypeNames()
	 */
	@Override
	public boolean getCapitalizeTypeNames() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getCharacterSetResults()
	 */
	@Override
	public String getCharacterSetResults() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getClobberStreamingResults()
	 */
	@Override
	public boolean getClobberStreamingResults() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getClobCharacterEncoding()
	 */
	@Override
	public String getClobCharacterEncoding() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getConnectionCollation()
	 */
	@Override
	public String getConnectionCollation() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getConnectTimeout()
	 */
	@Override
	public int getConnectTimeout() {
		
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getContinueBatchOnError()
	 */
	@Override
	public boolean getContinueBatchOnError() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getCreateDatabaseIfNotExist()
	 */
	@Override
	public boolean getCreateDatabaseIfNotExist() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getDefaultFetchSize()
	 */
	@Override
	public int getDefaultFetchSize() {
		
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getDontTrackOpenResources()
	 */
	@Override
	public boolean getDontTrackOpenResources() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getDumpQueriesOnException()
	 */
	@Override
	public boolean getDumpQueriesOnException() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getDynamicCalendars()
	 */
	@Override
	public boolean getDynamicCalendars() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getElideSetAutoCommits()
	 */
	@Override
	public boolean getElideSetAutoCommits() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getEmptyStringsConvertToZero()
	 */
	@Override
	public boolean getEmptyStringsConvertToZero() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getEmulateLocators()
	 */
	@Override
	public boolean getEmulateLocators() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getEmulateUnsupportedPstmts()
	 */
	@Override
	public boolean getEmulateUnsupportedPstmts() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getEnablePacketDebug()
	 */
	@Override
	public boolean getEnablePacketDebug() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getEncoding()
	 */
	@Override
	public String getEncoding() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getExplainSlowQueries()
	 */
	@Override
	public boolean getExplainSlowQueries() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getFailOverReadOnly()
	 */
	@Override
	public boolean getFailOverReadOnly() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getGatherPerformanceMetrics()
	 */
	@Override
	public boolean getGatherPerformanceMetrics() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getHoldResultsOpenOverStatementClose()
	 */
	@Override
	public boolean getHoldResultsOpenOverStatementClose() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getIgnoreNonTxTables()
	 */
	@Override
	public boolean getIgnoreNonTxTables() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getInitialTimeout()
	 */
	@Override
	public int getInitialTimeout() {
		
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getInteractiveClient()
	 */
	@Override
	public boolean getInteractiveClient() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getIsInteractiveClient()
	 */
	@Override
	public boolean getIsInteractiveClient() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getJdbcCompliantTruncation()
	 */
	@Override
	public boolean getJdbcCompliantTruncation() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getLocatorFetchBufferSize()
	 */
	@Override
	public int getLocatorFetchBufferSize() {
		
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getLogger()
	 */
	@Override
	public String getLogger() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getLoggerClassName()
	 */
	@Override
	public String getLoggerClassName() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getLogSlowQueries()
	 */
	@Override
	public boolean getLogSlowQueries() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getMaintainTimeStats()
	 */
	@Override
	public boolean getMaintainTimeStats() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getMaxQuerySizeToLog()
	 */
	@Override
	public int getMaxQuerySizeToLog() {
		
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getMaxReconnects()
	 */
	@Override
	public int getMaxReconnects() {
		
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getMaxRows()
	 */
	@Override
	public int getMaxRows() {
		
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getMetadataCacheSize()
	 */
	@Override
	public int getMetadataCacheSize() {
		
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getNoDatetimeStringSync()
	 */
	@Override
	public boolean getNoDatetimeStringSync() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getNullCatalogMeansCurrent()
	 */
	@Override
	public boolean getNullCatalogMeansCurrent() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getNullNamePatternMatchesAll()
	 */
	@Override
	public boolean getNullNamePatternMatchesAll() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getPacketDebugBufferSize()
	 */
	@Override
	public int getPacketDebugBufferSize() {
		
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getParanoid()
	 */
	@Override
	public boolean getParanoid() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getPedantic()
	 */
	@Override
	public boolean getPedantic() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getPreparedStatementCacheSize()
	 */
	@Override
	public int getPreparedStatementCacheSize() {
		
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getPreparedStatementCacheSqlLimit()
	 */
	@Override
	public int getPreparedStatementCacheSqlLimit() {
		
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getProfileSql()
	 */
	@Override
	public boolean getProfileSql() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getProfileSQL()
	 */
	@Override
	public boolean getProfileSQL() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getPropertiesTransform()
	 */
	@Override
	public String getPropertiesTransform() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getQueriesBeforeRetryMaster()
	 */
	@Override
	public int getQueriesBeforeRetryMaster() {
		
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getReconnectAtTxEnd()
	 */
	@Override
	public boolean getReconnectAtTxEnd() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getRelaxAutoCommit()
	 */
	@Override
	public boolean getRelaxAutoCommit() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getReportMetricsIntervalMillis()
	 */
	@Override
	public int getReportMetricsIntervalMillis() {
		
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getRequireSSL()
	 */
	@Override
	public boolean getRequireSSL() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getRollbackOnPooledClose()
	 */
	@Override
	public boolean getRollbackOnPooledClose() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getRoundRobinLoadBalance()
	 */
	@Override
	public boolean getRoundRobinLoadBalance() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getRunningCTS13()
	 */
	@Override
	public boolean getRunningCTS13() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getSecondsBeforeRetryMaster()
	 */
	@Override
	public int getSecondsBeforeRetryMaster() {
		
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getServerTimezone()
	 */
	@Override
	public String getServerTimezone() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getSessionVariables()
	 */
	@Override
	public String getSessionVariables() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getSlowQueryThresholdMillis()
	 */
	@Override
	public int getSlowQueryThresholdMillis() {
		
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getSocketFactoryClassName()
	 */
	@Override
	public String getSocketFactoryClassName() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getSocketTimeout()
	 */
	@Override
	public int getSocketTimeout() {
		
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getStrictFloatingPoint()
	 */
	@Override
	public boolean getStrictFloatingPoint() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getStrictUpdates()
	 */
	@Override
	public boolean getStrictUpdates() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getTinyInt1isBit()
	 */
	@Override
	public boolean getTinyInt1isBit() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getTraceProtocol()
	 */
	@Override
	public boolean getTraceProtocol() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getTransformedBitIsBoolean()
	 */
	@Override
	public boolean getTransformedBitIsBoolean() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseCompression()
	 */
	@Override
	public boolean getUseCompression() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseFastIntParsing()
	 */
	@Override
	public boolean getUseFastIntParsing() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseHostsInPrivileges()
	 */
	@Override
	public boolean getUseHostsInPrivileges() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseInformationSchema()
	 */
	@Override
	public boolean getUseInformationSchema() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseLocalSessionState()
	 */
	@Override
	public boolean getUseLocalSessionState() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseOldUTF8Behavior()
	 */
	@Override
	public boolean getUseOldUTF8Behavior() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseOnlyServerErrorMessages()
	 */
	@Override
	public boolean getUseOnlyServerErrorMessages() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseReadAheadInput()
	 */
	@Override
	public boolean getUseReadAheadInput() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseServerPreparedStmts()
	 */
	@Override
	public boolean getUseServerPreparedStmts() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseSqlStateCodes()
	 */
	@Override
	public boolean getUseSqlStateCodes() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseSSL()
	 */
	@Override
	public boolean getUseSSL() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#isUseSSLExplicit()
	 */
	@Override
	public boolean isUseSSLExplicit() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseStreamLengthsInPrepStmts()
	 */
	@Override
	public boolean getUseStreamLengthsInPrepStmts() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseTimezone()
	 */
	@Override
	public boolean getUseTimezone() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseUltraDevWorkAround()
	 */
	@Override
	public boolean getUseUltraDevWorkAround() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseUnbufferedInput()
	 */
	@Override
	public boolean getUseUnbufferedInput() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseUnicode()
	 */
	@Override
	public boolean getUseUnicode() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseUsageAdvisor()
	 */
	@Override
	public boolean getUseUsageAdvisor() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getYearIsDateType()
	 */
	@Override
	public boolean getYearIsDateType() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getZeroDateTimeBehavior()
	 */
	@Override
	public String getZeroDateTimeBehavior() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setAllowLoadLocalInfile(boolean)
	 */
	@Override
	public void setAllowLoadLocalInfile(boolean property) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setAllowMultiQueries(boolean)
	 */
	@Override
	public void setAllowMultiQueries(boolean property) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setAllowNanAndInf(boolean)
	 */
	@Override
	public void setAllowNanAndInf(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setAllowUrlInLocalInfile(boolean)
	 */
	@Override
	public void setAllowUrlInLocalInfile(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setAlwaysSendSetIsolation(boolean)
	 */
	@Override
	public void setAlwaysSendSetIsolation(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setAutoDeserialize(boolean)
	 */
	@Override
	public void setAutoDeserialize(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setAutoGenerateTestcaseScript(boolean)
	 */
	@Override
	public void setAutoGenerateTestcaseScript(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setAutoReconnect(boolean)
	 */
	@Override
	public void setAutoReconnect(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setAutoReconnectForConnectionPools(boolean)
	 */
	@Override
	public void setAutoReconnectForConnectionPools(boolean property) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setAutoReconnectForPools(boolean)
	 */
	@Override
	public void setAutoReconnectForPools(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setBlobSendChunkSize(java.lang.String)
	 */
	@Override
	public void setBlobSendChunkSize(String value) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setCacheCallableStatements(boolean)
	 */
	@Override
	public void setCacheCallableStatements(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setCachePreparedStatements(boolean)
	 */
	@Override
	public void setCachePreparedStatements(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setCacheResultSetMetadata(boolean)
	 */
	@Override
	public void setCacheResultSetMetadata(boolean property) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setCacheServerConfiguration(boolean)
	 */
	@Override
	public void setCacheServerConfiguration(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setCallableStatementCacheSize(int)
	 */
	@Override
	public void setCallableStatementCacheSize(int size) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setCapitalizeDBMDTypes(boolean)
	 */
	@Override
	public void setCapitalizeDBMDTypes(boolean property) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setCapitalizeTypeNames(boolean)
	 */
	@Override
	public void setCapitalizeTypeNames(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setCharacterEncoding(java.lang.String)
	 */
	@Override
	public void setCharacterEncoding(String encoding) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setCharacterSetResults(java.lang.String)
	 */
	@Override
	public void setCharacterSetResults(String characterSet) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setClobberStreamingResults(boolean)
	 */
	@Override
	public void setClobberStreamingResults(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setClobCharacterEncoding(java.lang.String)
	 */
	@Override
	public void setClobCharacterEncoding(String encoding) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setConnectionCollation(java.lang.String)
	 */
	@Override
	public void setConnectionCollation(String collation) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setConnectTimeout(int)
	 */
	@Override
	public void setConnectTimeout(int timeoutMs) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setContinueBatchOnError(boolean)
	 */
	@Override
	public void setContinueBatchOnError(boolean property) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setCreateDatabaseIfNotExist(boolean)
	 */
	@Override
	public void setCreateDatabaseIfNotExist(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setDefaultFetchSize(int)
	 */
	@Override
	public void setDefaultFetchSize(int n) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setDetectServerPreparedStmts(boolean)
	 */
	@Override
	public void setDetectServerPreparedStmts(boolean property) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setDontTrackOpenResources(boolean)
	 */
	@Override
	public void setDontTrackOpenResources(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setDumpQueriesOnException(boolean)
	 */
	@Override
	public void setDumpQueriesOnException(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setDynamicCalendars(boolean)
	 */
	@Override
	public void setDynamicCalendars(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setElideSetAutoCommits(boolean)
	 */
	@Override
	public void setElideSetAutoCommits(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setEmptyStringsConvertToZero(boolean)
	 */
	@Override
	public void setEmptyStringsConvertToZero(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setEmulateLocators(boolean)
	 */
	@Override
	public void setEmulateLocators(boolean property) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setEmulateUnsupportedPstmts(boolean)
	 */
	@Override
	public void setEmulateUnsupportedPstmts(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setEnablePacketDebug(boolean)
	 */
	@Override
	public void setEnablePacketDebug(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setEncoding(java.lang.String)
	 */
	@Override
	public void setEncoding(String property) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setExplainSlowQueries(boolean)
	 */
	@Override
	public void setExplainSlowQueries(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setFailOverReadOnly(boolean)
	 */
	@Override
	public void setFailOverReadOnly(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setGatherPerformanceMetrics(boolean)
	 */
	@Override
	public void setGatherPerformanceMetrics(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setHoldResultsOpenOverStatementClose(boolean)
	 */
	@Override
	public void setHoldResultsOpenOverStatementClose(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setIgnoreNonTxTables(boolean)
	 */
	@Override
	public void setIgnoreNonTxTables(boolean property) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setInitialTimeout(int)
	 */
	@Override
	public void setInitialTimeout(int property) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setIsInteractiveClient(boolean)
	 */
	@Override
	public void setIsInteractiveClient(boolean property) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setJdbcCompliantTruncation(boolean)
	 */
	@Override
	public void setJdbcCompliantTruncation(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setLocatorFetchBufferSize(java.lang.String)
	 */
	@Override
	public void setLocatorFetchBufferSize(String value) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setLogger(java.lang.String)
	 */
	@Override
	public void setLogger(String property) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setLoggerClassName(java.lang.String)
	 */
	@Override
	public void setLoggerClassName(String className) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setLogSlowQueries(boolean)
	 */
	@Override
	public void setLogSlowQueries(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setMaintainTimeStats(boolean)
	 */
	@Override
	public void setMaintainTimeStats(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setMaxQuerySizeToLog(int)
	 */
	@Override
	public void setMaxQuerySizeToLog(int sizeInBytes) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setMaxReconnects(int)
	 */
	@Override
	public void setMaxReconnects(int property) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setMaxRows(int)
	 */
	@Override
	public void setMaxRows(int property) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setMetadataCacheSize(int)
	 */
	@Override
	public void setMetadataCacheSize(int value) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setNoDatetimeStringSync(boolean)
	 */
	@Override
	public void setNoDatetimeStringSync(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setNullCatalogMeansCurrent(boolean)
	 */
	@Override
	public void setNullCatalogMeansCurrent(boolean value) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setNullNamePatternMatchesAll(boolean)
	 */
	@Override
	public void setNullNamePatternMatchesAll(boolean value) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setPacketDebugBufferSize(int)
	 */
	@Override
	public void setPacketDebugBufferSize(int size) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setParanoid(boolean)
	 */
	@Override
	public void setParanoid(boolean property) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setPedantic(boolean)
	 */
	@Override
	public void setPedantic(boolean property) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setPreparedStatementCacheSize(int)
	 */
	@Override
	public void setPreparedStatementCacheSize(int cacheSize) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setPreparedStatementCacheSqlLimit(int)
	 */
	@Override
	public void setPreparedStatementCacheSqlLimit(int cacheSqlLimit) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setProfileSql(boolean)
	 */
	@Override
	public void setProfileSql(boolean property) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setProfileSQL(boolean)
	 */
	@Override
	public void setProfileSQL(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setPropertiesTransform(java.lang.String)
	 */
	@Override
	public void setPropertiesTransform(String value) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setQueriesBeforeRetryMaster(int)
	 */
	@Override
	public void setQueriesBeforeRetryMaster(int property) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setReconnectAtTxEnd(boolean)
	 */
	@Override
	public void setReconnectAtTxEnd(boolean property) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setRelaxAutoCommit(boolean)
	 */
	@Override
	public void setRelaxAutoCommit(boolean property) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setReportMetricsIntervalMillis(int)
	 */
	@Override
	public void setReportMetricsIntervalMillis(int millis) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setRequireSSL(boolean)
	 */
	@Override
	public void setRequireSSL(boolean property) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setRetainStatementAfterResultSetClose(boolean)
	 */
	@Override
	public void setRetainStatementAfterResultSetClose(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setRollbackOnPooledClose(boolean)
	 */
	@Override
	public void setRollbackOnPooledClose(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setRoundRobinLoadBalance(boolean)
	 */
	@Override
	public void setRoundRobinLoadBalance(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setRunningCTS13(boolean)
	 */
	@Override
	public void setRunningCTS13(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setSecondsBeforeRetryMaster(int)
	 */
	@Override
	public void setSecondsBeforeRetryMaster(int property) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setServerTimezone(java.lang.String)
	 */
	@Override
	public void setServerTimezone(String property) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setSessionVariables(java.lang.String)
	 */
	@Override
	public void setSessionVariables(String variables) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setSlowQueryThresholdMillis(int)
	 */
	@Override
	public void setSlowQueryThresholdMillis(int millis) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setSocketFactoryClassName(java.lang.String)
	 */
	@Override
	public void setSocketFactoryClassName(String property) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setSocketTimeout(int)
	 */
	@Override
	public void setSocketTimeout(int property) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setStrictFloatingPoint(boolean)
	 */
	@Override
	public void setStrictFloatingPoint(boolean property) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setStrictUpdates(boolean)
	 */
	@Override
	public void setStrictUpdates(boolean property) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setTinyInt1isBit(boolean)
	 */
	@Override
	public void setTinyInt1isBit(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setTraceProtocol(boolean)
	 */
	@Override
	public void setTraceProtocol(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setTransformedBitIsBoolean(boolean)
	 */
	@Override
	public void setTransformedBitIsBoolean(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseCompression(boolean)
	 */
	@Override
	public void setUseCompression(boolean property) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseFastIntParsing(boolean)
	 */
	@Override
	public void setUseFastIntParsing(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseHostsInPrivileges(boolean)
	 */
	@Override
	public void setUseHostsInPrivileges(boolean property) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseInformationSchema(boolean)
	 */
	@Override
	public void setUseInformationSchema(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseLocalSessionState(boolean)
	 */
	@Override
	public void setUseLocalSessionState(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseOldUTF8Behavior(boolean)
	 */
	@Override
	public void setUseOldUTF8Behavior(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseOnlyServerErrorMessages(boolean)
	 */
	@Override
	public void setUseOnlyServerErrorMessages(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseReadAheadInput(boolean)
	 */
	@Override
	public void setUseReadAheadInput(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseServerPreparedStmts(boolean)
	 */
	@Override
	public void setUseServerPreparedStmts(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseSqlStateCodes(boolean)
	 */
	@Override
	public void setUseSqlStateCodes(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseSSL(boolean)
	 */
	@Override
	public void setUseSSL(boolean property) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseStreamLengthsInPrepStmts(boolean)
	 */
	@Override
	public void setUseStreamLengthsInPrepStmts(boolean property) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseTimezone(boolean)
	 */
	@Override
	public void setUseTimezone(boolean property) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseUltraDevWorkAround(boolean)
	 */
	@Override
	public void setUseUltraDevWorkAround(boolean property) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseUnbufferedInput(boolean)
	 */
	@Override
	public void setUseUnbufferedInput(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseUnicode(boolean)
	 */
	@Override
	public void setUseUnicode(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseUsageAdvisor(boolean)
	 */
	@Override
	public void setUseUsageAdvisor(boolean useUsageAdvisorFlag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setYearIsDateType(boolean)
	 */
	@Override
	public void setYearIsDateType(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setZeroDateTimeBehavior(java.lang.String)
	 */
	@Override
	public void setZeroDateTimeBehavior(String behavior) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#useUnbufferedInput()
	 */
	@Override
	public boolean useUnbufferedInput() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseCursorFetch()
	 */
	@Override
	public boolean getUseCursorFetch() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseCursorFetch(boolean)
	 */
	@Override
	public void setUseCursorFetch(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getOverrideSupportsIntegrityEnhancementFacility()
	 */
	@Override
	public boolean getOverrideSupportsIntegrityEnhancementFacility() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setOverrideSupportsIntegrityEnhancementFacility(boolean)
	 */
	@Override
	public void setOverrideSupportsIntegrityEnhancementFacility(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getNoTimezoneConversionForTimeType()
	 */
	@Override
	public boolean getNoTimezoneConversionForTimeType() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setNoTimezoneConversionForTimeType(boolean)
	 */
	@Override
	public void setNoTimezoneConversionForTimeType(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getNoTimezoneConversionForDateType()
	 */
	@Override
	public boolean getNoTimezoneConversionForDateType() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setNoTimezoneConversionForDateType(boolean)
	 */
	@Override
	public void setNoTimezoneConversionForDateType(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getCacheDefaultTimezone()
	 */
	@Override
	public boolean getCacheDefaultTimezone() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setCacheDefaultTimezone(boolean)
	 */
	@Override
	public void setCacheDefaultTimezone(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseJDBCCompliantTimezoneShift()
	 */
	@Override
	public boolean getUseJDBCCompliantTimezoneShift() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseJDBCCompliantTimezoneShift(boolean)
	 */
	@Override
	public void setUseJDBCCompliantTimezoneShift(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getAutoClosePStmtStreams()
	 */
	@Override
	public boolean getAutoClosePStmtStreams() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setAutoClosePStmtStreams(boolean)
	 */
	@Override
	public void setAutoClosePStmtStreams(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getProcessEscapeCodesForPrepStmts()
	 */
	@Override
	public boolean getProcessEscapeCodesForPrepStmts() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setProcessEscapeCodesForPrepStmts(boolean)
	 */
	@Override
	public void setProcessEscapeCodesForPrepStmts(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseGmtMillisForDatetimes()
	 */
	@Override
	public boolean getUseGmtMillisForDatetimes() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseGmtMillisForDatetimes(boolean)
	 */
	@Override
	public void setUseGmtMillisForDatetimes(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getDumpMetadataOnColumnNotFound()
	 */
	@Override
	public boolean getDumpMetadataOnColumnNotFound() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setDumpMetadataOnColumnNotFound(boolean)
	 */
	@Override
	public void setDumpMetadataOnColumnNotFound(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getResourceId()
	 */
	@Override
	public String getResourceId() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setResourceId(java.lang.String)
	 */
	@Override
	public void setResourceId(String resourceId) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getRewriteBatchedStatements()
	 */
	@Override
	public boolean getRewriteBatchedStatements() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setRewriteBatchedStatements(boolean)
	 */
	@Override
	public void setRewriteBatchedStatements(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getJdbcCompliantTruncationForReads()
	 */
	@Override
	public boolean getJdbcCompliantTruncationForReads() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setJdbcCompliantTruncationForReads(boolean)
	 */
	@Override
	public void setJdbcCompliantTruncationForReads(boolean jdbcCompliantTruncationForReads) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseJvmCharsetConverters()
	 */
	@Override
	public boolean getUseJvmCharsetConverters() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseJvmCharsetConverters(boolean)
	 */
	@Override
	public void setUseJvmCharsetConverters(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getPinGlobalTxToPhysicalConnection()
	 */
	@Override
	public boolean getPinGlobalTxToPhysicalConnection() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setPinGlobalTxToPhysicalConnection(boolean)
	 */
	@Override
	public void setPinGlobalTxToPhysicalConnection(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setGatherPerfMetrics(boolean)
	 */
	@Override
	public void setGatherPerfMetrics(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getGatherPerfMetrics()
	 */
	@Override
	public boolean getGatherPerfMetrics() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUltraDevHack(boolean)
	 */
	@Override
	public void setUltraDevHack(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUltraDevHack()
	 */
	@Override
	public boolean getUltraDevHack() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setInteractiveClient(boolean)
	 */
	@Override
	public void setInteractiveClient(boolean property) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setSocketFactory(java.lang.String)
	 */
	@Override
	public void setSocketFactory(String name) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getSocketFactory()
	 */
	@Override
	public String getSocketFactory() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseServerPrepStmts(boolean)
	 */
	@Override
	public void setUseServerPrepStmts(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseServerPrepStmts()
	 */
	@Override
	public boolean getUseServerPrepStmts() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setCacheCallableStmts(boolean)
	 */
	@Override
	public void setCacheCallableStmts(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getCacheCallableStmts()
	 */
	@Override
	public boolean getCacheCallableStmts() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setCachePrepStmts(boolean)
	 */
	@Override
	public void setCachePrepStmts(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getCachePrepStmts()
	 */
	@Override
	public boolean getCachePrepStmts() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setCallableStmtCacheSize(int)
	 */
	@Override
	public void setCallableStmtCacheSize(int cacheSize) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getCallableStmtCacheSize()
	 */
	@Override
	public int getCallableStmtCacheSize() {
		
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setPrepStmtCacheSize(int)
	 */
	@Override
	public void setPrepStmtCacheSize(int cacheSize) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getPrepStmtCacheSize()
	 */
	@Override
	public int getPrepStmtCacheSize() {
		
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setPrepStmtCacheSqlLimit(int)
	 */
	@Override
	public void setPrepStmtCacheSqlLimit(int sqlLimit) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getPrepStmtCacheSqlLimit()
	 */
	@Override
	public int getPrepStmtCacheSqlLimit() {
		
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getNoAccessToProcedureBodies()
	 */
	@Override
	public boolean getNoAccessToProcedureBodies() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setNoAccessToProcedureBodies(boolean)
	 */
	@Override
	public void setNoAccessToProcedureBodies(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseOldAliasMetadataBehavior()
	 */
	@Override
	public boolean getUseOldAliasMetadataBehavior() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseOldAliasMetadataBehavior(boolean)
	 */
	@Override
	public void setUseOldAliasMetadataBehavior(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getClientCertificateKeyStorePassword()
	 */
	@Override
	public String getClientCertificateKeyStorePassword() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setClientCertificateKeyStorePassword(java.lang.String)
	 */
	@Override
	public void setClientCertificateKeyStorePassword(String value) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getClientCertificateKeyStoreType()
	 */
	@Override
	public String getClientCertificateKeyStoreType() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setClientCertificateKeyStoreType(java.lang.String)
	 */
	@Override
	public void setClientCertificateKeyStoreType(String value) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getClientCertificateKeyStoreUrl()
	 */
	@Override
	public String getClientCertificateKeyStoreUrl() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setClientCertificateKeyStoreUrl(java.lang.String)
	 */
	@Override
	public void setClientCertificateKeyStoreUrl(String value) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getTrustCertificateKeyStorePassword()
	 */
	@Override
	public String getTrustCertificateKeyStorePassword() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setTrustCertificateKeyStorePassword(java.lang.String)
	 */
	@Override
	public void setTrustCertificateKeyStorePassword(String value) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getTrustCertificateKeyStoreType()
	 */
	@Override
	public String getTrustCertificateKeyStoreType() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setTrustCertificateKeyStoreType(java.lang.String)
	 */
	@Override
	public void setTrustCertificateKeyStoreType(String value) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getTrustCertificateKeyStoreUrl()
	 */
	@Override
	public String getTrustCertificateKeyStoreUrl() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setTrustCertificateKeyStoreUrl(java.lang.String)
	 */
	@Override
	public void setTrustCertificateKeyStoreUrl(String value) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseSSPSCompatibleTimezoneShift()
	 */
	@Override
	public boolean getUseSSPSCompatibleTimezoneShift() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseSSPSCompatibleTimezoneShift(boolean)
	 */
	@Override
	public void setUseSSPSCompatibleTimezoneShift(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getTreatUtilDateAsTimestamp()
	 */
	@Override
	public boolean getTreatUtilDateAsTimestamp() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setTreatUtilDateAsTimestamp(boolean)
	 */
	@Override
	public void setTreatUtilDateAsTimestamp(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseFastDateParsing()
	 */
	@Override
	public boolean getUseFastDateParsing() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseFastDateParsing(boolean)
	 */
	@Override
	public void setUseFastDateParsing(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getLocalSocketAddress()
	 */
	@Override
	public String getLocalSocketAddress() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setLocalSocketAddress(java.lang.String)
	 */
	@Override
	public void setLocalSocketAddress(String address) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseConfigs(java.lang.String)
	 */
	@Override
	public void setUseConfigs(String configs) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseConfigs()
	 */
	@Override
	public String getUseConfigs() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getGenerateSimpleParameterMetadata()
	 */
	@Override
	public boolean getGenerateSimpleParameterMetadata() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setGenerateSimpleParameterMetadata(boolean)
	 */
	@Override
	public void setGenerateSimpleParameterMetadata(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getLogXaCommands()
	 */
	@Override
	public boolean getLogXaCommands() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setLogXaCommands(boolean)
	 */
	@Override
	public void setLogXaCommands(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getResultSetSizeThreshold()
	 */
	@Override
	public int getResultSetSizeThreshold() {
		
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setResultSetSizeThreshold(int)
	 */
	@Override
	public void setResultSetSizeThreshold(int threshold) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getNetTimeoutForStreamingResults()
	 */
	@Override
	public int getNetTimeoutForStreamingResults() {
		
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setNetTimeoutForStreamingResults(int)
	 */
	@Override
	public void setNetTimeoutForStreamingResults(int value) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getEnableQueryTimeouts()
	 */
	@Override
	public boolean getEnableQueryTimeouts() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setEnableQueryTimeouts(boolean)
	 */
	@Override
	public void setEnableQueryTimeouts(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getPadCharsWithSpace()
	 */
	@Override
	public boolean getPadCharsWithSpace() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setPadCharsWithSpace(boolean)
	 */
	@Override
	public void setPadCharsWithSpace(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseDynamicCharsetInfo()
	 */
	@Override
	public boolean getUseDynamicCharsetInfo() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseDynamicCharsetInfo(boolean)
	 */
	@Override
	public void setUseDynamicCharsetInfo(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getClientInfoProvider()
	 */
	@Override
	public String getClientInfoProvider() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setClientInfoProvider(java.lang.String)
	 */
	@Override
	public void setClientInfoProvider(String classname) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getPopulateInsertRowWithDefaultValues()
	 */
	@Override
	public boolean getPopulateInsertRowWithDefaultValues() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setPopulateInsertRowWithDefaultValues(boolean)
	 */
	@Override
	public void setPopulateInsertRowWithDefaultValues(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getLoadBalanceStrategy()
	 */
	@Override
	public String getLoadBalanceStrategy() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setLoadBalanceStrategy(java.lang.String)
	 */
	@Override
	public void setLoadBalanceStrategy(String strategy) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getTcpNoDelay()
	 */
	@Override
	public boolean getTcpNoDelay() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setTcpNoDelay(boolean)
	 */
	@Override
	public void setTcpNoDelay(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getTcpKeepAlive()
	 */
	@Override
	public boolean getTcpKeepAlive() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setTcpKeepAlive(boolean)
	 */
	@Override
	public void setTcpKeepAlive(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getTcpRcvBuf()
	 */
	@Override
	public int getTcpRcvBuf() {
		
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setTcpRcvBuf(int)
	 */
	@Override
	public void setTcpRcvBuf(int bufSize) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getTcpSndBuf()
	 */
	@Override
	public int getTcpSndBuf() {
		
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setTcpSndBuf(int)
	 */
	@Override
	public void setTcpSndBuf(int bufSize) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getTcpTrafficClass()
	 */
	@Override
	public int getTcpTrafficClass() {
		
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setTcpTrafficClass(int)
	 */
	@Override
	public void setTcpTrafficClass(int classFlags) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseNanosForElapsedTime()
	 */
	@Override
	public boolean getUseNanosForElapsedTime() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseNanosForElapsedTime(boolean)
	 */
	@Override
	public void setUseNanosForElapsedTime(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getSlowQueryThresholdNanos()
	 */
	@Override
	public long getSlowQueryThresholdNanos() {
		
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setSlowQueryThresholdNanos(long)
	 */
	@Override
	public void setSlowQueryThresholdNanos(long nanos) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getStatementInterceptors()
	 */
	@Override
	public String getStatementInterceptors() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setStatementInterceptors(java.lang.String)
	 */
	@Override
	public void setStatementInterceptors(String value) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseDirectRowUnpack()
	 */
	@Override
	public boolean getUseDirectRowUnpack() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseDirectRowUnpack(boolean)
	 */
	@Override
	public void setUseDirectRowUnpack(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getLargeRowSizeThreshold()
	 */
	@Override
	public String getLargeRowSizeThreshold() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setLargeRowSizeThreshold(java.lang.String)
	 */
	@Override
	public void setLargeRowSizeThreshold(String value) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseBlobToStoreUTF8OutsideBMP()
	 */
	@Override
	public boolean getUseBlobToStoreUTF8OutsideBMP() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseBlobToStoreUTF8OutsideBMP(boolean)
	 */
	@Override
	public void setUseBlobToStoreUTF8OutsideBMP(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUtf8OutsideBmpExcludedColumnNamePattern()
	 */
	@Override
	public String getUtf8OutsideBmpExcludedColumnNamePattern() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUtf8OutsideBmpExcludedColumnNamePattern(java.lang.String)
	 */
	@Override
	public void setUtf8OutsideBmpExcludedColumnNamePattern(String regexPattern) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUtf8OutsideBmpIncludedColumnNamePattern()
	 */
	@Override
	public String getUtf8OutsideBmpIncludedColumnNamePattern() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUtf8OutsideBmpIncludedColumnNamePattern(java.lang.String)
	 */
	@Override
	public void setUtf8OutsideBmpIncludedColumnNamePattern(String regexPattern) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getIncludeInnodbStatusInDeadlockExceptions()
	 */
	@Override
	public boolean getIncludeInnodbStatusInDeadlockExceptions() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setIncludeInnodbStatusInDeadlockExceptions(boolean)
	 */
	@Override
	public void setIncludeInnodbStatusInDeadlockExceptions(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getIncludeThreadDumpInDeadlockExceptions()
	 */
	@Override
	public boolean getIncludeThreadDumpInDeadlockExceptions() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setIncludeThreadDumpInDeadlockExceptions(boolean)
	 */
	@Override
	public void setIncludeThreadDumpInDeadlockExceptions(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getIncludeThreadNamesAsStatementComment()
	 */
	@Override
	public boolean getIncludeThreadNamesAsStatementComment() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setIncludeThreadNamesAsStatementComment(boolean)
	 */
	@Override
	public void setIncludeThreadNamesAsStatementComment(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getBlobsAreStrings()
	 */
	@Override
	public boolean getBlobsAreStrings() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setBlobsAreStrings(boolean)
	 */
	@Override
	public void setBlobsAreStrings(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getFunctionsNeverReturnBlobs()
	 */
	@Override
	public boolean getFunctionsNeverReturnBlobs() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setFunctionsNeverReturnBlobs(boolean)
	 */
	@Override
	public void setFunctionsNeverReturnBlobs(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getAutoSlowLog()
	 */
	@Override
	public boolean getAutoSlowLog() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setAutoSlowLog(boolean)
	 */
	@Override
	public void setAutoSlowLog(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getConnectionLifecycleInterceptors()
	 */
	@Override
	public String getConnectionLifecycleInterceptors() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setConnectionLifecycleInterceptors(java.lang.String)
	 */
	@Override
	public void setConnectionLifecycleInterceptors(String interceptors) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getProfilerEventHandler()
	 */
	@Override
	public String getProfilerEventHandler() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setProfilerEventHandler(java.lang.String)
	 */
	@Override
	public void setProfilerEventHandler(String handler) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getVerifyServerCertificate()
	 */
	@Override
	public boolean getVerifyServerCertificate() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setVerifyServerCertificate(boolean)
	 */
	@Override
	public void setVerifyServerCertificate(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseLegacyDatetimeCode()
	 */
	@Override
	public boolean getUseLegacyDatetimeCode() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseLegacyDatetimeCode(boolean)
	 */
	@Override
	public void setUseLegacyDatetimeCode(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getSendFractionalSeconds()
	 */
	@Override
	public boolean getSendFractionalSeconds() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setSendFractionalSeconds(boolean)
	 */
	@Override
	public void setSendFractionalSeconds(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getSelfDestructOnPingSecondsLifetime()
	 */
	@Override
	public int getSelfDestructOnPingSecondsLifetime() {
		
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setSelfDestructOnPingSecondsLifetime(int)
	 */
	@Override
	public void setSelfDestructOnPingSecondsLifetime(int seconds) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getSelfDestructOnPingMaxOperations()
	 */
	@Override
	public int getSelfDestructOnPingMaxOperations() {
		
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setSelfDestructOnPingMaxOperations(int)
	 */
	@Override
	public void setSelfDestructOnPingMaxOperations(int maxOperations) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseColumnNamesInFindColumn()
	 */
	@Override
	public boolean getUseColumnNamesInFindColumn() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseColumnNamesInFindColumn(boolean)
	 */
	@Override
	public void setUseColumnNamesInFindColumn(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseLocalTransactionState()
	 */
	@Override
	public boolean getUseLocalTransactionState() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseLocalTransactionState(boolean)
	 */
	@Override
	public void setUseLocalTransactionState(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getCompensateOnDuplicateKeyUpdateCounts()
	 */
	@Override
	public boolean getCompensateOnDuplicateKeyUpdateCounts() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setCompensateOnDuplicateKeyUpdateCounts(boolean)
	 */
	@Override
	public void setCompensateOnDuplicateKeyUpdateCounts(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setUseAffectedRows(boolean)
	 */
	@Override
	public void setUseAffectedRows(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getUseAffectedRows()
	 */
	@Override
	public boolean getUseAffectedRows() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setPasswordCharacterEncoding(java.lang.String)
	 */
	@Override
	public void setPasswordCharacterEncoding(String characterSet) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getPasswordCharacterEncoding()
	 */
	@Override
	public String getPasswordCharacterEncoding() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getLoadBalanceBlacklistTimeout()
	 */
	@Override
	public int getLoadBalanceBlacklistTimeout() {
		
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setLoadBalanceBlacklistTimeout(int)
	 */
	@Override
	public void setLoadBalanceBlacklistTimeout(int loadBalanceBlacklistTimeout) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setRetriesAllDown(int)
	 */
	@Override
	public void setRetriesAllDown(int retriesAllDown) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getRetriesAllDown()
	 */
	@Override
	public int getRetriesAllDown() {
		
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getExceptionInterceptor()
	 */
	@Override
	public ExceptionInterceptor getExceptionInterceptor() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setExceptionInterceptors(java.lang.String)
	 */
	@Override
	public void setExceptionInterceptors(String exceptionInterceptors) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getExceptionInterceptors()
	 */
	@Override
	public String getExceptionInterceptors() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getQueryTimeoutKillsConnection()
	 */
	@Override
	public boolean getQueryTimeoutKillsConnection() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setQueryTimeoutKillsConnection(boolean)
	 */
	@Override
	public void setQueryTimeoutKillsConnection(boolean queryTimeoutKillsConnection) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getMaxAllowedPacket()
	 */
	@Override
	public int getMaxAllowedPacket() {
		
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getRetainStatementAfterResultSetClose()
	 */
	@Override
	public boolean getRetainStatementAfterResultSetClose() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getLoadBalancePingTimeout()
	 */
	@Override
	public int getLoadBalancePingTimeout() {
		
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setLoadBalancePingTimeout(int)
	 */
	@Override
	public void setLoadBalancePingTimeout(int loadBalancePingTimeout) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getLoadBalanceValidateConnectionOnSwapServer()
	 */
	@Override
	public boolean getLoadBalanceValidateConnectionOnSwapServer() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setLoadBalanceValidateConnectionOnSwapServer(boolean)
	 */
	@Override
	public void setLoadBalanceValidateConnectionOnSwapServer(boolean loadBalanceValidateConnectionOnSwapServer) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getLoadBalanceConnectionGroup()
	 */
	@Override
	public String getLoadBalanceConnectionGroup() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setLoadBalanceConnectionGroup(java.lang.String)
	 */
	@Override
	public void setLoadBalanceConnectionGroup(String loadBalanceConnectionGroup) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getLoadBalanceExceptionChecker()
	 */
	@Override
	public String getLoadBalanceExceptionChecker() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setLoadBalanceExceptionChecker(java.lang.String)
	 */
	@Override
	public void setLoadBalanceExceptionChecker(String loadBalanceExceptionChecker) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getLoadBalanceSQLStateFailover()
	 */
	@Override
	public String getLoadBalanceSQLStateFailover() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setLoadBalanceSQLStateFailover(java.lang.String)
	 */
	@Override
	public void setLoadBalanceSQLStateFailover(String loadBalanceSQLStateFailover) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getLoadBalanceSQLExceptionSubclassFailover()
	 */
	@Override
	public String getLoadBalanceSQLExceptionSubclassFailover() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setLoadBalanceSQLExceptionSubclassFailover(java.lang.String)
	 */
	@Override
	public void setLoadBalanceSQLExceptionSubclassFailover(String loadBalanceSQLExceptionSubclassFailover) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getLoadBalanceEnableJMX()
	 */
	@Override
	public boolean getLoadBalanceEnableJMX() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setLoadBalanceEnableJMX(boolean)
	 */
	@Override
	public void setLoadBalanceEnableJMX(boolean loadBalanceEnableJMX) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setLoadBalanceAutoCommitStatementThreshold(int)
	 */
	@Override
	public void setLoadBalanceAutoCommitStatementThreshold(int loadBalanceAutoCommitStatementThreshold) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getLoadBalanceAutoCommitStatementThreshold()
	 */
	@Override
	public int getLoadBalanceAutoCommitStatementThreshold() {
		
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setLoadBalanceAutoCommitStatementRegex(java.lang.String)
	 */
	@Override
	public void setLoadBalanceAutoCommitStatementRegex(String loadBalanceAutoCommitStatementRegex) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getLoadBalanceAutoCommitStatementRegex()
	 */
	@Override
	public String getLoadBalanceAutoCommitStatementRegex() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setAuthenticationPlugins(java.lang.String)
	 */
	@Override
	public void setAuthenticationPlugins(String authenticationPlugins) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getAuthenticationPlugins()
	 */
	@Override
	public String getAuthenticationPlugins() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setDisabledAuthenticationPlugins(java.lang.String)
	 */
	@Override
	public void setDisabledAuthenticationPlugins(String disabledAuthenticationPlugins) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getDisabledAuthenticationPlugins()
	 */
	@Override
	public String getDisabledAuthenticationPlugins() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setDefaultAuthenticationPlugin(java.lang.String)
	 */
	@Override
	public void setDefaultAuthenticationPlugin(String defaultAuthenticationPlugin) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getDefaultAuthenticationPlugin()
	 */
	@Override
	public String getDefaultAuthenticationPlugin() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setParseInfoCacheFactory(java.lang.String)
	 */
	@Override
	public void setParseInfoCacheFactory(String factoryClassname) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getParseInfoCacheFactory()
	 */
	@Override
	public String getParseInfoCacheFactory() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setServerConfigCacheFactory(java.lang.String)
	 */
	@Override
	public void setServerConfigCacheFactory(String factoryClassname) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getServerConfigCacheFactory()
	 */
	@Override
	public String getServerConfigCacheFactory() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setDisconnectOnExpiredPasswords(boolean)
	 */
	@Override
	public void setDisconnectOnExpiredPasswords(boolean disconnectOnExpiredPasswords) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getDisconnectOnExpiredPasswords()
	 */
	@Override
	public boolean getDisconnectOnExpiredPasswords() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getAllowMasterDownConnections()
	 */
	@Override
	public boolean getAllowMasterDownConnections() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setAllowMasterDownConnections(boolean)
	 */
	@Override
	public void setAllowMasterDownConnections(boolean connectIfMasterDown) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getAllowSlaveDownConnections()
	 */
	@Override
	public boolean getAllowSlaveDownConnections() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setAllowSlaveDownConnections(boolean)
	 */
	@Override
	public void setAllowSlaveDownConnections(boolean connectIfSlaveDown) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getReadFromMasterWhenNoSlaves()
	 */
	@Override
	public boolean getReadFromMasterWhenNoSlaves() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setReadFromMasterWhenNoSlaves(boolean)
	 */
	@Override
	public void setReadFromMasterWhenNoSlaves(boolean useMasterIfSlavesDown) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getReplicationEnableJMX()
	 */
	@Override
	public boolean getReplicationEnableJMX() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setReplicationEnableJMX(boolean)
	 */
	@Override
	public void setReplicationEnableJMX(boolean replicationEnableJMX) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setGetProceduresReturnsFunctions(boolean)
	 */
	@Override
	public void setGetProceduresReturnsFunctions(boolean getProcedureReturnsFunctions) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getGetProceduresReturnsFunctions()
	 */
	@Override
	public boolean getGetProceduresReturnsFunctions() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setDetectCustomCollations(boolean)
	 */
	@Override
	public void setDetectCustomCollations(boolean detectCustomCollations) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getDetectCustomCollations()
	 */
	@Override
	public boolean getDetectCustomCollations() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getConnectionAttributes()
	 */
	@Override
	public String getConnectionAttributes() throws SQLException {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getServerRSAPublicKeyFile()
	 */
	@Override
	public String getServerRSAPublicKeyFile() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setServerRSAPublicKeyFile(java.lang.String)
	 */
	@Override
	public void setServerRSAPublicKeyFile(String serverRSAPublicKeyFile) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getAllowPublicKeyRetrieval()
	 */
	@Override
	public boolean getAllowPublicKeyRetrieval() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setAllowPublicKeyRetrieval(boolean)
	 */
	@Override
	public void setAllowPublicKeyRetrieval(boolean allowPublicKeyRetrieval) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setDontCheckOnDuplicateKeyUpdateInSQL(boolean)
	 */
	@Override
	public void setDontCheckOnDuplicateKeyUpdateInSQL(boolean dontCheckOnDuplicateKeyUpdateInSQL) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getDontCheckOnDuplicateKeyUpdateInSQL()
	 */
	@Override
	public boolean getDontCheckOnDuplicateKeyUpdateInSQL() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setSocksProxyHost(java.lang.String)
	 */
	@Override
	public void setSocksProxyHost(String socksProxyHost) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getSocksProxyHost()
	 */
	@Override
	public String getSocksProxyHost() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setSocksProxyPort(int)
	 */
	@Override
	public void setSocksProxyPort(int socksProxyPort) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getSocksProxyPort()
	 */
	@Override
	public int getSocksProxyPort() {
		
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getReadOnlyPropagatesToServer()
	 */
	@Override
	public boolean getReadOnlyPropagatesToServer() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setReadOnlyPropagatesToServer(boolean)
	 */
	@Override
	public void setReadOnlyPropagatesToServer(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getEnabledSSLCipherSuites()
	 */
	@Override
	public String getEnabledSSLCipherSuites() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setEnabledSSLCipherSuites(java.lang.String)
	 */
	@Override
	public void setEnabledSSLCipherSuites(String cipherSuites) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#getEnableEscapeProcessing()
	 */
	@Override
	public boolean getEnableEscapeProcessing() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.ConnectionProperties#setEnableEscapeProcessing(boolean)
	 */
	@Override
	public void setEnableEscapeProcessing(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#changeUser(java.lang.String, java.lang.String)
	 */
	@Override
	public void changeUser(String userName, String newPassword) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#clearHasTriedMaster()
	 */
	@Override
	public void clearHasTriedMaster() {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#clientPrepareStatement(java.lang.String)
	 */
	@Override
	public PreparedStatement clientPrepareStatement(String sql) throws SQLException {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#clientPrepareStatement(java.lang.String, int)
	 */
	@Override
	public PreparedStatement clientPrepareStatement(String sql, int autoGenKeyIndex) throws SQLException {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#clientPrepareStatement(java.lang.String, int, int)
	 */
	@Override
	public PreparedStatement clientPrepareStatement(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#clientPrepareStatement(java.lang.String, int[])
	 */
	@Override
	public PreparedStatement clientPrepareStatement(String sql, int[] autoGenKeyIndexes) throws SQLException {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#clientPrepareStatement(java.lang.String, int, int, int)
	 */
	@Override
	public PreparedStatement clientPrepareStatement(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#clientPrepareStatement(java.lang.String, java.lang.String[])
	 */
	@Override
	public PreparedStatement clientPrepareStatement(String sql, String[] autoGenKeyColNames) throws SQLException {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#getActiveStatementCount()
	 */
	@Override
	public int getActiveStatementCount() {
		
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#getIdleFor()
	 */
	@Override
	public long getIdleFor() {
		
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#getLog()
	 */
	@Override
	public Log getLog() throws SQLException {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#getServerCharacterEncoding()
	 */
	@Override
	public String getServerCharacterEncoding() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#getServerCharset()
	 */
	@Override
	public String getServerCharset() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#getServerTimezoneTZ()
	 */
	@Override
	public TimeZone getServerTimezoneTZ() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#getStatementComment()
	 */
	@Override
	public String getStatementComment() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#hasTriedMaster()
	 */
	@Override
	public boolean hasTriedMaster() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#isInGlobalTx()
	 */
	@Override
	public boolean isInGlobalTx() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#setInGlobalTx(boolean)
	 */
	@Override
	public void setInGlobalTx(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#isMasterConnection()
	 */
	@Override
	public boolean isMasterConnection() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#isNoBackslashEscapesSet()
	 */
	@Override
	public boolean isNoBackslashEscapesSet() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#isSameResource(com.mysql.jdbc.Connection)
	 */
	@Override
	public boolean isSameResource(Connection c) {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#lowerCaseTableNames()
	 */
	@Override
	public boolean lowerCaseTableNames() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#parserKnowsUnicode()
	 */
	@Override
	public boolean parserKnowsUnicode() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#ping()
	 */
	@Override
	public void ping() throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#resetServerState()
	 */
	@Override
	public void resetServerState() throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#serverPrepareStatement(java.lang.String)
	 */
	@Override
	public PreparedStatement serverPrepareStatement(String sql) throws SQLException {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#serverPrepareStatement(java.lang.String, int)
	 */
	@Override
	public PreparedStatement serverPrepareStatement(String sql, int autoGenKeyIndex) throws SQLException {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#serverPrepareStatement(java.lang.String, int, int)
	 */
	@Override
	public PreparedStatement serverPrepareStatement(String sql, int resultSetType, int resultSetConcurrency) throws SQLException {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#serverPrepareStatement(java.lang.String, int, int, int)
	 */
	@Override
	public PreparedStatement serverPrepareStatement(String sql, int resultSetType, int resultSetConcurrency, int resultSetHoldability) throws SQLException {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#serverPrepareStatement(java.lang.String, int[])
	 */
	@Override
	public PreparedStatement serverPrepareStatement(String sql, int[] autoGenKeyIndexes) throws SQLException {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#serverPrepareStatement(java.lang.String, java.lang.String[])
	 */
	@Override
	public PreparedStatement serverPrepareStatement(String sql, String[] autoGenKeyColNames) throws SQLException {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#setFailedOver(boolean)
	 */
	@Override
	public void setFailedOver(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#setPreferSlaveDuringFailover(boolean)
	 */
	@Override
	public void setPreferSlaveDuringFailover(boolean flag) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#setStatementComment(java.lang.String)
	 */
	@Override
	public void setStatementComment(String comment) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#shutdownServer()
	 */
	@Override
	public void shutdownServer() throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#supportsIsolationLevel()
	 */
	@Override
	public boolean supportsIsolationLevel() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#supportsQuotedIdentifiers()
	 */
	@Override
	public boolean supportsQuotedIdentifiers() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#supportsTransactions()
	 */
	@Override
	public boolean supportsTransactions() {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#versionMeetsMinimum(int, int, int)
	 */
	@Override
	public boolean versionMeetsMinimum(int major, int minor, int subminor) throws SQLException {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#reportQueryTime(long)
	 */
	@Override
	public void reportQueryTime(long millisOrNanos) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#isAbonormallyLongQuery(long)
	 */
	@Override
	public boolean isAbonormallyLongQuery(long millisOrNanos) {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#initializeExtension(com.mysql.jdbc.Extension)
	 */
	@Override
	public void initializeExtension(Extension ex) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#getAutoIncrementIncrement()
	 */
	@Override
	public int getAutoIncrementIncrement() {
		
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#hasSameProperties(com.mysql.jdbc.Connection)
	 */
	@Override
	public boolean hasSameProperties(Connection c) {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#getProperties()
	 */
	@Override
	public Properties getProperties() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#getHost()
	 */
	@Override
	public String getHost() {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#setProxy(com.mysql.jdbc.MySQLConnection)
	 */
	@Override
	public void setProxy(MySQLConnection proxy) {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#isServerLocal()
	 */
	@Override
	public boolean isServerLocal() throws SQLException {
		
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#getSessionMaxRows()
	 */
	@Override
	public int getSessionMaxRows() {
		
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#setSessionMaxRows(int)
	 */
	@Override
	public void setSessionMaxRows(int max) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#setSchema(java.lang.String)
	 */
	@Override
	public void setSchema(String schema) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#getSchema()
	 */
	@Override
	public String getSchema() throws SQLException {
		
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#abort(java.util.concurrent.Executor)
	 */
	@Override
	public void abort(Executor executor) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#setNetworkTimeout(java.util.concurrent.Executor, int)
	 */
	@Override
	public void setNetworkTimeout(Executor executor, int milliseconds) throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#getNetworkTimeout()
	 */
	@Override
	public int getNetworkTimeout() throws SQLException {
		
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#abortInternal()
	 */
	@Override
	public void abortInternal() throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#checkClosed()
	 */
	@Override
	public void checkClosed() throws SQLException {
		
		// TODO Auto-generated method stub
		
	}

	/* (non-Javadoc)
	 * @see com.mysql.jdbc.Connection#getConnectionMutex()
	 */
	@Override
	public Object getConnectionMutex() {
		
		// TODO Auto-generated method stub
		return null;
	}

}

