package com.relax.www.nio;

import java.io.File;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * @ClassName: ChannelDemo
 * @Description: TODO(java NIO通道测试demo)
 * @author no_relax
 * @date 2016年11月8日 下午4:56:37
 * 
 */
public class ChannelDemo {
	/*
	 * 在前面已经提到，Channel和传统IO中的Stream很相似。虽然很相似，但是有很大的区别，主要区别为：通道是双向的，
	 * 通过一个Channel既可以进行读，也可以进行写；而Stream只能进行单向操作，通过一个Stream只能进行读或者写； 以下是常用的几种通道：
	 * FileChannel SocketChanel ServerSocketChannel DatagramChannel
	 * 通过使用FileChannel可以从文件读或者向文件写入数据； 通过SocketChannel，以TCP来向网络连接的两端读写数据；
	 * 通过ServerSocketChanel能够监听客户端发起的TCP连接，并为每个TCP连接创建一个新的SocketChannel来进行数据读写；
	 * 通过DatagramChannel，以UDP协议来向网络连接的两端读写数据。 下面给出通过FileChannel来向文件中写入数据的一个例子：
	 */
	public static void main(String[] args) throws Exception {
		File file = new File("C:/Users/wusong/Desktop/test.txt");
		FileOutputStream outputStream = new FileOutputStream(file);
		FileChannel channel = outputStream.getChannel();
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		String string = "java nio";
		buffer.put(string.getBytes());
		buffer.flip(); // 此处必须要调用buffer的flip方法
		channel.write(buffer);
		channel.close();
		outputStream.close();
	}

}
