package com.relax.www.listen;

public class StudentEvent {
    //在事件中封装了事件源
    private Object source;
    public StudentEvent(Object source){
        this.source = source;
    }
    public Object getSource(){
        return source;
    }
    public Student getStudent(){
        return (Student)source;
    }
}