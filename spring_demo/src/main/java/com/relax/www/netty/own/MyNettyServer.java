/**
 * Project Name:spring_demo
 * File Name:MyNettyServer.java
 * Package Name:com.relax.www.netty.own
 * Date:2017年1月23日下午2:21:00
 * Copyright (c) 2017, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * 海风app在线学习平台
 * @author: no_relax
 * @Title: MyNettyServer.java 
 * @Package: com.relax.www.netty.own
 * @date: 2017年1月23日-下午2:21:00
 * @version: Vpad1.2.0
 * @copyright: 2017上海风创信息咨询有限公司-版权所有
 * 
 */

package com.relax.www.netty.own;

import java.net.InetSocketAddress;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;

import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.channel.ChannelFactory;
import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory;

/**
 * @ClassName: MyNettyServer
 * @Description: TODO(netty服务类)
 * @author no_relax
 * @date 2017年1月23日 下午2:21:00
 * 
 */
public class MyNettyServer {
	private static final int port = 8080;
	ServerBootstrap bootstrap;

	public MyNettyServer() {
		ChannelFactory channelFactory = new NioServerSocketChannelFactory(Executors.newCachedThreadPool(), Executors.newCachedThreadPool());
		bootstrap = new ServerBootstrap(channelFactory);

		Map<String, Object> options = new HashMap<>();
		options.put("reuseAddress", true);
		options.put("child.tcpNoDelay", true);
		options.put("child.soLinger", 2);
		bootstrap.setOptions(options);
		ChannelPipeline pipeline = bootstrap.getPipeline();
		pipeline.addLast("servercnfactory", new MyChannelHandler());

	}

	void start() {
		InetSocketAddress address = new InetSocketAddress(port);
		bootstrap.bind(address);
	}

	public static void main(String[] args) {
		MyNettyServer server = new MyNettyServer();
		server.start();
	}

}
