package com.java.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * ���ļ����ݸ��Ƶ���һ���ļ�
 * ʹ�� BufferedWriter ��� read �� write �������ļ����ݸ��Ƶ���һ���ļ�
 * 
 * ��һ����Stream�������Ϊһ�����ݵ����С���������ʾ��һ��Դ��ȡ���ݣ��������ʾ��һ��Ŀ��д���ݡ� ��
 */
public class Copy2 {
	public static void main(String[] args) throws Exception {
		
		//����д��Դ�ļ�����
//		BufferedWriter out1 = new BufferedWriter(new FileWriter("d:/test.txt"));
//		out1.write("string to be copied\n");
//		out1.close();
		
		InputStream in = new FileInputStream(new File("d:/test.txt"));
		OutputStream out = new FileOutputStream(new File("d:/test2.txt"));
		
		byte[] buf = new byte[1024];
		int len;
		while ((len = in.read(buf)) > 0) {//�ж�Դ�ļ����ݳ���
			out.write(buf, 0, len);//��Դ�ļ����ݵĴ�0��len�������У�д�뵽Ŀ���ļ�
		}
		in.close();
		out.close();
		
		//��ȡ�������ݺ��Ŀ���ļ�����
		BufferedReader in1 = new BufferedReader(new FileReader("d:/test2.txt"));
		String str;
		while ((str = in1.readLine()) != null) {
			System.out.println(str);
		}
		in.close();
	}

}
