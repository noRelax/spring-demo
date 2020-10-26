package com.relax.www.thread.read;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * 队列测试
 *
 * @author wusong
 * @create 2018-05-04 14:30
 **/
public class QueueTest {

    public static void main(String[] args) {
        final BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(1);
        new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                try {
                    Thread.sleep(1000);
                    //offer:将指定的元素插入此队列的尾部，如果该队列已满，则在到达指定的等待时间之前等待可用的空间。
                    //put:将指定的元素插入此队列的尾部，如果该队列已满，则等待可用的空间
                    queue.offer(i, 1, TimeUnit.SECONDS);
//                queue.put(i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        while (true) {
            try {
                //poll:获取并移除此队列的头部，在指定的等待时间前等待可用的元素（如果有必要）。
                //take:获取并移除此队列的头部，在元素变得可用之前一直等待（如果有必要）。
                System.out.println(queue.poll(1, TimeUnit.SECONDS));
//                System.out.println(queue.take());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


    }
}
