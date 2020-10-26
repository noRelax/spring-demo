/**
 * Project Name:spring_demo
 * File Name:BaseService.java
 * Package Name:com.relax.www.tx.service.base
 * Date:2016年4月29日下午5:51:21
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * 海风app在线学习平台
 * @author: no_relax
 * @Title: BaseService.java 
 * @Package: com.relax.www.tx.service.base
 * @date: 2016年4月29日-下午5:51:21
 * @version: Vphone1.3.0
 * @copyright: 2016上海风创信息咨询有限公司-版权所有
 * 
 */

package com.relax.www.tx.service.base;

import org.apache.log4j.Logger;

/** 
* @ClassName: BaseService 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author no_relax 
* @date 2016年4月29日 下午5:51:21 
*  
*/
public class BaseService {
	
	private static final Logger logger = Logger.getLogger(BaseService.class);
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

