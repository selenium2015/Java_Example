package com.java.net;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * ���� URL 
 * ʹ�� net.URL ��� url.getProtocol() ,url.getFile() �ȷ��������� URL ��ַ
 * 
 * 
 * @author Administrator
 * 
 */
public class GetProtocol {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://192.168.3.10:9230/ysth-traffic-oms/main/show");
		
		System.out.println("URL �� " + url.toString());
		System.out.println("Э���� " + url.getProtocol());
		System.out.println("�ļ����� " + url.getFile());
		System.out.println("������ " + url.getHost());
		System.out.println("·���� " + url.getPath());
		System.out.println("�˿ں��� " + url.getPort());
		System.out.println("Ĭ�϶˿ں��� " + url.getDefaultPort());
	}

}
