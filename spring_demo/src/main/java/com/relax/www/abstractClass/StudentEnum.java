/**
 * Project Name:spring_demo
 * File Name:Student.java
 * Package Name:com.relax.www.abstractClass
 * Date:2017年1月17日下午6:09:03
 * Copyright (c) 2017, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * 海风app在线学习平台
 * @author: no_relax
 * @Title: Student.java 
 * @Package: com.relax.www.abstractClass
 * @date: 2017年1月17日-下午6:09:03
 * @version: Vpad1.2.0
 * @copyright: 2017上海风创信息咨询有限公司-版权所有
 * 
 */

package com.relax.www.abstractClass;

import com.alibaba.fastjson.JSONObject;

/**
 * @ClassName: Student
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author no_relax
 * @date 2017年1月17日 下午6:09:03
 * 
 */
public class StudentEnum {

	public void updateStudentInfo(String userId, OperateUserInfo operateUserInfo) {
		// 拿到更新后的user对象
		User user = operateUserInfo.callBack();
		System.out.println("userId:" + user.getId() + ">>>name:" + user.getName() + ">>>name:" + user.getSex() + " 在数据库中已更新！");
	}

	public User getOldUserInfo(String userId) {
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("name1", "wusong");
		jsonObj.put("age1", "26");
		User oldUser = new User();
		oldUser.setAge("age");
		oldUser.setName("name");
		oldUser.setId(userId);
		this.updateStudentInfo(userId, new OperateUserInfo(userId, jsonObj) {
			@Override
			User callBack() {
				User user = new User();
				user.setAge(jsonObj.getString("age1"));
				user.setName(jsonObj.getString("name1"));
				user.setId(userId + "1");
				return user;
			}
		});
		return oldUser;
	}

	public User getOldUserInfo1(String userId) {
		JSONObject jsonObj = new JSONObject();
		jsonObj.put("name", "wusong");
		jsonObj.put("age", "26");
		jsonObj.put("sex", "男");
		User oldUser = new User();
		oldUser.setAge("age");
		oldUser.setName("name");
		oldUser.setId(userId);
		this.updateStudentInfo(userId, new OperateUserInfo(userId, jsonObj) {
			@Override
			User callBack() {
				User user = new User();
				user.setAge(jsonObj.getString("age"));
				user.setName(jsonObj.getString("name"));
				user.setSex(jsonObj.getString("sex"));
				user.setId(userId + "1");
				return user;
			}
		});
		return oldUser;
	}

	public static void main(String[] args) {
		StudentEnum student = new StudentEnum();
		User oldUserInfo = student.getOldUserInfo1("1");
		User oldUserInfo2 = student.getOldUserInfo1("2");
		System.out.println("oldUser:" + oldUserInfo.getId() + ">>>name:" + oldUserInfo.getName());
		System.out.println("oldUser:" + oldUserInfo2.getId() + ">>>name:" + oldUserInfo2.getName());
	}

	public enum role {

		STUDENT_INFO("A", "B"), teacher_info("C", "D");
		private String roleName;
		private String privilage;

		private role(String roleName, String privilage) {
			this.roleName = roleName;
			this.privilage = privilage;
		}

		public String getRoleName() {
			return roleName;
		}

		public void setRoleName(String roleName) {
			this.roleName = roleName;
		}

		public String getPrivilage() {
			return privilage;
		}

		public void setPrivilage(String privilage) {
			this.privilage = privilage;
		}

		public static void main(String[] args) {
			System.out.println(role.STUDENT_INFO.getRoleName() + ":" + role.STUDENT_INFO.getPrivilage());
		}

	}

}
