/**
 * 海风app在线学习平台
 * @author: no_relax
 * @Title: MapUtils.java 
 * @Package: com.relax.www.map
 * @date: 2017年2月17日-上午11:07:14
 * @version: Vpad1.2.0
 * @copyright: 2017上海风创信息咨询有限公司-版权所有
 * 
 */

package com.relax.www.map;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.junit.Test;

/**
 * @ClassName: MapUtils
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author no_relax
 * @date 2017年2月17日 上午11:07:14
 * 
 */
public class MapUtils {
	@Test // map的key排序
	public void comparatorTest() {
		TreeMap<Integer, Object> treeMap = new TreeMap<>(new Comparator<Integer>() {
			public int compare(Integer o1, Integer o2) {
				return o2 - o1;
			};
		});
		treeMap.put(213, 1);
		treeMap.put(12, 33);
		treeMap.put(124, 23);
		treeMap.put(1224, 44);
		for (Entry<Integer, Object> m : treeMap.entrySet()) {
			System.out.println(m.getKey() + ">>>>" + m.getValue());
		}

	}

	@SuppressWarnings("all")
	@Test // map的value排序
	public void mapKeySort() {
		TreeMap<Object, Object> treeMap = new TreeMap<>();
		treeMap.put(213, 1);
		treeMap.put(12, 33);
		treeMap.put(124, 23);
		treeMap.put(1224, 44);
		// 把map拆分构建多个entry，放在list中
		ArrayList<Entry<Object, Object>> listMaps = new ArrayList<Map.Entry<Object, Object>>(treeMap.entrySet());
		Collections.sort(listMaps, new Comparator<Map.Entry<Object, Object>>() {
			@Override
			public int compare(Entry<Object, Object> o1, Entry<Object, Object> o2) {
				return o1.getKey().toString().compareTo(o2.getKey().toString());
			}
		});

		

		for (Entry<Object, Object> m : treeMap.entrySet()) {
			System.out.println(m.getKey() + ">>>>" + m.getValue());
		}

	}

}
