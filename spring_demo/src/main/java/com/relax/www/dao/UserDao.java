/**
 * Project Name:spring_demo
 * File Name:UserDao.java
 * Package Name:com.relax.www.dao
 * Date:2016年4月5日下午3:24:27
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * 海风app在线学习平台
 * @author: no_relax
 * @Title: UserDao.java 
 * @Package: com.relax.www.dao
 * @date: 2016年4月5日-下午3:24:27
 * @version: Vphone1.3.0
 * @copyright: 2016上海风创信息咨询有限公司-版权所有
 * 
 */

package com.relax.www.dao;

import org.springframework.stereotype.Repository;

import com.relax.www.bean.User;
import com.relax.www.dao.base.BaseDao;

/** 
* @ClassName: UserDao 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author no_relax 
* @date 2016年4月5日 下午3:24:27 
*  
*/
@Repository
public class UserDao extends BaseDao<User> {
	public void add() {
		System.out.println("UserDao-------------");
	}

}

