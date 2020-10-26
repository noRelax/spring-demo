package com.relax.www.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;

public class GetActualParam {
	public static void main(String[] args) throws Exception {
		// 1、不能直接获得实际类型参数，可通过中间方法
		Method applyMethod = GetActualParam.class.getMethod("applyRef", HashMap.class);

		// 2、得到方法参数中所有泛型:getGenericParameterTypes()方法。不能用getParameterTypes()，因为class中不包含泛型类型
		Type[] parameterTypes = applyMethod.getGenericParameterTypes();
		ParameterizedType pt = (ParameterizedType) parameterTypes[0];

		// 3、本例方法中只有一个参数，该参数为一个泛型，得到该泛型的所有实际类型参数。
		Type[] actualTypeArguments = pt.getActualTypeArguments();

		// 4、遍历这些实际类型参数
		for (Type t : actualTypeArguments) {
			System.out.println(t);
		}
	}

	public static void applyRef(HashMap<String, Integer> hm) {

	}
}