/**
 * Project Name:spring_demo
 * File Name:MyChannelHandler.java
 * Package Name:com.relax.www.netty.own
 * Date:2017年1月23日下午2:21:43
 * Copyright (c) 2017, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * 海风app在线学习平台
 * @author: no_relax
 * @Title: MyChannelHandler.java 
 * @Package: com.relax.www.netty.own
 * @date: 2017年1月23日-下午2:21:43
 * @version: Vpad1.2.0
 * @copyright: 2017上海风创信息咨询有限公司-版权所有
 * 
 */

package com.relax.www.netty.own;

import org.jboss.netty.channel.Channel;
import org.jboss.netty.channel.ChannelHandlerContext;
import org.jboss.netty.channel.ChannelStateEvent;
import org.jboss.netty.channel.MessageEvent;
import org.jboss.netty.channel.SimpleChannelHandler;

import com.hfjy.base.core.Log;

/**
 * @ClassName: MyChannelHandler
 * @Description: TODO(通道处理器)
 * @author no_relax
 * @date 2017年1月23日 下午2:21:43
 * 
 */
public class MyChannelHandler extends SimpleChannelHandler {

	@Override
	public void channelClosed(ChannelHandlerContext ctx, ChannelStateEvent e) throws Exception {
		Log.info("Channel colsed " + e);
	}

	@Override
	public void channelConnected(ChannelHandlerContext ctx, ChannelStateEvent e) throws Exception {
		Log.info("Channel connected " + e);
	}

	@Override
	public void messageReceived(ChannelHandlerContext ctx, MessageEvent e) throws Exception {
		try {
			// 处理消息
			Channel channel = e.getChannel();
			channel.write(e.getMessage());
			Log.info("receive message " + e.getMessage());
		} catch (Exception ex) {
			ex.printStackTrace();
			throw ex;
		}
	}

}
