/**
 * Project Name:spring_demo
 * File Name:HelloService.java
 * Package Name:com.relax.www.rmi
 * Date:2017年1月16日下午5:41:51
 * Copyright (c) 2017, chenzhou1025@126.com All Rights Reserved.
 *
*/
/**
 * 海风app在线学习平台
 * @author: no_relax
 * @Title: HelloService.java 
 * @Package: com.relax.www.rmi
 * @date: 2017年1月16日-下午5:41:51
 * @version: Vpad1.2.0
 * @copyright: 2017上海风创信息咨询有限公司-版权所有
 * 
 */

package com.relax.www.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * @ClassName: HelloService
 * @Description: TODO(这里用一句话描述这个类的作用)
 * @author no_relax
 * @date 2017年1月16日 下午5:41:51
 * 
 */
public interface HelloService extends Remote {
	String sayHello(String userName) throws RemoteException;

}
