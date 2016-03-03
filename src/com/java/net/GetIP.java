package com.java.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 获取指定主机的IP地址 
 * 使用 InetAddress 类的 InetAddress.getByName() 方法来获取指定主机（网址）的IP地址
 * 								   getHostAddress
 * 
 * 
 * 获取本机ip地址及主机名
 * 使用 InetAddress 类的 getLocalAddress() 方法获取本机ip地址及主机名
 * 
 * @author Administrator
 *
 */
public class GetIP {
	public static void main(String[] args) throws Exception {
		InetAddress ia=null;
		
		try {
			ia= InetAddress.getByName("www.baidu.com");
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.exit(2);//非0表示，非正常退出系统
		}
		
		System.out.println(ia.getHostName()+"="+ia.getHostAddress());	//指定主机的IP
		
		
		InetAddress ia2=InetAddress.getLocalHost();
		System.out.println(ia2.getHostName()+"="+ia2.getLocalHost());//本地IP及主机名
		
		System.exit(0);
	}

}
