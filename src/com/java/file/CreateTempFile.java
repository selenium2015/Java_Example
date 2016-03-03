package com.java.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ������ʱ�ļ�
 * ʹ�� File ��� createTempFile() ������������ʱ�ļ�
 * 
 */
public class CreateTempFile {
	public static void main(String[] args) throws IOException {
		
		File temp =File.createTempFile("tmp", ".txt");//������ʱ�ļ�
		temp.deleteOnExit();
		
		//����ʱ�ļ�д������
		BufferedWriter bw=new BufferedWriter(new FileWriter(temp));
		bw.write("aString");
		System.out.println("��ʱ�ļ��Ѵ���!"+temp.getAbsolutePath());//��ʱ�ļ���·����ʹ����close֮��Ͳ������
//		bw.close();		
	}
}
