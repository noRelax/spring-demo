
package com.relax.www.dao.reflect;

import java.io.Serializable;

import com.relax.www.bean.User;

/** 
* @ClassName: UserDaoImpl 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author no_relax 
* @date 2016年8月12日 下午6:41:39 
*  
*/
public class UserDaoImpl extends BaseDaoImpl<User>{
	
	@Override
	public void add(User t) {
		super.add(t);
	}

	@Override
	public void delete(Serializable id) {
		super.delete(id);
	}

	@Override
	public void update(User t) {
		super.update(t);
	}

	@Override
	public User findOne(Serializable id) {
		return super.findOne(id);
	}
	
	public static void main(String[] args) {
		UserDaoImpl userDaoImpl = new UserDaoImpl();
		System.out.println(userDaoImpl.findOne(1));
	}
	
}

