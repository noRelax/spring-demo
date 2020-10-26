/**
 * 海风app在线学习平台
 *
 * @author: no_relax
 * @Title: TestDemo.java
 * @Package: com.relax.www.test
 * @date: 2016年10月24日-下午6:11:06
 * @version: Vpad1.2.0
 * @copyright: 2016上海风创信息咨询有限公司-版权所有
 */

package com.relax.www.test;

import com.google.common.io.Resources;
import org.junit.Test;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
import java.util.concurrent.CyclicBarrier;

/**
 * @author no_relax
 * @ClassName: TestDemo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @date 2016年10月24日 下午6:11:06
 */
public class TestDemo {
    /*
     * CyclicBarrier的应用场景
	 * CyclicBarrier可以用于多线程计算数据，最后合并计算结果的应用场景。比如我们用一个Excel保存了用户所有银行流水，
	 * 每个Sheet保存一个帐户近一年的每笔银行流水，现在需要统计用户的日均银行流水，先用多线程处理每个sheet里的银行流水，
	 * 都执行完之后，得到每个sheet的日均银行流水，最后，再用barrierAction用这些线程的计算结果，计算出整个Excel的日均银行流水。
	 */

    /**
     * TODO(这里用一句话描述这个方法的作用)
     *
     * @param args void
     * @author: no_relax
     * @Title: main
     * @since Vpad1.2.0
     */
    /*public static void main(String[] args) {
        long t1 = System.nanoTime();// 细粒度的获取时间信息，但获取的时间只供参考，不准确
		System.out.println(t1);
		cyclicBarrierTest1();
	}*/

	/*
	 * CyclicBarrier 的字面意思是可循环使用（Cyclic）的屏障（Barrier）。
	 * 它要做的事情是，让一组线程到达一个屏障（也可以叫同步点）时被阻塞，直到最后一个线程到达屏障时，
	 * 屏障才会开门，所有被屏障拦截的线程才会继续干活。CyclicBarrier默认的构造方法是CyclicBarrier(int parties)，
	 * 其参数表示屏障拦截的线程数量，每个线程调用await方法告诉CyclicBarrier我已经到达了屏障，然后当前线程被阻塞。 如果把new
	 * CyclicBarrier(2)修改成new CyclicBarrier(3)则主线程和子线程会永远等待，
	 * 因为没有第三个线程执行await方法，即没有第三个线程到达屏障，所以之前到达屏障的两个线程都不会继续执行。
	 */
    public static void cyclicBarrierTest() {
        CyclicBarrier c = new CyclicBarrier(2);
        new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    c.await();
                } catch (Exception e) {

                }
                System.out.println(1);
            }
        }).start();

        try {
            c.await();
        } catch (Exception e) {

        }
        System.out.println(2);
    }

    /*
     * CyclicBarrier还提供一个更高级的构造函数CyclicBarrier(int parties, Runnable
     * barrierAction)， 用于在线程到达屏障时，优先执行barrierAction，方便处理更复杂的业务场景。代码如下:
     * CyclicBarrier的应用场景
     * CyclicBarrier可以用于多线程计算数据，最后合并计算结果的应用场景。比如我们用一个Excel保存了用户所有银行流水，
     * 每个Sheet保存一个帐户近一年的每笔银行流水，现在需要统计用户的日均银行流水，先用多线程处理每个sheet里的银行流水，
     * 都执行完之后，得到每个sheet的日均银行流水，最后，再用barrierAction用这些线程的计算结果，计算出整个Excel的日均银行流水。
     * 计算结果...25 12 13
     */
    static int i = 0;
    static int j = 0;

    public static void cyclicBarrierTest1() {
        CyclicBarrier c = new CyclicBarrier(2, new A());
        new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    i = 12 + 23;
                    c.await();
                } catch (Exception e) {

                }
                System.out.println(i);
            }
        }).start();

        try {
            j = 13 + 45;
            c.await();
        } catch (Exception e) {

        }
        System.out.println(j);
    }

    static class A implements Runnable {
        @Override
        public void run() {
            System.out.println("计算结果..." + (i + j));
        }

    }

    @Test // intern:降低了代码的运行效率，减少了jvm内存的使用
    public void internTest() throws Exception {
        String beforeStr = "吴松";
        // MessageDigest messageDigest = MessageDigest.getInstance("md5");
        // byte[] bs = messageDigest.digest(beforeStr.getBytes("UTF-8"));
        // Base64Encoder base64Encoder = new Base64Encoder();
        // System.out.println(base64Encoder.encode(bs));
        // System.out.println(new String("no relax").intern());
        byte[] bytes = beforeStr.getBytes("UTF-8");
        String str1 = new String(bytes, "ISO8859-1");
        System.err.println(str1);
        String str2 = new String(str1.getBytes("ISO8859-1"), "UTF-8");
        System.err.println(str2);
    }

    @Test
    /**
     * put时,如果hash表中没定位到,就在链表前加一个Entry,如果定位到了,则更换Entry中的value,并返回旧value old
     * value:>>>>null new value:>>>>wusong
     */
    public void putTest() {
        Map<String, Object> map = new HashMap<String, Object>();
        Object value = map.put("name", "wusong");
        System.out.println("value:>>>>" + value);
        Object oldValue = map.put("name", "norelax");
        System.out.println("new value:>>>>" + oldValue);
    }

    @Test // map的key排序
    public void comparatorTest() {
        TreeMap<Integer, Object> treeMap = new TreeMap<>(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }

            ;
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

    public static void main(String[] args) throws IOException {
        Resource resource = new ClassPathResource("bean-aop.xml");
        URL url = resource.getURL();
        String content = Resources.toString(url, Charset.defaultCharset());
        System.out.println(content);
    }

    @Test
    public void test1() {
        //子类实例化后成为父类接口,向上转型
        Animal animal = new HuskiesDog();
        animal.eat();
        HuskiesDog huskiesDog = new HuskiesDog();
        //将父类接口强转为子类接口，向下转型
        Dog dog = (Dog) huskiesDog.getInstance();
        dog.eat();
    }
}
