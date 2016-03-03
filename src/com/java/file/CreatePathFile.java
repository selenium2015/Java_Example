package com.java.file;

import java.io.File;
import java.io.IOException;

/*
 * 在指定目录中创建文件 
 * 使用 File 类的 file.createTempFile() 方法在指定目录中创建文件
 * 
 */
public class CreatePathFile {
	public static void main(String[] args) throws Exception {
		File file=null;
		File dir=new File("d:/");
		
		file=File.createTempFile("path", ".txt", dir);//dir 指定目录
		System.out.println(file.getPath());
	}

}
