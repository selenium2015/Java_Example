package com.java.file;

import java.io.File;

/*
 * ��ȡ�ļ���С
 * ʹ�� File ���  file.length() ��������ȡ�ļ���С�����ֽڼ��㣨1KB=1024�ֽ� ��
 * 
 */
public class FileLength {
	public static void main(String[] args) {
		File file=new File("d:/build.xml");
		long len=file.length();
		
		System.out.println(len);
	}

}
