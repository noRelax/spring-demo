/**
 * Project Name:spring_demo
 * File Name:Main.java
 * Package Name:com.relax.www.aop
 * Date:2016年4月7日下午4:57:43
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * 海风app在线学习平台
 * @author: no_relax
 * @Title: Main.java 
 * @Package: com.relax.www.aop
 * @date: 2016年4月7日-下午4:57:43
 * @version: Vphone1.3.0
 * @copyright: 2016上海风创信息咨询有限公司-版权所有
 * 
 */

package com.relax.www.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
* @ClassName: Main 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author no_relax 
* @date 2016年4月7日 下午4:57:43 
*  
*/
public class Main {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean-aop-xml.xml");
		AtithmeticCalculation atithmeticCalculation=(AtithmeticCalculation) applicationContext.getBean("arithmeticCalculator");
		int add = atithmeticCalculation.add(1, 6);
		System.out.println(add);
	}

}

