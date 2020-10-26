/**
 * Project Name:spring_demo
 * File Name:SingleClass.java
 * Package Name:com.relax.www.test
 * Date:2016年5月11日下午6:11:37
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * 海风app在线学习平台
 * @author: no_relax
 * @Title: SingleClass.java 
 * @Package: com.relax.www.test
 * @date: 2016年5月11日-下午6:11:37
 * @version: Vphone1.3.0
 * @copyright: 2016上海风创信息咨询有限公司-版权所有
 * 
 */

package com.relax.www.test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/** 
* @ClassName: SingleClass 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author no_relax 
* @date 2016年5月11日 下午6:11:37 
*  
*/
public class SingletonTest {
	private volatile static SingletonTest uniqueInstance;
	private SingletonTest() {}
	public static SingletonTest getInstance() {
	    if (uniqueInstance == null) {
	    	//此处可能会有多个线程，并且uniqueInstance为null
	      synchronized (SingletonTest.class) {
	    	  //会有唯一线程，第一个进来的uniqueInstance为空
	 if (uniqueInstance == null) {
		 //第一个先进来的线程会进来，之后的其他线程的uniqueInstance不为空，不会进来
		 uniqueInstance  = new SingletonTest();
	 }
	      }
	    }        
	    return uniqueInstance;
	    } 
	
	public static void main(String[] args) {
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		for (int i = 0; i < 10000; i++) {
			executorService.execute(new Runnable() {
				@Override
				public void run() {
					System.out.println(getInstance());
				}
			});
			try {
				executorService.awaitTermination(100, TimeUnit.MICROSECONDS);
			} catch (InterruptedException e) {
				e.printStackTrace();
				
			}
		}
		executorService.shutdown();
	}
}

