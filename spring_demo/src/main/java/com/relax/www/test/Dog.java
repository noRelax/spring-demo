/**
 * 海风app在线学习平台
 * @author: no_relax
 * @Title: Dog.java 
 * @Package: com.relax.www.test
 * @date: 2017年1月23日-上午11:28:13
 * @version: Vpad1.2.0
 * @copyright: 2017上海风创信息咨询有限公司-版权所有
 * 
 */

package com.relax.www.test;

/**
 * @ClassName: Dog
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author no_relax
 * @date 2017年1月23日 上午11:28:13
 * 
 */
public interface Dog extends Animal {

	@Override
	default void eat() {
		System.out.println("调用dog接口！");
	}

}
