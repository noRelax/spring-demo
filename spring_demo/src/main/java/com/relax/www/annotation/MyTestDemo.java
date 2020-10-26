
package com.relax.www.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.junit.Test;

/**
 * @ClassName: MyTestDemo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author no_relax
 * @date 2016年9月28日 下午2:43:33
 * 
 */
public class MyTestDemo {

	@MyTest
	public void test1() {
		System.out.println("执行的方法1！");
	}

	@MyTest(time = 100)
	public void test2() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("执行方法2！");
	}

	@SuppressWarnings("all")
	public static void main(String[] args) throws Exception {
		Class clazz = MyTestDemo.class;
		Method[] methods = clazz.getMethods();
		for (Method method : methods) {
			if (method.isAnnotationPresent(MyTest.class)) {
				// 获取注解中的值
				MyTest myTest = method.getAnnotation(MyTest.class);
				long time = myTest.time();
				Class<? extends Annotation> annotationType = myTest.annotationType();
				String name = annotationType.getSimpleName();
				System.out.println("time:" + time+"		annotationType:"+annotationType+"		name:"+name);
				method.invoke(clazz.newInstance(), null);
			}
		}
	}
	
	@Test
	@SuppressWarnings("all")
	public void test() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException{
		Class clazz=MyTestDemo.class;
		Method[] methods = clazz.getMethods();
		for (Method method : methods) {
			if (method.isAnnotationPresent(MyTest.class)) {
				MyTest mytest = method.getAnnotation(MyTest.class);
				if (mytest.time()!=-1) {
					long startTime = System.currentTimeMillis();
					method.invoke(clazz.newInstance(), null);
					long endTime=System.currentTimeMillis();
					if ((endTime-startTime)>mytest.time()) {
						throw new RuntimeException(method.getName()+"方法执行超时啦！");
					}
				}else {
					method.invoke(clazz.newInstance(), null);
				}
			}
		}
	}

}
