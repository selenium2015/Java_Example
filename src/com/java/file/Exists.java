package com.java.file;

import java.io.File;

/*
 * ����ļ��Ƿ���� 
 * ʹ�� File ��� file.exists() ����������ļ��Ƿ����
 * 
 * 
 */
public class Exists {
	public static void main(String[] args) {
		File file = new File("d:/test.txt");
		
		if(file.exists()){
			System.out.println(file.getName()+" ���ڣ�");
		}else{
			System.out.println(file.getAbsolutePath()+" �����ڣ�");
		}
		
	}

}
