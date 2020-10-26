package com.relax.www.jdk8;

import com.hfjy.base.util.JSONUtil;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 交易
 *
 * @author wusong
 * @create 2018-04-09 14:58
 **/
public class Transaction {
    private int type;
    private int value;
    private int id;
    private String message;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static List<Transaction> getList() {
        List<Transaction> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Transaction transaction = new Transaction();
            transaction.setType(i % 3);
            transaction.setValue(i);
            transaction.setId(i);
            transaction.setMessage(i + "");
            if (i%3==0) {
                transaction.setMessage(null);
            }
            list.add(transaction);
        }
        return list;
    }

    @Test
    public void test() {
        List<Transaction> list = Transaction.getList();
        List<Integer> collect = list.parallelStream().filter(t -> t.getType() == 0).sorted(Comparator.comparing(Transaction::getValue).reversed()).map(Transaction::getId).collect(Collectors.toList());
        for (Integer i : collect) {
            System.out.println(i);
        }
    }

    @Test
    public void testFilter(){
        List<Transaction> list = Transaction.getList();
        List<Transaction> collect = list.stream().filter(x -> Objects.isNull(x.getMessage()) || x.getMessage().equals("1")).collect(Collectors.toList());
        System.out.println(JSONUtil.toString(collect));
    }

    public static void main(String[] args) throws InterruptedException {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8};
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(intArray));
        List<Integer> parallelStorage = new ArrayList<>();//Collections.synchronizedList(new ArrayList<>());
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
        new Thread(() -> System.out.println("*********")).start();
    }

    @Test
    public void test1() {
        Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8};
        List<Integer> listOfIntegers = new ArrayList<>(Arrays.asList(intArray));
        listOfIntegers.stream().forEachOrdered(x -> System.out.println(x));
        listOfIntegers.forEach(x -> System.out.println(x));
        User user = (String name, String address) -> {
            return name + address;
        };
        String userInfo = user.getUserInfo("a", "b");
        System.out.println("*******" + userInfo);
    }

    @Test
    public void listJDK8Operate() {
        List<Transaction> list = getList();
        //list排序
        List<Integer> values = list.parallelStream().filter(x -> x.getType() == 1).sorted((x1, x2) -> x1.getValue() - x2.getValue()).map(x -> x.getValue()).collect(Collectors.toList());
        System.out.println(values);
        //list转map
        Map<Integer, Integer> map = list.parallelStream().collect(Collectors.toMap(x -> x.getId(), x -> x.getValue()));
        System.out.println(map);
        //list转string
        String strs = list.parallelStream().map(x -> x.getId() + "").collect(Collectors.joining(",")).toString();
        System.out.println(strs);
        //list元素聚合
        int sum = list.parallelStream().filter(x -> x.getType() == 1).mapToInt(x -> x.getValue()).sum();
        System.out.println(sum);
    }

    @Test
    public void listSort() {
        List<Transaction> list = getList();
        //按照id的升序排列
        List<Transaction> transactionList = list.stream().sorted((x1, x2) -> x1.getId() - x2.getId()).collect(Collectors.toList());
        String idsDesc = transactionList.stream().map(x -> x.getId() + "").collect(Collectors.joining(",")).toString();
        System.out.println(idsDesc);

        //按照id的降序排列
        transactionList = list.stream().sorted((x1, x2) -> x2.getId() - x1.getId()).collect(Collectors.toList());
        String idsAsc = transactionList.parallelStream().map(x -> x.getId() + "").collect(Collectors.joining(",")).toString();
        System.out.println(idsAsc);

    }

    @Test
    public void listDistinct() {
        List<Transaction> list = getList();
        //对list中的元素去重处理
        String strs = list.parallelStream().map(x -> x.getType() + "").distinct().collect(Collectors.joining(","));
        System.out.println(strs);
    }

    @Test
    public void listToMap() {
        List<Transaction> list = getList();
        Map<Integer, Integer> map = list.stream().collect(Collectors.toMap(x -> x.getType(), x -> x.getValue(), (x1, x2) -> x1));
        System.out.println(map);
    }

    @Test
    public void listFilter() {
        List<Transaction> list = getList();
        list.stream().filter(x -> x.getType() > 1).collect(Collectors.toList()).forEach(x -> System.out.println(JSONUtil.toString(x)));
    }

    @Test
    public void testDistinct1() {
        Integer[] i = {1, 2, 3, 4, 3, 4, 2};
        List<Integer> integers = Arrays.asList(i);
        Set<Integer> collect = integers.parallelStream().collect(Collectors.toSet());
        collect.forEach(x -> System.out.println(x));

    }

    /**
     * 排序分页
     */
    @Test
    public void testGroupingBy() {
        List<Integer> list1 = Arrays.asList(6, 3, 2, 5, 88, 23);
        List<Transaction> transactionList1 = list1.parallelStream().map(i -> {
            Transaction transaction = new Transaction();
            transaction.setId(i);
            transaction.setType(i);
            transaction.setValue(i);
            return transaction;
        }).collect(Collectors.toList());
        List<Integer> list2 = Arrays.asList(67, 34, 1, 7, 8, 66);

        List<Transaction> transactionList2 = list2.parallelStream().map(j -> {
            Transaction transaction = new Transaction();
            transaction.setId(j);
            transaction.setType(j);
            transaction.setValue(j);
            return transaction;
        }).collect(Collectors.toList());
        List<Transaction> transactionList = new ArrayList<>();
        transactionList.addAll(transactionList1);
        transactionList.addAll(transactionList2);

        transactionList = transactionList.parallelStream().sorted((x1, x2) -> x2.getValue() - x1.getValue()).limit(10).collect(Collectors.toList());
        System.out.println(JSONUtil.toString(transactionList));

    }


}
