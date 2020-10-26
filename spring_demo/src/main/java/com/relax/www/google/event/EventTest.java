package com.relax.www.google.event;

import com.relax.www.bean.User;
import org.junit.Test;

/**
 * @author wusong
 * @create 2017-10-06 13:15
 **/
public class EventTest {
    @Test
    public void test1() {
        DataObserver dataObserver1 = new DataObserver();
        EventBusCenter.register(dataObserver1);
        EventBusCenter.post("吴松哈哈哈");
        EventBusCenter.post(123);
        User user = new User("wusong", "123456");
        EventBusCenter.post(user);

    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            DataObserver dataObserver1 = new DataObserver();
            EventBusCenter.register(dataObserver1);
            new Thread(() -> {
                EventBusCenter.post("吴松哈哈哈");
                EventBusCenter.post(123);
                User user = new User("wusong", "123456");
                EventBusCenter.post(user);
            }).start();
        }
    }
}
