package com.java.file;

import java.io.File;

/*
 * 获取文件大小
 * 使用 File 类的  file.length() 方法来获取文件大小，以字节计算（1KB=1024字节 ）
 * 
 */
public class FileLength {
	public static void main(String[] args) {
		File file=new File("d:/build.xml");
		long len=file.length();
		
		System.out.println(len);
	}

}
