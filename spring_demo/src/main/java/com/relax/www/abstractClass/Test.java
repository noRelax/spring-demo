package com.relax.www.abstractClass;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author wusong
 * @create 2018-07-31 16:08
 **/
public class Test {
    public static void main(String[] args) {
        String str1 = "";
        String str2 = "";
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        test1(str1, str2);
        test2(list1, list2);
        /*List<String> list3 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list3.add(i + "");
            list2.add(i * 10 + "");
        }
        list1 = list3;*/

        System.out.println(str1 + ">>>" + str2);
        System.out.println("list1:>>" + list1.stream().collect(Collectors.joining(",")).toString());
    }

    public static void test1(String str1, String str2) {
        str1 = "123";
        str2 = "4444";
    }

    public static void test2(List<String> list1, List<String> list2) {
        List<String> list3 = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            list3.add(i + "");
            list2.add(i * 10 + "");
        }
        list1.addAll(list3);
    }
}
