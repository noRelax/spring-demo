package com.relax.www.dao.reflect;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

@SuppressWarnings("all")
public class BaseDaoImpl<T> implements BaseDao<T> {
	private Class clazz;

	public BaseDaoImpl() {
		// 利用泛型的反射在实例化时拿到实体类的字节码
		Type t = this.getClass().getGenericSuperclass();
		ParameterizedType pt = (ParameterizedType) t;
		Type actualType = pt.getActualTypeArguments()[0];
		clazz = (Class) actualType;
		System.out.println("clazz>>>>>>"+clazz);
		System.out.println();
	}
	
	public BaseDaoImpl(Class clazz) {
		this.clazz=clazz;
		System.out.println(clazz);
	}

	@Override
	public void add(T t) {


	}

	@Override
	public void delete(Serializable id) {


	}

	@Override
	public void update(T t) {


	}

	@Override
	public T findOne(Serializable id) {

		return null;
	}
}