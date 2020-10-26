/**
 * Project Name:spring_demo
 * File Name:DynamicCountProxy.java
 * Package Name:com.relax.www.proxy.dynamicProxy
 * Date:2016年7月7日上午11:43:43
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * 海风app在线学习平台
 * @author: no_relax
 * @Title: DynamicCountProxy.java 
 * @Package: com.relax.www.proxy.dynamicProxy
 * @date: 2016年7月7日-上午11:43:43
 * @version: Vphone1.3.0
 * @copyright: 2016上海风创信息咨询有限公司-版权所有
 * 
 */

package com.relax.www.proxy.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/** 
* @ClassName: DynamicCountProxy 
* @Description: TODO(动态代理类java jdk自带 ) 都是将被代理对象放到代理对象中
* @author no_relax 
* @date 2016年7月7日 上午11:43:43 
*  
*/
public class DynamicCountProxy implements InvocationHandler {
	private Object target;
	//绑定委托对象，并返回一个代理类
	public Object bind(Object target) {
		this.target=target;
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);

	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println(method.getName()+" method excute START...return type:"+method.getReturnType());
		Object result = method.invoke(target, args);
		System.out.println(method.getName()+" method excute END...return type:"+method.getReturnType());
		return result;
	}
	
	public static void main(String[] args) {
		Count countImpl = new CountImpl();
		DynamicCountProxy dynamicCountProxy = new DynamicCountProxy();
		Count count = (Count)dynamicCountProxy.bind(countImpl);
		count.queryCount();
		count.updateCount();
	}

}

