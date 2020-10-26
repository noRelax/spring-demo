/**
 * 海风app在线学习平台
 * @author: no_relax
 * @Title: ReflectionDemo.java 
 * @Package: com.relax.www.reflection
 * @date: 2016年9月19日-上午11:09:12
 * @version: Vpad1.2.0
 * @copyright: 2016上海风创信息咨询有限公司-版权所有
 * 
 */
package com.relax.www.reflection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

/**
 * @ClassName: ReflectionDemo
 * @Description: TODO(反射demo)
 * @author no_relax
 * @date 2016年9月19日 上午11:09:12
 * 
 */
public class ReflectionDemo {

	/**
	 * TODO(这里用一句话描述这个方法的作用)
	 * 
	 * @author: no_relax
	 * @Title: main
	 * @param args
	 *            void
	 * @since Vpad1.2.0
	 */
	public static void main(String[] args) throws Exception {
		ArrayList<Integer> al = new ArrayList();
		al.getClass().getMethod("add", Object.class).invoke(al, "abc");
		System.out.println(al.get(0));
		// 将Object类型的对象转换成其他类型
		Object obj = "123";
		String str = autoConvert(obj);
		System.out.println(str);
		// 把任意参数类型的集合中的数据安全地复制到相应类型的数组中
		copy(new ArrayList<String>(), new String[10]);
		// 把任意参数类型的数组中的数据安全地复制到相应类型的另一个数组中
		copy(new Date[10], new String[10]);
	}

	public static <T> T autoConvert(Object obj) {
		return (T) obj;
	}

	public static <T> void copy(Collection<T> src, T[] dest) {
		return;
	}

	public static <T> void copy(T[] src, T[] dest) {
		System.out.println(src.getClass().getTypeName());
		return;
	}

}
