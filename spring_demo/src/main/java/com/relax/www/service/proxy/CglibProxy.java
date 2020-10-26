/**
 * Project Name:spring_demo
 * File Name:CglibProxy.java
 * Package Name:com.relax.www.service.proxy
 * Date:2016年4月6日下午3:54:40
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * 海风app在线学习平台
 * @author: no_relax
 * @Title: CglibProxy.java 
 * @Package: com.relax.www.service.proxy
 * @date: 2016年4月6日-下午3:54:40
 * @version: Vphone1.3.0
 * @copyright: 2016上海风创信息咨询有限公司-版权所有
 * 
 */

package com.relax.www.service.proxy;

import java.lang.reflect.Method;
import java.util.Arrays;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

/** 
* @ClassName: CglibProxy 
* @Description: TODO(使用cglib进行代理，不需要被代理类实现接口) 
* @author no_relax 
* @date 2016年4月6日 下午3:54:40 
*  
*/
public class CglibProxy implements MethodInterceptor {
	
	//传入被代理对象，创建代理对象
	public Object newInstance(Object target){
		//将enhancer作为被代理对象的子类
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(target.getClass());
		//设置回调
		enhancer.setCallback(this);
		return enhancer.create();
	}
	

	@Override
	public Object intercept(Object arg0, Method arg1, Object[] arg2, MethodProxy method) throws Throwable {
		System.out.println("[before] this method add params "+Arrays.asList(arg2));
		Object result = method.invokeSuper(arg0, arg2);
		System.out.println("[result] this method return "+result );
		System.out.println("[after] this method add params "+Arrays.asList(arg2));
		return null;
	}

}

