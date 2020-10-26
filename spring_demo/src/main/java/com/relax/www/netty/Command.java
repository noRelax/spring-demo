/**
 * 海风app在线学习平台
 * @author: no_relax
 * @Title: Comand.java 
 * @Package: com.relax.www.netty
 * @date: 2017年2月8日-下午4:20:16
 * @version: Vpad1.2.0
 * @copyright: 2017上海风创信息咨询有限公司-版权所有
 * 
 */

package com.relax.www.netty;

import java.io.Serializable;

/**
 * @ClassName: Comand
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author no_relax
 * @date 2017年2月8日 下午4:20:16
 * 
 */
public class Command implements Serializable {

	private static final long serialVersionUID = 1L;
	private String actionName;

	public void setActionName(String actionName) {
		this.actionName = actionName;
	}

	public String getActionName() {
		return actionName;
	}

}
