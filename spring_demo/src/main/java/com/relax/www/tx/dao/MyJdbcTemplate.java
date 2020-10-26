/**
 * Project Name:spring_demo
 * File Name:MyJdbcTemplate.java
 * Package Name:com.relax.www.tx.dao
 * Date:2016年4月29日下午6:00:50
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * 海风app在线学习平台
 * @author: no_relax
 * @Title: MyJdbcTemplate.java 
 * @Package: com.relax.www.tx.dao
 * @date: 2016年4月29日-下午6:00:50
 * @version: Vphone1.3.0
 * @copyright: 2016上海风创信息咨询有限公司-版权所有
 * 
 */

package com.relax.www.tx.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.dao.support.DataAccessUtils;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BatchUpdateUtils;
import org.springframework.jdbc.core.InterruptibleBatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ParameterDisposer;
import org.springframework.jdbc.core.ParameterizedPreparedStatementSetter;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;
import org.springframework.jdbc.support.JdbcUtils;

/** 
* @ClassName: MyJdbcTemplate 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author no_relax 
* @date 2016年4月29日 下午6:00:50 
*  
*/
public class MyJdbcTemplate extends JdbcTemplate {
	private static final Logger logger = Logger.getLogger(MyJdbcTemplate.class);
	public void setDataSource1(DataSource dataSource) {
		setDataSource(dataSource);
	}
	
	@Override
	public <T> T queryForObject(String sql, RowMapper<T> rowMapper, Object... args) throws DataAccessException {
		List<T> results = query(sql, args, new RowMapperResultSetExtractor<T>(rowMapper, 1));
		showSql(sql, args);
		return DataAccessUtils.requiredSingleResult(results);
	}
	
	@Override
	public int update(String sql, Object... args) throws DataAccessException {
		showSql(sql, args);
		return update(sql, newArgPreparedStatementSetter(args));
	}
	
	//批量更新
	@Override
	public int[] batchUpdate(String sql, List<Object[]> batchArgs) throws DataAccessException {
		for (Object[] args : batchArgs) {
			showSql(sql, args);
		}
		return batchUpdate(sql, batchArgs, new int[0]);
	}

	@Override
	public int[] batchUpdate(String sql, List<Object[]> batchArgs, int[] argTypes) throws DataAccessException {
		for (Object[] args : batchArgs) {
			showSql(sql, args);
		}
		return BatchUpdateUtils.executeBatchUpdate(sql, batchArgs, argTypes, this);
	}

	
	protected void showSql(String sql, Object... params) {
		if (logger.isDebugEnabled()) {
			String tmpSql = sql;
			try {
				if (params != null && params.length > 0) {
					for (int i = 0; i < params.length; i++) {
						tmpSql = tmpSql.replaceFirst("[?]", params[i] == null ? "null" : "'" + params[i].toString() + "'");
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			logger.debug(tmpSql);
		}
	}

}

