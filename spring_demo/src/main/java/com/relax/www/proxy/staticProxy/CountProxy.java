/**
 * Project Name:spring_demo
 * File Name:CountProxy.java
 * Package Name:com.relax.www.proxy.staticProxy
 * Date:2016年7月7日上午11:35:26
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * 海风app在线学习平台
 * @author: no_relax
 * @Title: CountProxy.java 
 * @Package: com.relax.www.proxy.staticProxy
 * @date: 2016年7月7日-上午11:35:26
 * @version: Vphone1.3.0
 * @copyright: 2016上海风创信息咨询有限公司-版权所有
 * 
 */

package com.relax.www.proxy.staticProxy;

/**
 * @ClassName: CountProxy
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author no_relax
 * @date 2016年7月7日 上午11:35:26
 * 
 */
public class CountProxy implements Count {
	private Count count;

	// 重写默认构造方法
	public CountProxy(CountImpl countImpl) {
		this.count = countImpl;
	}

	@Override
	public void queryCount() {
		System.out.println("queryCount方法执行前...");
		count.queryCount();
		System.out.println("queryCount方法执行end...");
	}

	@Override
	public void updateCount() {
		System.out.println("updateCount方法执行前...");
		count.updateCount();
		System.out.println("updateCount方法执行end...");
	}

	public static void main(String[] args) {
		CountImpl countImpl = new CountImpl();
		CountProxy countProxy = new CountProxy(countImpl);
		countProxy.queryCount();
		countProxy.updateCount();
	}

}
