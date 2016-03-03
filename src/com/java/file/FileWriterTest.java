package com.java.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 文件写入 
 * 使用 BufferedWriter类对象的write() 方法向文件写入内容
 * 
 * 	1.创建FileWriter对象
 * 	2.创建BufferedWriter对象，并把FileWriter对象传参给它（文件地址）
 * 	3、调用BufferedWriter对象的write()方法，进行写入操作
 * 	4、关闭BufferedWriter对象
 */
public class FileWriterTest {
	
	public static void main(String[] args) {
		
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter("d:/test2.txt"));
			out.write("nihao world!");
			out.close();
			System.out.println("文件写入成功!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
