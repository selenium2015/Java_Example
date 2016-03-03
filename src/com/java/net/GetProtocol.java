package com.java.net;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * 解析 URL 
 * 使用 net.URL 类的 url.getProtocol() ,url.getFile() 等方法来解析 URL 地址
 * 
 * 
 * @author Administrator
 * 
 */
public class GetProtocol {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://192.168.3.10:9230/ysth-traffic-oms/main/show");
		
		System.out.println("URL 是 " + url.toString());
		System.out.println("协议是 " + url.getProtocol());
		System.out.println("文件名是 " + url.getFile());
		System.out.println("主机是 " + url.getHost());
		System.out.println("路径是 " + url.getPath());
		System.out.println("端口号是 " + url.getPort());
		System.out.println("默认端口号是 " + url.getDefaultPort());
	}

}
