package com.java.net;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * ʹ�� Socket ���ӵ�ָ������ 
 * ʹ�� net.Socket ��� getInetAddress() ���������ӵ�ָ������
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
			
			System.out.println("���ӵ��� " + address);
			sc.close();//�ر�����
		} catch (IOException e) {
	         System.out.println("�޷����� " + args[0]);
	         e.printStackTrace();
		}
	}

}
