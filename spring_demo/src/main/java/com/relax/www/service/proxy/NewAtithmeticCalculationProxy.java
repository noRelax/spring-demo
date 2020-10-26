/**
 * Project Name:spring_demo
 * File Name:AtithmeticCalculationProxy.java
 * Package Name:com.relax.www.service.proxy
 * Date:2016年4月6日上午10:47:58
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * 海风app在线学习平台
 * @author: no_relax
 * @Title: AtithmeticCalculationProxy.java 
 * @Package: com.relax.www.service.proxy
 * @date: 2016年4月6日-上午10:47:58
 * @version: Vphone1.3.0
 * @copyright: 2016上海风创信息咨询有限公司-版权所有
 * 
 */

package com.relax.www.service.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

import com.relax.www.service.AtithmeticCalculation;

/** 
* @ClassName: AtithmeticCalculationProxy 
* @Description: TODO(实现InvocationHandler接口的动态代理类) 
* @author no_relax 
* @date 2016年4月6日 上午10:47:58 
*  
*/
public class NewAtithmeticCalculationProxy implements InvocationHandler{
	//要代理对象
	private AtithmeticCalculation target;
	//构造函数，接收代理对象
	public NewAtithmeticCalculationProxy(AtithmeticCalculation proxy) {
		super();
		this.target = proxy;
	}
	//返回代理对象
	public Object returnProxyObj(){
		return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("[before] this method add params "+Arrays.asList(args));
		Object result = method.invoke(target, args);
		System.out.println("[result] this method return "+result );
		System.out.println("[after] this method add params "+Arrays.asList(args));
		return result;
	}
	


}

