/**
 * Project Name:spring_demo
 * File Name:UserDaoImpl.java
 * Package Name:com.relax.www.tx.dao
 * Date:2016年4月11日下午4:14:36
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * 海风app在线学习平台
 * @author: no_relax
 * @Title: UserDaoImpl.java 
 * @Package: com.relax.www.tx.dao
 * @date: 2016年4月11日-下午4:14:36
 * @version: Vphone1.3.0
 * @copyright: 2016上海风创信息咨询有限公司-版权所有
 * 
 */

package com.relax.www.tx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.relax.www.tx.Exception.UserException;
import com.relax.www.tx.entity.User;
import com.relax.www.tx.service.base.BaseService;

/** 
* @ClassName: UserDaoImpl 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author no_relax 
* @date 2016年4月11日 下午4:14:36 
*  
*/
@Repository
public class UserDaoImpl extends BaseService implements UserDao {
	
	@Autowired
	private MyJdbcTemplate jdbcTemplate;
	
	@Override
	public void updateUserBalance(Integer userId, Integer bookPrice) {
		//先获取用户的余额
		User user = getUserById(userId);
		Double userBalance = user.getUserBalance();
		if (userBalance-bookPrice<0) {
			throw new UserException("用户余额不足！");
		}
		String sql=" update user set user_balance=user_balance-? where user_id=?";
//		showSql(sql, bookPrice,userId);
		jdbcTemplate.update(sql, bookPrice,userId);
	}

	@Override
	@SuppressWarnings("all")
	public User getUserById(Integer userId) {
		String sql=" select * from user where user_id=? ";
		RowMapper<User> userMapper=new BeanPropertyRowMapper(User.class);
//		showSql(sql, userId);
		return jdbcTemplate.queryForObject(sql, userMapper,userId);
	}

}

