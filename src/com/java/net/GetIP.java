package com.java.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * ��ȡָ��������IP��ַ 
 * ʹ�� InetAddress ��� InetAddress.getByName() ��������ȡָ����������ַ����IP��ַ
 * 								   getHostAddress
 * 
 * 
 * ��ȡ����ip��ַ��������
 * ʹ�� InetAddress ��� getLocalAddress() ������ȡ����ip��ַ��������
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
			System.exit(2);//��0��ʾ���������˳�ϵͳ
		}
		
		System.out.println(ia.getHostName()+"="+ia.getHostAddress());	//ָ��������IP
		
		
		InetAddress ia2=InetAddress.getLocalHost();
		System.out.println(ia2.getHostName()+"="+ia2.getLocalHost());//����IP��������
		
		System.exit(0);
	}

}
