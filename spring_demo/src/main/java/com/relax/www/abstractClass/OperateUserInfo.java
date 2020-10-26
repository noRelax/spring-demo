/**
 * Project Name:spring_demo
 * File Name:OperateUserInfo.java
 * Package Name:com.relax.www.abstractClass
 * Date:2017年1月17日下午6:04:12
 * Copyright (c) 2017, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * 海风app在线学习平台
 * @author: no_relax
 * @Title: OperateUserInfo.java 
 * @Package: com.relax.www.abstractClass
 * @date: 2017年1月17日-下午6:04:12
 * @version: Vpad1.2.0
 * @copyright: 2017上海风创信息咨询有限公司-版权所有
 * 
 */

package com.relax.www.abstractClass;

import com.alibaba.fastjson.JSONObject;

/**
 * @ClassName: OperateUserInfo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author no_relax
 * @date 2017年1月17日 下午6:04:12
 * 
 */
public abstract class OperateUserInfo {

	JSONObject args;
	String id;

	public OperateUserInfo(String id, JSONObject args) {
		this.args = args;
		this.id = id;
	}

	abstract User callBack();

}
