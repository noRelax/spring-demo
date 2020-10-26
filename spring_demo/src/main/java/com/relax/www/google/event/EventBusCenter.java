package com.relax.www.google.event;

import com.google.common.eventbus.EventBus;

/**
 * 事件总线
 *
 * @author wusong
 * @create 2017-10-06 13
 **/
public class EventBusCenter {
    private static EventBus eventBus = new EventBus();

    public EventBusCenter() {
    }

    public static EventBus getInstance() {
        return eventBus;
    }

    //注册观察者
    public static void register(Object object) {
        eventBus.register(object);
    }

    //销毁观察者
    public static void UnRegister(Object object) {
        eventBus.unregister(object);
    }

    //发布消息
    public static void post(Object object){
        eventBus.post(object);
    }

}
