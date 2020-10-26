/**
 * Project Name:spring_demo
 * File Name:BuyControllerTest.java
 * Package Name:com.relax.www.tx.web
 * Date:2016年4月11日下午5:24:18
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * 海风app在线学习平台
 * @author: no_relax
 * @Title: BuyControllerTest.java 
 * @Package: com.relax.www.tx.web
 * @date: 2016年4月11日-下午5:24:18
 * @version: Vphone1.3.0
 * @copyright: 2016上海风创信息咨询有限公司-版权所有
 * 
 */
package com.relax.www.tx.web;

import com.relax.www.tx.aop.JdbcTemplateShowSqlProxy;
import com.relax.www.tx.entity.Book;
import com.relax.www.tx.service.BuyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcOperations;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;
import javax.validation.Validator;
import java.util.Set;

/** 
* @ClassName: BuyControllerTest 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author no_relax 
* @date 2016年4月11日 下午5:24:18 
*  
*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-tx.xml")
public class BuyControllerTest {
	
	@Autowired
	private BuyService buyService;
	
	@Autowired
	private Validator validator;
	
	@Test
	public void test1(){
		buyService.buyBook(3, 1);
	}
	
	@Test
	public void testSaveBook(){
		Book book=new Book();
		book.setBookPrice(100);
		book.setBookStock(10);
//		book.setBookName("norelax");
		validateWithException(validator, book);
		System.out.println(buyService.saveBook(10, null, 10));
	}
	
	/**
	 * 服务端参数有效性验证
	 * @param object 验证的实体对象
	 * @param groups 验证组
	 * @return 验证成功：返回true；严重失败：将错误信息添加到 flash message 中
	 */
	@SuppressWarnings("rawtypes") 
	public static void validateWithException(Validator validator, Object object, Class<?>... groups)
			throws ConstraintViolationException {
		Set<ConstraintViolation<Object>> constraintViolations = validator.validate(object, groups);
		if (!constraintViolations.isEmpty()) {
			StringBuffer sb=new StringBuffer();
			for (ConstraintViolation constraintViolation : constraintViolations) {
				sb.append(constraintViolation.getMessage());
			}
			throw new RuntimeException(sb.toString());
			//throw new ConstraintViolationException(constraintViolations);
		}
	}
	
	@Test
	@SuppressWarnings("all")
	public void test2(){
		JdbcOperations jdbcOperations=new JdbcTemplate();
		JdbcTemplateShowSqlProxy jdbcTemplateShowSqlProxy = new JdbcTemplateShowSqlProxy(jdbcOperations);
		jdbcOperations = jdbcTemplateShowSqlProxy.getSqlProxy();
		String sql=" select * from book where book_id=? ";
		RowMapper<Book> bookMapper=new BeanPropertyRowMapper(Book.class);
		jdbcOperations.queryForObject(sql, bookMapper,1);
	}

}

