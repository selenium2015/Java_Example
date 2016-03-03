package com.java.net;

import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

/**
 * 获取远程文件大小 
 * url.openConnection()、URLConnection类的getContentLength()方法
 * 
 * 查看主机指定文件的最后修改时间 
 * URLConnection类的getLastModified()方法
 * 
 * @author Administrator
 *
 */
public class SizeOfRemoteFile {
	public static void main(String[] args) throws Exception {
		int size;
		//生成URL对象，并实例化
		URL url=new URL("http://192.168.3.10:9230/ysth-traffic-oms/widget/image/ysth.png");
		
		//建立连接
		URLConnection  conn =url.openConnection();
		//获取文件长度
		size=conn.getContentLength();
		
//		conn.setUseCaches(false);//该连接是否允许缓存
		long time=conn.getLastModified();//查看主机指定文件的最后修改时间 
		
		if(size<0){
			System.out.println("文件不存在");
		}else{
			System.out.println("远程文件大小为："+size+ " bytes");
		}
		
		System.out.println("该文件的最后修改时间为："+new Date(time));
		
		//关闭连接，释放资源
		conn.getInputStream().close();
	}
}
