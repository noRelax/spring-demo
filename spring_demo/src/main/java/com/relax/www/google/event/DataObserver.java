package com.relax.www.google.event;

import com.google.common.eventbus.AllowConcurrentEvents;
import com.google.common.eventbus.Subscribe;
import com.hfjy.base.util.JSONUtil;
import com.relax.www.bean.User;

/**
 * 观察者1
 *
 * @author wusong
 * @create 2017-10-06 13:12
 **/
public class DataObserver {
    //通过@Subscribe注解方法才会被注册到EventBus中，而且方法中有且只有一个参数
    @Subscribe
    @AllowConcurrentEvents
    public void receive(String message) {
        System.out.println("receive String message********:" + message);
    }

    /**
     * post()不支持自动装箱功能，只能使用Integer，不能使用int，如果使用int，将不会被接收
     *
     * @param message
     */
    @Subscribe
    @AllowConcurrentEvents
    public void receive(Integer message) {
        System.out.println("receive Integer message********:" + message);
    }

    @Subscribe
    @AllowConcurrentEvents
    public void receive(User user) {
        System.out.println("receive Integer message********:" + JSONUtil.toString(user));
    }
}