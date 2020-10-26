/**
 * Project Name:spring_demo
 * File Name:UserEnum.java
 * Package Name:com.relax.www.bean
 * Date:2016年6月3日下午6:19:29
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * 海风app在线学习平台
 * @author: no_relax
 * @Title: UserEnum.java 
 * @Package: com.relax.www.bean
 * @date: 2016年6月3日-下午6:19:29
 * @version: Vphone1.3.0
 * @copyright: 2016上海风创信息咨询有限公司-版权所有
 * 
 */

package com.relax.www.bean;

/**
 * @ClassName: UserEnum
 * @Description: TODO(用户信息枚举类)
 * @author no_relax
 * @date 2016年6月3日 下午6:19:29
 * 
 */
public enum UserEnum {

	student_info("norelax", "123456", "hangzou", "北京大学"), teacher_info("zhangsan", "123456", "南京", "上海大学"), doctor_info("zhangsan1", "123456", "杭州", "杭州大学");

	private String userName;
	private String password;
	private String address;
	private String school;

	UserEnum(String userName, String password, String address, String school) {
		this.userName = userName;
		this.password = password;
		this.address = address;
		this.school = school;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	static UserEnum getUserInfoByName(String userName) {
		UserEnum[] values = UserEnum.values();
		for (UserEnum userEnum : values) {
			if (userEnum.userName.equals(userName)) {
				return userEnum;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		// UserEnum[] values = UserEnum.values();
		// for (UserEnum userEnum : values) {
		// System.out.println(userEnum.address);
		// }
		UserEnum userInfo = getUserInfoByName("zhangsan1");
		System.out.println(userInfo.getAddress());
	}

}
