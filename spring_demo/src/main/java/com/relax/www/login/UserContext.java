package com.relax.www.login;

import com.relax.www.bean.User;

public class UserContext implements AutoCloseable {

	static final ThreadLocal<User> current = new ThreadLocal<User>();

	public UserContext(User user) {
		current.set(user);
	}

	public static User getCurrentUser() {
		return current.get();
	}
	//如果调用出现异常后，会执行close方法，相当于try...finally...
	public void close() {
		System.out.println(Thread.currentThread().getName()+":exec remove method...");
		current.remove();
	}

	@SuppressWarnings("all")
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					User user = new User();
					try (UserContext userContext = new UserContext(user)) {
						User currentUser = userContext.getCurrentUser();
						System.out.println(Thread.currentThread().getName()+":"+currentUser);
					}
				}
			}).start();
		}
	}
}