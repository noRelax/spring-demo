/**
 * Project Name:spring_demo
 * File Name:BookException.java
 * Package Name:com.relax.www.tx.Exception
 * Date:2016年4月11日下午5:08:48
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * 海风app在线学习平台
 * @author: no_relax
 * @Title: BookException.java 
 * @Package: com.relax.www.tx.Exception
 * @date: 2016年4月11日-下午5:08:48
 * @version: Vphone1.3.0
 * @copyright: 2016上海风创信息咨询有限公司-版权所有
 * 
 */

package com.relax.www.tx.Exception;
/** 
* @ClassName: BookException 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author no_relax 
* @date 2016年4月11日 下午5:08:48 
*  
*/
public class BookException extends RuntimeException{

	public BookException() {
		
		super();
	}

	public BookException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public BookException(String message, Throwable cause) {
		
		super(message, cause);
	}

	public BookException(String message) {
		
		super(message);
		
	}

	public BookException(Throwable cause) {
		
		super(cause);
		
	}

}

