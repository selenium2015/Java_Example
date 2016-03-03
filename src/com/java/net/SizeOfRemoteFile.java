package com.java.net;

import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

/**
 * ��ȡԶ���ļ���С 
 * url.openConnection()��URLConnection���getContentLength()����
 * 
 * �鿴����ָ���ļ�������޸�ʱ�� 
 * URLConnection���getLastModified()����
 * 
 * @author Administrator
 *
 */
public class SizeOfRemoteFile {
	public static void main(String[] args) throws Exception {
		int size;
		//����URL���󣬲�ʵ����
		URL url=new URL("http://192.168.3.10:9230/ysth-traffic-oms/widget/image/ysth.png");
		
		//��������
		URLConnection  conn =url.openConnection();
		//��ȡ�ļ�����
		size=conn.getContentLength();
		
//		conn.setUseCaches(false);//�������Ƿ�������
		long time=conn.getLastModified();//�鿴����ָ���ļ�������޸�ʱ�� 
		
		if(size<0){
			System.out.println("�ļ�������");
		}else{
			System.out.println("Զ���ļ���СΪ��"+size+ " bytes");
		}
		
		System.out.println("���ļ�������޸�ʱ��Ϊ��"+new Date(time));
		
		//�ر����ӣ��ͷ���Դ
		conn.getInputStream().close();
	}
}
