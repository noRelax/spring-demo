/**
 * Project Name:spring_demo
 * File Name:AtithmeticCalculationImpl.java
 * Package Name:com.relax.www.service.impl
 * Date:2016年4月5日下午6:14:30
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * 海风app在线学习平台
 * @author: no_relax
 * @Title: AtithmeticCalculationImpl.java 
 * @Package: com.relax.www.service.impl
 * @date: 2016年4月5日-下午6:14:30
 * @version: Vphone1.3.0
 * @copyright: 2016上海风创信息咨询有限公司-版权所有
 * 
 */

package com.relax.www.service.impl;

import org.springframework.stereotype.Component;

import com.relax.www.service.AtithmeticCalculation;

/** 
* @ClassName: AtithmeticCalculationImpl 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author no_relax 
* @date 2016年4月5日 下午6:14:30 
*  
*/
@Component("atithmeticCalculation")
public class AtithmeticCalculationImpl implements AtithmeticCalculation{

	@Override
	public int add(int i, int j) {
		
		int result=i+j;
		return result;
	}

	@Override
	public int sub(int i, int j) {
		int result=i-j;
		return result;
	}

	@Override
	public int div(int i, int j) {
		int result=i/j;
		return result;
	}

}

