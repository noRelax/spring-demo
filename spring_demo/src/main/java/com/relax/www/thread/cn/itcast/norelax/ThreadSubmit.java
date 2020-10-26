package com.relax.www.thread.cn.itcast.norelax;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author wusong
 * @create 2020-04-28 13:43
 **/
public class ThreadSubmit implements Runnable {
    @Override
    public void run() {
        System.out.println("the thread is running!");
    }

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(new ThreadSubmit());
        executorService.shutdown();
    }
}
