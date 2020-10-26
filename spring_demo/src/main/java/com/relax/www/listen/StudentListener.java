package com.relax.www.listen;

public interface StudentListener {
    //对study事件进行监听，该事件结束后调用
    void postStudy(StudentEvent e);
    //对sleep事件进行监听，该事件开始前调用
    void preSleep(StudentEvent e);
    //对eat事件进行监听，该事件开始前调用
    void preEat(StudentEvent e);
}