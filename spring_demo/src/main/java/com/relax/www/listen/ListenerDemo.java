package com.relax.www.listen;

//from http://www.flyne.org/article/646 观察者模式及Servlet事件监听器
public class ListenerDemo {
	public static void main(String[] args) {
		Student s = new Student("Flyne");
		// 给事件源s注册一个事件监听器
		s.addStudentListener(new StudentListener() {
			public void postStudy(StudentEvent e) {
				System.out.println(e.getStudent().getName() + ",学完了放松放松吧。");
			}

			public void preSleep(StudentEvent e) {
				System.out.println(e.getStudent().getName() + "，睡觉前喝杯牛奶吧！");
			}

			@Override
			public void preEat(StudentEvent e) {
				System.out.println(e.getStudent().getName()+",吃饭前先洗手吧！");
			}
		});

		// 事件发生 --> 产生事件对象 --> 调用监听器中的相应方法
		s.study();
		s.sleep();
		s.eat();
	}
}