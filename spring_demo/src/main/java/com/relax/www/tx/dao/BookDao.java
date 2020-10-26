/**
 * Project Name:spring_demo
 * File Name:BookDao.java
 * Package Name:com.relax.www.tx.dao
 * Date:2016年4月11日下午4:29:16
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * 海风app在线学习平台
 * @author: no_relax
 * @Title: BookDao.java 
 * @Package: com.relax.www.tx.dao
 * @date: 2016年4月11日-下午4:29:16
 * @version: Vphone1.3.0
 * @copyright: 2016上海风创信息咨询有限公司-版权所有
 * 
 */

package com.relax.www.tx.dao;

import com.relax.www.tx.entity.Book;

/** 
* @ClassName: BookDao 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author no_relax 
* @date 2016年4月11日 下午4:29:16 
*  
*/
public interface BookDao {
	
	//更新库存
	void updateBookStock(Integer bookId);
	
	//获取Book实体
	Book getBookById(Integer bookId);
	
}

