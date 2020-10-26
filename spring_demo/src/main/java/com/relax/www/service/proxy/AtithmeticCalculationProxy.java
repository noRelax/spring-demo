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
* @Description: TODO(动态代理类) 
* @author no_relax 
* @date 2016年4月6日 上午10:47:58 
*  
*/
public class AtithmeticCalculationProxy {
	//要代理对象
	private AtithmeticCalculation target;
	//构造函数，接收代理对象
	public AtithmeticCalculationProxy(AtithmeticCalculation proxy) {
		super();
		this.target = proxy;
	}
	
	//代理实现,返回代理对象
	public AtithmeticCalculation getLoggingProxy() {
		AtithmeticCalculation proxy = null;
//		Class[] interfaces=new Class[]{AtithmeticCalculation.class};
		//JDK的动态代理，要求类必须实现接口
		InvocationHandler invocationHandler = new InvocationHandler() {
			//第一个参数：要代理的对象；第二个参数：执行的方法；第三个：方法的参数
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				String methodName = method.getName();
				System.out.println("[before] this method "+methodName+" params :"+Arrays.asList(args));
				Object result = null;
				try {
					//执行方法,返回结果
					//前置通知
					result = method.invoke(target, args);
					//返回通知，能拿到方法的执行结果
				} catch (Throwable e) {
					e.printStackTrace();
					//异常通知
				}
				//后置通知，可能拿不到返回值，因为有异常
				System.out.println("[after] this method "+methodName+" params :"+Arrays.asList(args)+" result: "+result);
				return result;
			}
		};
		proxy = (AtithmeticCalculation) Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), invocationHandler);
		return proxy;
	}

}

