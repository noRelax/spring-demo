package com.relax.www.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author wusong
 * @create 2017-10-07 19:49
 **/
public class TestInitializingBean implements InitializingBean,DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("this class is Initialing...");
    }

    public void init() {
        System.out.println("the method init is executed...");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("the method destroy is executed...");
    }
    /**
     * 由结果可看出，在spring初始化bean的时候，如果该bean是实现了InitializingBean接口，
     * 并且同时在配置文件中指定了init-method，系统则是先调用afterPropertiesSet方法，
     * 然后在调用init-method中指定的方法。
     *
     * @param args
     */
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring-initializingBean.xml");
        //destroy()方法是在调用close()方法之后执行
        context.close();
    }

}
