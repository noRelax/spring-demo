package com.relax.www.thread.cn.itcast.heima2;

public class User implements Cloneable {
	private String name;
	private int age;
	{
		System.out.println("no params constuctor!");
	}

	private User() {
	};

	private static User user = null;

	public static User getInstance() {

		if (user == null) {
			synchronized (User.class) {
				if (user == null) {
					user = new User();
				}
			}
		}
		return user;
	}

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof User)) {
			return false;
		}
		User user = (User) obj;
		// if(this.name==user.name && this.age==user.age)
		if (this.name.equals(user.name) && this.age == user.age) {
			return true;
		} else {
			return false;
		}
	}

	public int hashCode() {
		return name.hashCode() + age;
	}

	public String toString() {
		return "{name:'" + name + "',age:" + age + "}";
	}

	public Object clone() {
		Object object = null;
		try {
			object = super.clone();
		} catch (CloneNotSupportedException e) {
		}
		return object;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public static void main(String[] args) {
		User user = User.getInstance();
	}

}
