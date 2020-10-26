package com.relax.www.login;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @ClassName: MyReentrantLock
 * @Description: TODO(自定义锁，能够自动调用close方法去释放锁)
 * @author no_relax
 * @date 2016年10月8日 下午3:15:03
 * 
 */
public class MyReentrantLock extends ReentrantLock implements AutoCloseable {
	private static final long serialVersionUID = 1L;
	private static MyReentrantLock myReentrantLock;

	public static MyReentrantLock getMyReentrantLock(MyReentrantLock myReentrantLock) {
		MyReentrantLock.myReentrantLock = myReentrantLock;
		return myReentrantLock;
	}

	@Override
	public void close() throws Exception {
		System.out.println("exec close for unlock method...");
		myReentrantLock.unlock();
	}

	public static void main(String[] args) throws Exception {
		MyReentrantLock myReentrantLock = new MyReentrantLock();
		try (MyReentrantLock lock = getMyReentrantLock(myReentrantLock)) {
			lock.lock();
			int i = 1 + 1;
		}
	}

}
