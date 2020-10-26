/**
 * Project Name:spring_demo
 * File Name:CglibProxy.java
 * Package Name:com.relax.www.proxy.cglibDynamicProxy
 * Date:2016年7月7日下午2:10:29
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * 海风app在线学习平台
 * @author: no_relax
 * @Title: CglibProxy.java 
 * @Package: com.relax.www.proxy.cglibDynamicProxy
 * @date: 2016年7月7日-下午2:10:29
 * @version: Vphone1.3.0
 * @copyright: 2016上海风创信息咨询有限公司-版权所有
 * 
 */

package com.relax.www.proxy.cglibDynamicProxy;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

/** 
* @ClassName: CglibProxy 
* @Description: TODO(Cglib动态代理) 
* @author no_relax 
* @date 2016年7月7日 下午2:10:29 
*  
*/
public class CglibProxy implements MethodInterceptor {
	private Object target;
	public Object getInstance(Object obj){
		this.target=obj;
		Enhancer enhancer = new Enhancer();//增强类
		enhancer.setSuperclass(target.getClass());	
		enhancer.setCallback(this);
		return enhancer.create();
	}

	@Override
	public Object intercept(Object arg0, Method method, Object[] arg2, MethodProxy methodProxy) throws Throwable {
		System.out.println(method.getName()+" method excute start...");
		Object object = methodProxy.invokeSuper(arg0, arg2);
		System.out.println(method.getName()+" method excute end...");
		System.out.println("return value: "+object);
		return object;
	}
	
	public static void main(String[] args) {
		CountImpl countImpl = new CountImpl();
		CglibProxy cglibProxy = new CglibProxy();
		countImpl = (CountImpl)cglibProxy.getInstance(countImpl);
		countImpl.queryCount();
		countImpl.updateCount();
	}

}

