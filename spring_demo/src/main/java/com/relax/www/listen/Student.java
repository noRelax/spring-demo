package com.relax.www.listen;

public class Student {
    private String name;
    //在事件源中保持了监听器的引用（☆）
    private StudentListener listener;
    public Student(String name){
        this.name = name;
    }
 
    public void study(){
        System.out.println(name+",开始学习");
        if(listener!=null){//如果注册了该监听器
            listener.postStudy(new StudentEvent(this));
        }
    }
 
    public void sleep(){
        if(listener!=null){//如果注册了该监听器
            listener.preSleep(new StudentEvent(this));
        }
        System.out.println(name+",开始睡觉");
    }
    
    public void eat(){
    	if (listener!=null) {
			listener.preEat(new StudentEvent(this));
		}
    	System.out.println(name+",开始吃饭");
    }
 
    //在事件源中要有注册监听器的方法：
    public void addStudentListener(StudentListener listener){
        this.listener = listener;
    }
 
    public String getName() {
        return name;
    }
}