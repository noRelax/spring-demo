package com.relax.www.bigdata;

/**
 * @ClassName: InstanceOfDemo
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author no_relax
 * @date 2016年9月2日 下午3:03:13
 * 
 */
interface A {

}

class B implements A {

}

class C extends B {

}

public class instanceofDemo {

	public static void main(String[] args) {
		A ab = new B();
		A ac = new C();
		B bc = new C();
		B bb = new B();
		C cc = new C();
		// 对象实现一个接口，用这个对象和这个接口进行instanceof判断，都为true。
		System.out.println("ab instanceof A=" + (ab instanceof A)+">>>>>"+(A)new B());
		System.out.println("ac instanceof A=" + (ac instanceof A));
		System.out.println("bc instanceof A=" + (bc instanceof A));
		System.out.println("bb instanceof A=" + (bb instanceof A));
		System.out.println("cc instanceof A=" + (cc instanceof A));
		// 对象和父类进行instanceof判断，都为true
		System.out.println("ab instanceof B=" + (ab instanceof B));
		System.out.println("ac instanceof B=" + (ac instanceof B));
		System.out.println("bc instanceof B=" + (bc instanceof B));
		System.out.println("bb instanceof B=" + (bb instanceof B));
		System.out.println("cc instanceof B=" + (cc instanceof B));
		// 对象和他的子类进行instanceof判断为false
		System.out.println("ab instanceof C=" + (ab instanceof C));
		System.out.println("ac instanceof C=" + (ac instanceof C));
		System.out.println("bc instanceof C=" + (bc instanceof C));
		System.out.println("bb instanceof C=" + (bb instanceof C)+">>>>>"+(C)new B());
		System.out.println("cc instanceof C=" + (cc instanceof C));
	}
}
