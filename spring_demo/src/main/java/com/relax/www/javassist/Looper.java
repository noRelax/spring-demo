package com.relax.www.javassist;

public class Looper {
    public void loop(){
        try {
            System.out.println("Looper.loop() invoked");
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}