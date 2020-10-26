/**
 * Project Name:spring_demo
 * File Name:UserException.java
 * Package Name:com.relax.www.tx
 * Date:2016年4月11日下午5:03:29
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * 海风app在线学习平台
 * @author: no_relax
 * @Title: UserException.java 
 * @Package: com.relax.www.tx
 * @date: 2016年4月11日-下午5:03:29
 * @version: Vphone1.3.0
 * @copyright: 2016上海风创信息咨询有限公司-版权所有
 * 
 */

package com.relax.www.tx.Exception;

/**
 * @ClassName: UserException
 * @Description: TODO(用户自定义异常)
 * @author no_relax
 * @date 2016年4月11日 下午5:03:29
 * 
 */
public class UserException extends RuntimeException {

	public UserException(String message) {

		super(message);
	}

	public UserException() {

		super();

	}

	public UserException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {

		super(message, cause, enableSuppression, writableStackTrace);

	}

	public UserException(String message, Throwable cause) {

		super(message, cause);

	}

	public UserException(Throwable cause) {

		super(cause);

	}

}
