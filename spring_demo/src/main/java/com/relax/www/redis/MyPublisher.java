package com.relax.www.redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 发布者
 *
 * @author wusong
 * @create 2020-10-30 10:14
 **/
public class MyPublisher extends Thread {
    private final JedisPool jedisPool;
    public MyPublisher(JedisPool jedisPool){
        this.jedisPool = jedisPool;
    }

    @Override
    public void run() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        super.run();
    }
}
