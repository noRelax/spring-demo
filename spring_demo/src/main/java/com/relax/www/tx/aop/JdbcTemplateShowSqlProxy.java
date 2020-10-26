package com.relax.www.tx.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.JdbcOperations;

public class JdbcTemplateShowSqlProxy {
	
	//要代理的对象
	private JdbcOperations target;
	
	private static final Logger logger=Logger.getLogger(JdbcTemplateShowSqlProxy.class);
	
	public JdbcTemplateShowSqlProxy(JdbcOperations target) {
		super();
		this.target = target;
	}
	public JdbcOperations getTarget() {
		return target;
	}

	//返回代理对象
	public JdbcOperations getSqlProxy(){
		JdbcOperations proxy = null;
		
		ClassLoader loader = target.getClass().getClassLoader();
		Class [] interfaces = new Class[]{JdbcOperations.class};
		InvocationHandler h = new InvocationHandler() {
			/**
			 * proxy: 代理对象。 一般不使用该对象
			 * method: 正在被调用的方法
			 * args: 调用方法传入的参数
			 */
			@Override
			public Object invoke(Object proxy, Method method, Object[] args)
					throws Throwable {
				String methodName = method.getName();
				//打印日志
				System.out.println("[before] The method " + methodName + " begins with " + Arrays.asList(args));
				for(Object arg:args){
					System.out.println(arg);
				}
				
				//调用目标方法
				Object result = null;
				
				try {
					//前置通知
					result = method.invoke(target, args);
					//返回通知, 可以访问到方法的返回值
				} catch (NullPointerException e) {
					e.printStackTrace();
					//异常通知, 可以访问到方法出现的异常
				}
				
				//后置通知. 因为方法可以能会出异常, 所以访问不到方法的返回值
				
				//打印日志
				System.out.println("[after] The method ends with " + result);
				
				return result;
			}
		};
		
		/**
		 * loader: 代理对象使用的类加载器。 
		 * interfaces: 指定代理对象的类型. 即代理代理对象中可以有哪些方法. 
		 * h: 当具体调用代理对象的方法时, 应该如何进行响应, 实际上就是调用 InvocationHandler 的 invoke 方法
		 */
		proxy = (JdbcOperations) Proxy.newProxyInstance(loader, interfaces, h);
		
		return proxy;
	}
	
	protected void showSql(String sql, Object... params) {
		if (logger.isDebugEnabled()) {
			String tmpSql = sql;
			try {
				if (params != null && params.length > 0) {
					for (int i = 0; i < params.length; i++) {
						tmpSql = tmpSql.replaceFirst("[?]", params[i] == null ? "null" : "'" + params[i].toString() + "'");
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			logger.debug(tmpSql);
		}
	}
}
