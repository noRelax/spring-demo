package com.relax.www.thread.cn.itcast.heima2;

import java.util.Random;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/*
 * Lock比传统线程模型中的synchronized方式更加面向对象，与生活中的锁类似，锁本身也应该是一个对象。两个线程执行的代码片段要实现同步互斥的效果，它们必须用同一个Lock对象。
　　读写锁：分为读锁和写锁，多个读锁不互斥，读锁与写锁互斥，这是由jvm自己控制的，你只要上好相应的锁即可。如果你的代码只读数据，可以很多人同时读，但不能同时写，那就上读锁；如果你的代码修改数据，只能有一个人在写，且不能同时读取，那就上写锁。
	总之，读的时候上读锁，写的时候上写锁！
	ReentrantReadWriteLock会使用两把锁来解决问题，一个读锁，一个写锁
	线程进入读锁的前提条件：
	    没有其他线程的写锁，
	    没有写请求或者有写请求，但调用线程和持有锁的线程是同一个
	线程进入写锁的前提条件：
	    没有其他线程的读锁
	    没有其他线程的写锁
	到ReentrantReadWriteLock，首先要做的是与ReentrantLock划清界限。它和后者都是单独的实现，彼此之间没有继承或实现的关系。然后就是总结这个锁机制的特性了： 
     (a).重入方面其内部的WriteLock可以获取ReadLock，但是反过来ReadLock想要获得WriteLock则永远都不要想。 
     (b).WriteLock可以降级为ReadLock，顺序是：先获得WriteLock再获得ReadLock，然后释放WriteLock，这时候线程将保持Readlock的持有。反过来ReadLock想要升级为WriteLock则不可能，为什么？参看(a)，呵呵. 
     (c).ReadLock可以被多个线程持有并且在作用时排斥任何的WriteLock，而WriteLock则是完全的互斥。这一特性最为重要，因为对于高读取频率而相对较低写入的数据结构，使用此类锁同步机制则可以提高并发量。 
     (d).不管是ReadLock还是WriteLock都支持Interrupt，语义与ReentrantLock一致。 
     (e).WriteLock支持Condition并且与ReentrantLock语义一致，而ReadLock则不能使用Condition，否则抛出UnsupportedOperationException异常。 
 */
public class ReadWriteLockTest {
    public static void main(String[] args) {
        final Queue3 q3 = new Queue3();
        for(int i=0;i<3;i++)
        {
            new Thread(){
                public void run(){
                    while(true){
                        q3.get();                        
                    }
                }
                
            }.start();
        }
        for(int i=0;i<3;i++)
        {        
            new Thread(){
                public void run(){
                    while(true){
                        q3.put(new Random().nextInt(10000));
                    }
                }            
                
            }.start();    
        }
    }
}

class Queue3{
    private Object data = null;//共享数据，只能有一个线程能写该数据，但可以有多个线程同时读该数据。
    private ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
    public void get(){
        rwl.readLock().lock();//上读锁，其他线程只能读不能写
        System.out.println(Thread.currentThread().getName() + " be ready to read data!");
        try {
            Thread.sleep((long)(Math.random()*1000));
            System.out.println(Thread.currentThread().getName() + "have read data :" + data);        
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
        	rwl.readLock().unlock(); //释放读锁，最好放在finnaly里面
		}
    }
    
    public void put(Object data){

        rwl.writeLock().lock();//上写锁，不允许其他线程读也不允许写
        System.out.println(Thread.currentThread().getName() + " be ready to write data!");                    
        try {
            Thread.sleep((long)(Math.random()*1000));
            this.data = data;        
            System.out.println(Thread.currentThread().getName() + " have write data: " + data);                    
        } catch (InterruptedException e) {
            e.printStackTrace();
        }finally {
        	rwl.writeLock().unlock();//释放写锁    
		}
        
    }
}
