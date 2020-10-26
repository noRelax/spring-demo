/**
 * Project Name:spring_demo
 * File Name:UserDao.java
 * Package Name:com.relax.www.tx.dao
 * Date:2016年4月11日下午4:12:53
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * 海风app在线学习平台
 * @author: no_relax
 * @Title: UserDao.java 
 * @Package: com.relax.www.tx.dao
 * @date: 2016年4月11日-下午4:12:53
 * @version: Vphone1.3.0
 * @copyright: 2016上海风创信息咨询有限公司-版权所有
 * 
 */

package com.relax.www.tx.dao;

import com.relax.www.tx.entity.User;

/** 
* @ClassName: UserDao 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author no_relax 
* @date 2016年4月11日 下午4:12:53 
*  
*/
public interface UserDao {
	
	//让用户的钱数减去书的价格
	
	void updateUserBalance(Integer userId,Integer bookPrice);
	
	//获取用户实体
	User getUserById(Integer userId);

}

