/**
 * Project Name:spring_demo
 * File Name:BookDaoImpl.java
 * Package Name:com.relax.www.tx.dao
 * Date:2016年4月11日下午4:45:38
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * 海风app在线学习平台
 * @author: no_relax
 * @Title: BookDaoImpl.java 
 * @Package: com.relax.www.tx.dao
 * @date: 2016年4月11日-下午4:45:38
 * @version: Vphone1.3.0
 * @copyright: 2016上海风创信息咨询有限公司-版权所有
 * 
 */

package com.relax.www.tx.dao;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.relax.www.tx.Exception.BookException;
import com.relax.www.tx.entity.Book;
import com.relax.www.tx.service.base.BaseService;

/** 
* @ClassName: BookDaoImpl 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author no_relax 
* @date 2016年4月11日 下午4:45:38 
*  
*/
@Repository
public class BookDaoImpl extends BaseService implements BookDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void updateBookStock(Integer bookId) {
		Book book = getBookById(bookId);
		if (book.getBookStock()<=0) {
			throw new BookException(" 库存不足！");
		}
		book.setBookStock(book.getBookStock()-1);
		String sql=" update book set book_stock=book_stock-1 where book_id=? ";
		jdbcTemplate.update(sql, bookId);
	}

	@SuppressWarnings("all")
	@Override
	public Book getBookById(Integer bookId) {
		String sql=" select * from book where book_id=? ";
		RowMapper<Book> bookMapper=new BeanPropertyRowMapper(Book.class);
		return jdbcTemplate.queryForObject(sql, bookMapper,bookId);
	}
	
	
	


}

