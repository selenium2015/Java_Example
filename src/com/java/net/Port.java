package com.java.net;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * �鿴�˿��Ƿ���ʹ��
 * Socket Skt=new Socket(host, i)
 * 
 * 
 * @author Administrator
 * 
 */
public class Port {
	public static void main(String[] args) {
		Socket Skt;
		String host = "localhost";
		if (args.length > 0) {
			host = args[0];
		}
		for (int i = 0; i < 1024; i++) {
			try {
				System.out.println("�鿴 " + i);
				Skt = new Socket(host, i);//Creates a stream socket and connects it to the specified port number on the named host. 

				System.out.println("�˿� " + i + " �ѱ�ʹ��");
			} catch (UnknownHostException e) {
				System.out.println("Exception occured" + e);
				break;
			} catch (IOException e) {
				
			}
		}
	}
}
