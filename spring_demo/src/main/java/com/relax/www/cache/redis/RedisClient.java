
package com.relax.www.cache.redis;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;

import redis.clients.jedis.Jedis;

/**
 * @ClassName: RedisClient
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author no_relax
 * @date 2016年6月3日 下午2:01:55
 * 
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration("classpath:spring-tx.xml")
public class RedisClient {
	private static String IpAddress;
	private static int IpPort;
	private volatile static Jedis jedis;
	private static final Logger logger = Logger.getLogger(RedisClient.class);
	static {
		IpAddress = "192.168.60.250";
		IpPort = 6379;
		jedis = RedisClient.getJedisInstance();
	}

	// 单例模式获取redis服务

	public static Jedis getJedisInstance() {
		if (jedis == null) {
			synchronized (RedisClient.class) {
				if (jedis == null) {
					jedis = new Jedis(IpAddress, IpPort);
				}
			}
		}

		return jedis;
	}

	/**
	 * TODO(redis客户端)
	 * 
	 * @author: no_relax
	 * @Title: main
	 * @since Vphone1.3.0
	 */
	//@Before
	public void test() {
		for (int i = 0; i < 10; i++) {
			jedis.set("userInfo." + i, "norelax" + i);
		}
		jedis.set("name".getBytes(), "wusong".getBytes());
		System.out.println(jedis.get("name"));
	}

	// 测试hget和hset方法
	@Before
	public void test1() {
		Map<String, String> map=new HashMap<>();
		for (int i = 0; i < 10; i++) {
			map.put("name"+i, "value"+i);
		}
		for (int i = 0; i < 10; i++) {
			jedis.zadd("userName." + i, i, "wusong" + i);
			jedis.hset("people." + i, "userName", "norelax");
			jedis.hmset("userMap", map);
		}
	}

	@Test
	public void test2() {
		// jedis.incr("people");
		Set<String> hkeys = jedis.keys("people.*");
		for (String key : hkeys) {
			
			logger.info(String.format("key:%1$s>>>>>>>>hgetAll:%2$s,hget:%3$s", key,jedis.hgetAll(key),jedis.hget(key, "userName")));
		}
		Map<String, String> map = jedis.hgetAll("userMap");
		Set<Entry<String, String>> entrySet = map.entrySet();
		for (Entry<String, String> entry : entrySet) {
			logger.info(String.format("key:%1$s>>>>>>>>value:%2$s",entry.getKey(),entry.getValue()));
		}

	}

	@Test
	public void test3() {
		Set<String> keys = jedis.keys("userInfo.*");
		for (String key : keys) {
			System.out.println(key);
			System.out.println(jedis.get(key));
		}
	}
	
	@Test
	public void test4(){
		jedis.hsetnx("user", "wife", "xiaozhang");
		System.out.println(jedis.hget("user", "wife"));
	}
	
	public static void main(String[] args) {
		final Subscriber subscriber = new Subscriber();
		new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					jedis.subscribe(subscriber, "logstash_list_0");
				}
				
			}
		}).start();
	}

}
