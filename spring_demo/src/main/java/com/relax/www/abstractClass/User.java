/**
 * Project Name:spring_demo
 * File Name:User.java
 * Package Name:com.relax.www.abstractClass
 * Date:2017年1月17日下午6:03:04
 * Copyright (c) 2017, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * 海风app在线学习平台
 * @author: no_relax
 * @Title: User.java 
 * @Package: com.relax.www.abstractClass
 * @date: 2017年1月17日-下午6:03:04
 * @version: Vpad1.2.0
 * @copyright: 2017上海风创信息咨询有限公司-版权所有
 * 
 */

package com.relax.www.abstractClass;

/**
 * @ClassName: User
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author no_relax
 * @date 2017年1月17日 下午6:03:04
 * 
 */
public class User {
	String id;
	String name;
	String password;
	String age;

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	String sex;

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

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
