package com.relax.www.http;

import org.junit.Test;

/**
 * @author wusong
 * @create 2019-11-14 10:40
 **/
public class HttpTest {
    @Test
    public void mainMethod() {
        subMethod("123", "456");
    }

    public void subMethod(String param1, String param2) {
        RetryUtil.setRetryTimes(3).retry(param1, param2);
    }
}
