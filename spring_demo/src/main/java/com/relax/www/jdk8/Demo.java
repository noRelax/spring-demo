
/**
 * 海风app在线学习平台
 *
 * @author: no_relax
 * @Title: Demo.java
 * @Package: com.relax.www.jdk8
 * @date: 2016年7月14日-下午5:10:21
 * @version: Vphone1.3.0
 * @copyright: 2016上海风创信息咨询有限公司-版权所有
 */

package com.relax.www.jdk8;

import com.hfjy.base.util.JSONUtil;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author no_relax
 * @ClassName: Demo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @date 2016年7月14日 下午5:10:21
 */
public class Demo {
    List<Map<String, Object>> listMap;

    @Before
    public void init() {
        listMap = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            Map<String, Object> map = new HashMap<>();
            map.put("index", i);
            listMap.add(map);
        }

    }

    @SuppressWarnings("all")
    /*public static void main(String[] args) throws InterruptedException {
        List list = new ArrayList();
        Map<String, Integer> map = new HashMap<String, Integer>();
        for (int i = 1; i <= 5; ++i) {
            list.add(i);
            map.put(i + "", i);

        }
        list.stream().filter(param -> (int) param % 2 == 1).forEach(System.out::println);
        list.stream().filter(param -> (int) param % 2 == 0).forEach(System.out::println);
        Runnable r = () -> System.out.println("1234");
        r.run();
        map.forEach((key, value) -> System.out.println(key + ":" + value));
    }*/

    /**
     * flatMap 将多个Stream连接成一个Stream
     */
    @Test
    public void flatMapTest() {
        List<Integer> result = Stream.of(Arrays.asList(1, 3), Arrays.asList(5, 6)).flatMap(a -> a.stream()).collect(Collectors.toList());
        for (Integer integer : result) {
            System.out.println(integer);
        }
    }

    @Test
    public void toMapTest() {
        Stream<String> strStream = Stream.of("java", "c++", "c", "python");
        //Map<String, Integer> map1 = strStream.collect(Collectors.toMap(Function.identity(), x -> {
        Map<String, Integer> map1 = strStream.collect(Collectors.toMap(x -> x, x -> {
            switch (x) {
                case "java":
                    return 1;
                case "c++":
                    return 2;
                case "c":
                    return 3;
                case "python":
                    return 4;
            }
            return 0;
        }));
        map1.forEach((k, v) -> System.out.println(k + ":" + v));
    }

    @Test
    public void test() {
        Demo1 d = (String args) -> {
            return args;
        };
        System.out.println(d.funWithParameters("3333"));
    }

    @Test
    public void testFlatMap() {
        List<Map<String, Object>> collect = listMap.stream().map(x -> {
            Map<String, Object> map = new HashMap<>();
            List<Map<String, Object>> list = new ArrayList<>();
            map.put("name", x.get("index"));
            list.add(map);
            return list;
        }).flatMap(Collection::stream).collect(Collectors.toList());
        System.out.println(JSONUtil.toString(collect));
    }

    @Test
    public void testParallelStream() {
        listMap.parallelStream().forEach(x -> System.out.println(x.get("index")));
    }

    @Test
    public void testPredicate() {
        List languages = Arrays.asList("Java", "Scala", "C++", "Haskell", "Lisp");
        // 甚至可以用and()、or()和xor()逻辑函数来合并Predicate，
        // 例如要找到所有以J开始，长度为四个字母的名字，你可以合并两个Predicate并传入
        Predicate<String> startsWithJ = n -> n.startsWith("J");
        Predicate<String> fourLetterLong = n -> n.length() == 4;
        languages.stream()
                .filter(startsWithJ.and(fourLetterLong))
                .forEach((n) -> System.out.print("nName, which starts with 'J' and four letter long is : " + n));

    }

    @Test
    public void testMap() {
        // 不使用lambda表达式为每个订单加上12%的税
        List<Integer> costBeforeTax = Arrays.asList(100, 200, 300, 400, 500);
        for (Integer cost : costBeforeTax) {
            double price = cost + .12 * cost;
            System.out.println(price);
        }
        System.out.println(">>>>>>>>>>>>");
        // 使用lambda表达式
        List<Integer> costBeforeTax1 = Arrays.asList(100, 200, 300, 400, 500);
        costBeforeTax1.stream().map((cost) -> cost + .12 * cost).forEach(System.out::println);
        Double aDouble = costBeforeTax1.stream().map((cost) -> cost + .12 * cost).reduce((x, y) -> x + y).get();
        System.out.println(aDouble);

    }

    @Test
    public void testString() {
        // 将字符串换成大写并用逗号链接起来
        List<String> G7 = Arrays.asList("USA", "Japan", "France", "Germany", "Italy", "U.K.", "Canada");
        String G7Countries = G7.stream().map(x -> x.toUpperCase()).collect(Collectors.joining(", "));
        System.out.println(G7Countries);
    }

    @Test
    public void testDistinct() {
        // 用所有不同的数字创建一个正方形列表
        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        List<Integer> distinct = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
        //正序排列
        distinct.sort(Integer::compareTo);
        System.out.printf("Original List : %s,  Square Without duplicates : %s %n", numbers, distinct);

        //倒序排列
        distinct.sort(Comparator.reverseOrder());
        System.out.printf("Original List : %s,  Square Without duplicates : %s %n", numbers, distinct);
    }

    @Test
    public void removeIf() {
        List<Integer> numbers = Arrays.asList(9, 10, 3, 4, 7, 3, 4);
        numbers = new ArrayList<>(numbers);
        boolean b = numbers.removeIf(number -> number.equals(4));
        System.out.println(b);
        System.out.println(numbers);
        String str = "中华人民共和国";
        System.out.println(str.contains("中国") || str.contains("中华人民共和国"));
    }


    @Test
    public void test1() throws InterruptedException {
        for (int i = 0; i < 10; i++) {

            Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8};
            List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(intArray));
            List<Integer> parallelStorage = Collections.synchronizedList(new ArrayList<>());//new ArrayList<>();//
            // Don't do this! It uses a stateful lambda expression.
            listOfIntegers.parallelStream().map(e -> {
                parallelStorage.add(e);
                return e;
            }).forEachOrdered(e -> System.out.print(e + " "));
            System.out.println();
            parallelStorage.stream().forEachOrdered(e -> System.out.print(e + " "));
            System.out.println();
            System.out.println("Sleep 5 sec");
            TimeUnit.SECONDS.sleep(5);
            parallelStorage.stream().forEachOrdered(e -> System.out.print(e + " "));
        }
    }

    public static void main(String[] args) {
        /*
         * 先说说我做这题的思路：
         * 1、创建一个含有100个元素的集合，元素从1到100。（分别对应这100个人）
         * 2、从1数到14算一圈，则相当于走了99个圈，每走一圈从集合里删除一个元素。
         * 3、走完这99圈以后，集合里剩下的那个元素就是最后剩下的人
         *
         * 这里最关键的就是求每次从集合里删除的那个元素的下标。
         */
        //创建一个集合all，集合中的元素为1，2，3，……，100，代表所有人
        List<Integer> all = new LinkedList<Integer>();
        for (int i = 1; i <= 100; i++) {
            all.add(i);
        }

        //下面的代码表示循环99次，每次从集合里删除一个元素，代表退出的那个人的编号
        //i表示退出的那个人在all集合中的下标
        int i = 0;
        //循环99次
        for (int n = 1; n < 100; n++) {
            //每次循环时，求得将要退出的人在集合中的下标
            i = (i + 13) % all.size();
            //将集合中代表该人的元素删除
            all.remove(i);
        }

        //循环99次，删除99个人，剩下的最后一个，就是你了
        System.out.println("最后剩下的是第 " + all.get(0) + " 个人");

        /*
         * 不难看出，本题最核心的还是求每次循环时需要删除的那个元素的下标。
         */
    }

    @Test
    public void test2() {
        int a = 15;
        if ((a & 1) == 0) {
            System.out.println("偶数...");
            return;
        }
        System.out.println("奇数...");

    }

}

