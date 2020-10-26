/**
 * Project Name:spring_demo
 * File Name:BaseService.java
 * Package Name:com.relax.www.dao.base
 * Date:2016年4月5日下午3:15:18
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * 海风app在线学习平台
 * @author: no_relax
 * @Title: BaseService.java 
 * @Package: com.relax.www.dao.base
 * @date: 2016年4月5日-下午3:15:18
 * @version: Vphone1.3.0
 * @copyright: 2016上海风创信息咨询有限公司-版权所有
 * 
 */

package com.relax.www.service.base;

import org.springframework.beans.factory.annotation.Autowired;

import com.relax.www.dao.base.BaseDao;

/** 
* @ClassName: BaseService 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author no_relax 
* @date 2016年4月5日 下午3:15:18 
*  
*/
public class BaseService<T> {
	@Autowired(required=false)
	private BaseDao<T> baseDao;
	
	public void save(T entity) {
		System.out.println("save by ..."+baseDao);
		baseDao.save(entity);
	}

}

