/**
 * 海风app在线学习平台
 * @author: no_relax
 * @Title: FLoggerTest.java 
 * @Package: com.relax.www.log.FLogger
 * @date: 2017年2月15日-下午3:08:28
 * @version: Vpad1.2.0
 * @copyright: 2017上海风创信息咨询有限公司-版权所有
 * 
 */

package com.relax.www.log.FLogger;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

import org.junit.Test;

import com.cyfonly.flogger.FLogger;
import com.cyfonly.flogger.constants.Constant;

/**
 * @ClassName: FLoggerTest
 * @Description: TODO(FLogger日志测试类)
 * @author no_relax
 * @date 2017年2月15日 下午3:08:28
 * 
 */
public class FLoggerTest {
	private static final FLogger log = FLogger.getInstance();

	public static void main(String[] args) {
		log.info("Here is your message...");
		log.writeLog(Constant.ERROR, "Here is your error message...");
		log.writeLog("error_file", Constant.ERROR, "Here is your error message...");
		new Thread(new Runnable() {
			@Override
			public void run() {
				log.info("Here is your another message...");
			}
		}).start();
	}

	// 总结：
	// HashMap：支持key==null或value==null 线程非安全
	// HashTable：当key==null或value==null 会抛异常 线程安全
	/*
	 * if (value == null) 
	 * { throw new NullPointerException(); }
	 * // Makes sure the key is not already in the hashtable. 
	 * Entry<?,?> tab[] = table; 
	 * int hash = key.hashCode();
	 */
	@Test
	public void test() {
		Map<String, Object> map = new HashMap<>();
		map.put(null, null);
		log.info(map.get(null) == null ? "null" : "not null");

		Hashtable<Object, Object> table = new Hashtable<>();
		table.put("12", null);
		log.info(table.get("12") == null ? "null" : "not null");

	}

}
