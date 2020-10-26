/**
 * Project Name:spring_demo
 * File Name:Book.java
 * Package Name:com.relax.www.tx.entity
 * Date:2016年4月11日下午4:26:02
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * 海风app在线学习平台
 * @author: no_relax
 * @Title: Book.java 
 * @Package: com.relax.www.tx.entity
 * @date: 2016年4月11日-下午4:26:02
 * @version: Vphone1.3.0
 * @copyright: 2016上海风创信息咨询有限公司-版权所有
 * 
 */

package com.relax.www.tx.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


/** 
* @ClassName: Book 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author no_relax 
* @date 2016年4月11日 下午4:26:02 
*  
*/

public class Book {
	
	private Integer bookId;
	private Integer bookStock;
	private String bookName;
	private Integer bookPrice;
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public Integer getBookStock() {
		return bookStock;
	}
	public void setBookStock(Integer bookStock) {
		this.bookStock = bookStock;
	}
	@NotNull(message="书籍的姓名不能为空！")
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Integer getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(Integer bookPrice) {
		this.bookPrice = bookPrice;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookStock=" + bookStock + ", bookName=" + bookName + ", bookPrice=" + bookPrice + "]";
	}
	
	

}

