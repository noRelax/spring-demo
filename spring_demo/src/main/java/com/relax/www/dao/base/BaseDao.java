/**
 * Project Name:spring_demo
 * File Name:BaseDao.java
 * Package Name:com.relax.www.dao.base
 * Date:2016年4月5日下午3:19:17
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * 海风app在线学习平台
 * @author: no_relax
 * @Title: BaseDao.java 
 * @Package: com.relax.www.dao.base
 * @date: 2016年4月5日-下午3:19:17
 * @version: Vphone1.3.0
 * @copyright: 2016上海风创信息咨询有限公司-版权所有
 * 
 */

package com.relax.www.dao.base;
/** 
* @ClassName: BaseDao 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author no_relax 
* @date 2016年4月5日 下午3:19:17 
*  
*/
public class BaseDao<T> {
	public void save(T entity) {
		System.out.println("save..."+entity);
	}

}

