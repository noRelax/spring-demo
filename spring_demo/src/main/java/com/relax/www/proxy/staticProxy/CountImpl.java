/**
 * Project Name:spring_demo
 * File Name:CountImpl.java
 * Package Name:com.relax.www.proxy.staticProxy
 * Date:2016年7月7日上午11:33:33
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * 海风app在线学习平台
 * @author: no_relax
 * @Title: CountImpl.java 
 * @Package: com.relax.www.proxy.staticProxy
 * @date: 2016年7月7日-上午11:33:33
 * @version: Vphone1.3.0
 * @copyright: 2016上海风创信息咨询有限公司-版权所有
 * 
 */

package com.relax.www.proxy.staticProxy;
/** 
* @ClassName: CountImpl 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author no_relax 
* @date 2016年7月7日 上午11:33:33 
*  
*/
public class CountImpl implements Count {
	@Override
	public void queryCount() {
		System.out.println("查看账户业务方法...");
	}

	@Override
	public void updateCount() {
		System.out.println("更新账户业务方法...");
	}

}

