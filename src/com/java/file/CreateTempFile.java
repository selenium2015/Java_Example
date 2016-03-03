package com.java.file;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 创建临时文件
 * 使用 File 类的 createTempFile() 方法来创建临时文件
 * 
 */
public class CreateTempFile {
	public static void main(String[] args) throws IOException {
		
		File temp =File.createTempFile("tmp", ".txt");//创建临时文件
		temp.deleteOnExit();
		
		//向临时文件写入内容
		BufferedWriter bw=new BufferedWriter(new FileWriter(temp));
		bw.write("aString");
		System.out.println("临时文件已创建!"+temp.getAbsolutePath());//临时文件的路径，使用了close之后就不会存在
//		bw.close();		
	}
}
