package com.relax.www.thread.cn.itcast.heima2;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

//自定义缓存处理类
public class CacheDemo {

    private Map<String, Object> cache = new HashMap<String, Object>();

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CacheDemo cacheDemo = new CacheDemo();
        for (int i = 0; i < 10; i++) {
            Runnable r = () -> {
                System.out.println(cacheDemo.getData("wusong"));
            };
            new Thread(r).start();
        }

    }

    //ReentrantReadWriteLock是Lock的另一种实现方式，
    // 我们已经知道了ReentrantLock是一个排他锁，
    // 同一时间只允许一个线程访问，而ReentrantReadWriteLock允许多个读线程同时访问，
    // 但不允许写线程和读线程、写线程和写线程同时访问。
    // 相对于排他锁，提高了并发性。在实际应用中，
    // 大部分情况下对共享数据（如缓存）的访问都是读操作远多于写操作，
    // 这时ReentrantReadWriteLock能够提供比排他锁更好的并发性和吞吐量
    private ReadWriteLock rwl = new ReentrantReadWriteLock();

    public Object getData(String key) {
        //加读锁，开始读操作
        rwl.readLock().lock();
        Object value = null;
        try {
            value = cache.get(key);
            if (value == null) {
                //将读锁释放，不让其进行读取操作
                rwl.readLock().unlock();
                //加写锁，进行写入操作,有A、B、C 3个线程在此等待,只有A线程拿到了写锁，B、C两个线程堵塞在这里，当写锁释放后，B、C进入，需要加if(value==null)判断
                rwl.writeLock().lock();
                try {
                    //由于57恢复读锁，这在44行等待的读线程会抢占锁资源，进行读取操作，所以在这里多判断一层就减少了与数据库的交互，提升性能
                    if (value == null) {
                        System.out.println("----------");
                        value = "aaaa";//查询数据库操作;
                        cache.put(key, value);
                    }
                } finally {
                    //写完就释放写锁
                    rwl.writeLock().unlock();
                }
                //恢复读锁，让其继续进行读取操作
                rwl.readLock().lock();
            }
        } finally {
            rwl.readLock().unlock();
        }
        return value;
    }
}
