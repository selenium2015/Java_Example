package com.java.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * �ļ�д�� 
 * ʹ�� BufferedWriter������write() �������ļ�д������
 * 
 * 	1.����FileWriter����
 * 	2.����BufferedWriter���󣬲���FileWriter���󴫲θ������ļ���ַ��
 * 	3������BufferedWriter�����write()����������д�����
 * 	4���ر�BufferedWriter����
 */
public class FileWriterTest {
	
	public static void main(String[] args) {
		
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("d:/test2.txt"));
			out.write("nihao world!");
			out.close();
			System.out.println("�ļ�д��ɹ�!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
