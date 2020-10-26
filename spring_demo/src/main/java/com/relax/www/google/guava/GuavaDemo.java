package com.relax.www.google.guava;

import com.relax.www.test.Dog;
import org.junit.Test;
import org.spark_project.guava.base.Objects;
import org.spark_project.guava.collect.ComparisonChain;
import org.spark_project.guava.collect.Range;
import org.spark_project.guava.math.IntMath;

import java.math.RoundingMode;

/**
 * @author wusong
 * @create 2019-12-04 16:14
 **/
public class GuavaDemo {
    @Test
    public void testToString() {
        String x = Objects.toStringHelper(Dog.class).add("x", 1).toString();
        System.out.println(">>>>>>" + x);
        Range<Integer> range = Range.closed(1, 3);
        System.out.println(range.contains(4));
        int divide = IntMath.divide(1, 3, RoundingMode.HALF_EVEN);
        System.out.println(divide);

    }
}
