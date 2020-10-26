package com.relax.www.loadBalance;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * 随机（Random）法通过系统随机函数，根据后端服务器列表的大小值来随机选择其中一台进行访问。由概率统计理论可以得知，随着调用量的增大，其实际效果越来越接近于平均分配流量到每一台后端服务器，也就是轮询的效果。
 */
public class Random {
	public static String getServer() {
		// 重建一个Map，避免服务器的上下线导致的并发问题
		Map<String, Integer> serverMap = new HashMap<String, Integer>();
		serverMap.putAll(IpMap.serverWeightMap);

		// 取得Ip地址List
		Set<String> keySet = serverMap.keySet();
		ArrayList<String> keyList = new ArrayList<String>();
		keyList.addAll(keySet);

		java.util.Random random = new java.util.Random();
		int randomPos = random.nextInt(keyList.size());

		return keyList.get(randomPos);
	}

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					System.out.println(getServer());
				}
			}).start();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}