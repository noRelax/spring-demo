/**
 * Project Name:spring_demo
 * File Name:Asynchronous.java
 * Package Name:com.relax.www.test
 * Date:2016年6月12日下午3:06:13
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * 海风app在线学习平台
 * @author: no_relax
 * @Title: Asynchronous.java 
 * @Package: com.relax.www.test
 * @date: 2016年6月12日-下午3:06:13
 * @version: Vphone1.3.0
 * @copyright: 2016上海风创信息咨询有限公司-版权所有
 * 
 */

package com.relax.www.test;
/** 
* @ClassName: Asynchronous 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author no_relax 
* @date 2016年6月12日 下午3:06:13 
*  
*/
public class Asynchronous {

	/**
	 * TODO(这里用一句话描述这个方法的作用)
	 * @author: no_relax 
	 * @Title: main
	 * @param args 
	 * void
	 * @since Vphone1.3.0
	*/
	public static void main(String[] args) {

		//开启一个线程，异步处理
		new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					System.out.println("异步处理数据·····");
				}
			}
		}).start();
		
		//主线程同时处理另外的事情
		for (int i = 0; i < 5; i++) {
			System.out.println("正在处理一些数据····");
		}
		
	}

}

