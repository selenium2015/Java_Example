package com.java.file;

import java.io.File;
import java.io.IOException;

/*
 * ��ָ��Ŀ¼�д����ļ� 
 * ʹ�� File ��� file.createTempFile() ������ָ��Ŀ¼�д����ļ�
 * 
 */
public class CreatePathFile {
	public static void main(String[] args) throws Exception {
		File file=null;
		File dir=new File("d:/");
		
		file=File.createTempFile("path", ".txt", dir);//dir ָ��Ŀ¼
		System.out.println(file.getPath());
	}

}
