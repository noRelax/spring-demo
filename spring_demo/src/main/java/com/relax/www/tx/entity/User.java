/**
 * Project Name:spring_demo
 * File Name:User.java
 * Package Name:com.relax.www.entity
 * Date:2016年4月8日下午5:29:14
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * 海风app在线学习平台
 * @author: no_relax
 * @Title: User.java 
 * @Package: com.relax.www.entity
 * @date: 2016年4月8日-下午5:29:14
 * @version: Vphone1.3.0
 * @copyright: 2016上海风创信息咨询有限公司-版权所有
 * 
 */

package com.relax.www.tx.entity;

/** 
* @ClassName: User 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author no_relax 
* @date 2016年4月8日 下午5:29:14 
*  
*/
public class User {
	private Integer user_id;
	private String userName;
	private String userPwd;
	private String userAddress;
	private Double userBalance;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	
	public Double getUserBalance() {
		return userBalance;
	}
	public void setUserBalance(Double userBalance) {
		this.userBalance = userBalance;
	}
	
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userPwd=" + userPwd + ", userAddress=" + userAddress + "]";
	}
	

}

