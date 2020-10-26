/**
 * Project Name:spring_demo
 * File Name:BuyService.java
 * Package Name:com.relax.www.tx.service
 * Date:2016年4月11日下午5:17:31
 * Copyright (c) 2016, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * 海风app在线学习平台
 * @author: no_relax
 * @Title: BuyService.java 
 * @Package: com.relax.www.tx.service
 * @date: 2016年4月11日-下午5:17:31
 * @version: Vphone1.3.0
 * @copyright: 2016上海风创信息咨询有限公司-版权所有
 * 
 */

package com.relax.www.tx.service;
/** 
* @ClassName: BuyService 
* @Description: TODO(这里用一句话描述这个类的作用) 
* @author no_relax 
* @date 2016年4月11日 下午5:17:31 
*  
*/
public interface BuyService {
	
	//用户购买书籍
	//先扣除用户余额
	//减少此书库存
	public void buyBook(Integer userId,Integer bookId);
	
	//添加书籍
	public int saveBook(Integer bookStock,String bookName,Integer bookPrice);

}

