
package com.relax.www.test;

/**
 * ClassName:HuskiesDog <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason:	 TODO ADD REASON. <br/>
 * Date:     2017年1月23日 上午11:31:31 <br/>
 *
 * @author wusong
 * @version
 * @see
 * @since JDK 1.6
 */

import org.spark_project.guava.base.Splitter;
import org.spark_project.guava.collect.ComparisonChain;
import org.spark_project.guava.collect.Ordering;

import java.util.Iterator;

/**
 * @author no_relax
 * @ClassName: HuskiesDog
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @date 2017年1月23日 上午11:31:31
 */
public class HuskiesDog implements Dog {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void eat() {
        Dog.super.eat();
    }

    public static void main(String[] args) {
        HuskiesDog huskiesDog = new HuskiesDog();
        huskiesDog.setName("wusong");
        System.out.println(huskiesDog.compareTo(huskiesDog));
        huskiesDog.eat();
        Iterable<String> iterable = Splitter.on(',').trimResults().omitEmptyStrings().split("foo,bar,,   qux");
        Iterator<String> iterator = iterable.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

    public Animal getInstance() {
        return this;
    }

    public int compareTo(HuskiesDog that) {
        return ComparisonChain.start().compare(this.name, that.name, Ordering.natural().nullsLast()).result();
    }


}
