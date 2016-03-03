package com.java.net;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 使用 Socket 连接到指定主机 
 * 使用 net.Socket 类的 getInetAddress() 方法来连接到指定主机
 * 
 * 
 * @author Administrator
 *
 */
public class WebPing {
	public static void main(String[] args) {
		try {
			Socket sc=new Socket("www.w3cschool.cc", 80);//Creates a stream socket and connects it to the specified port number on the named host. 

			InetAddress address=sc.getInetAddress();//Returns the address to which the socket is connected. 
			
			System.out.println("连接到： " + address);
			sc.close();//关闭连接
		} catch (IOException e) {
	         System.out.println("无法连接 " + args[0]);
	         e.printStackTrace();
		}
	}

}
