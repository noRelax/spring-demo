/**
 * 海风app在线学习平台
 * @author: no_relax
 * @Title: BeanConvertDemo.java 
 * @Package: com.norelax.www
 * @date: 2016年5月27日-下午3:49:29
 * @version: Vphone1.3.0
 * @copyright: 2016上海风创信息咨询有限公司-版权所有
 * 
 */

package com.norelax.www;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName: BeanConvertDemo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author no_relax
 * @date 2016年5月27日 下午3:49:29
 * 
 */
public class BeanConvertDemo {

	// 实体类转换器
	public static <T> T beanConvert(Map bean, T T) throws Exception {
		if (bean == null) {
			throw new RuntimeException("被转换的实体类不能为空！");
		}
		try {
			// 获取实体的所有属性
			Field[] fields = T.getClass().getDeclaredFields();
			// 遍历所有属性，将属性的值赋给T
			for (Field field : fields) {
				// 允许访问
				field.setAccessible(true);
				// 获取属性名
				String fieldName = field.getName();
				// 获取属性值
				Object object = bean.get(fieldName);
				if (field.getType() == String.class) {
					field.set(T, object.toString());
				}
			}
		} catch (Exception e) {
			e.printStackTrace();

		}
		return T;
	}
	
	public static void main(String[] args) throws Exception {
		Map<String, Object> a = new HashMap<String, Object>();
		a.put("name","wusong");
		a.put("password","123456");
		B b = beanConvert(a, new B());
		System.out.println(b.getName()+":"+b.getPassword());
	}

}

class B{
	private String name;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
