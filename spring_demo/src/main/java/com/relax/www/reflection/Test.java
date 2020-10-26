package com.relax.www.reflection;

import java.lang.reflect.Method;
/**
 * @ClassName: Test
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author no_relax
 * @date 2016年9月22日 下午6:21:58
 * 
 */
public class Test {
	@org.junit.Test
	public void test1() throws Exception {
		Class<?> dogClass = Dog.class;
		Method[] methods = dogClass.getDeclaredMethods();
		for (Method method : methods) {
			System.out.println("函数名：" + method.getName() + "        函数类型：" + method.getModifiers() + "         函数返回： " + method.getReturnType() + "        函数参数个数：" + method.getParameterCount());

		}
		// 调用私有方法
		Method method1 = dogClass.getDeclaredMethod("sleep", int.class);// 不要用getMethod，它只能取到public方法
		Dog dog1 = (Dog) dogClass.getConstructor(new Class[] { String.class }).newInstance(new Object[] { "狗狗1号" });
		method1.setAccessible(true);// 私有方法一定要加这句
		method1.invoke(dog1, 12);
		
		//调用有两个参数的构造函数
		Dog dog2=(Dog)dogClass.getConstructor(new Class[]{String.class,int.class}).newInstance("狗狗",12);
		System.out.println("age>>>>>>>>>>>>"+dog2.getAge());
		System.out.println("name>>>>>>>>>>>>"+dog2.getName());
		
		// 调用私有静态方法
		Method method2 = dogClass.getDeclaredMethod("play");// 不要用getMethod，它只能取到public方法
		method2.setAccessible(true);// 私有方法一定要加这句
		method2.invoke(dogClass.newInstance());

		// 调用公共方法
		Method method3 = dogClass.getMethod("eat", String.class);// 这里也可以用getDeclaredMethod
		Dog dog3 = new Dog("狗狗3号", 45);
		method3.invoke(dog3, "苹果～");
	}
}
