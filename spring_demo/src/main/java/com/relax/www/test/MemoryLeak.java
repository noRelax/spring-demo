package com.relax.www.test;

import java.util.HashMap;
import java.util.Map;

public class MemoryLeak {

	public static void main(String[] args) {
		Map<Key, String> map = new HashMap<Key, String>(1000);

		int counter = 0;
		while (true) {
			// creates duplicate objects due to bad Key class
			map.put(new Key("dummyKey"), "value");
			counter++;
			if (counter % 1000 == 0) {
				System.out.println("map size: " + map.size());
				System.out.println("Free memory after count " + counter + " is " + getFreeMemory() + "MB");

				sleep(1000);
			}

		}
	}

	/**
	 * inner class key without hashcode() or equals() -- bad implementation
	 * 如果map的key没有实现hashcode和equal方法会造成内存溢出问题
	 */
	static class Key {
		private String key;

		public Key(String key) {
			this.key = key;
		}

		@Override
		public int hashCode() {
			return key.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Key) {
				return key.equals(((Key) obj).key);
			}
			return false;
		}

	}

	// delay for a given period in milli seconds
	public static void sleep(long sleepFor) {
		try {
			Thread.sleep(sleepFor);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// get available memory in MB
	public static long getFreeMemory() {
		return Runtime.getRuntime().freeMemory() / (1024 * 1024);
	}

}