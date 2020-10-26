/**
 * Project Name:spring_demo
 * File Name:BuyServiceImpl.java
 * Package Name:com.relax.www.tx.service
 * Date:2016年4月11日下午5:20:24
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * 海风app在线学习平台
 * @author: no_relax
 * @Title: BuyServiceImpl.java 
 * @Package: com.relax.www.tx.service
 * @date: 2016年4月11日-下午5:20:24
 * @version: Vphone1.3.0
 * @copyright: 2016上海风创信息咨询有限公司-版权所有
 * 
 */

package com.relax.www.tx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.relax.www.tx.dao.BookDao;
import com.relax.www.tx.dao.MyJdbcTemplate;
import com.relax.www.tx.dao.UserDao;
import com.relax.www.tx.entity.Book;

/** 
* @ClassName: BuyServiceImpl 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author no_relax 
* @date 2016年4月11日 下午5:20:24 
*  
*/
@Service
public class BuyServiceImpl implements BuyService {
	@Autowired
	private UserDao userDao;
	@Autowired
	private BookDao bookDao;
	@Autowired
	private MyJdbcTemplate jdbcTemplate;

	@Override
	//添加事物处理
	@Transactional(propagation=Propagation.REQUIRES_NEW,isolation=Isolation.READ_COMMITTED)
	public void buyBook(Integer userId, Integer bookId) {
		//获取此书信息
		Book book = bookDao.getBookById(bookId);
		//先扣除用户余额
		userDao.updateUserBalance(userId, book.getBookPrice());
		//减少此书库存
		bookDao.updateBookStock(bookId);
	}
	
	@Override
	public int saveBook(Integer bookStock, String bookName, Integer bookPrice) {
		String sql=" insert into book(book_stock,book_name,book_price) values(?,?,?)";
		return jdbcTemplate.update(sql, bookStock,bookName,bookPrice);
	}

}

