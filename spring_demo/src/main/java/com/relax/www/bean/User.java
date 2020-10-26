/**
 * Project Name:spring_demo
 * File Name:User.java
 * Package Name:com.relax.www.bean
 * Date:2016年4月5日下午3:25:00
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * 海风app在线学习平台
 * @author: no_relax
 * @Title: User.java 
 * @Package: com.relax.www.bean
 * @date: 2016年4月5日-下午3:25:00
 * @version: Vphone1.3.0
 * @copyright: 2016上海风创信息咨询有限公司-版权所有
 * 
 */

package com.relax.www.bean;

/** 
* @ClassName: User 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author no_relax 
* @date 2016年4月5日 下午3:25:00 
*  
*/
public class User {
	private String name;
	private String password;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public User() {
    }

    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
//	@Override
//	public String toString() {
//		return "User [name=" + name + ", password=" + password + "]";
//	}
	

}

