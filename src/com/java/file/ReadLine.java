package com.java.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/*
 * 读取文件内容 
 * 使用 readLine() 方法来读取文件 内容
 * 
 *  1.创建FileReader对象
 * 	2.创建BufferedReader对象，并把FileReader对象传参给它（文件地址）
 * 	3、调用BufferedReader对象的readLine()方法，进行读取操作
 * 	4、关闭BufferedReader对象
 * 
 */
public class ReadLine {
	
	public static void main(String[] args) {

		try {
			BufferedReader  br =new BufferedReader(new FileReader("d:/test.txt"));		
			String str;
			while((str=br.readLine())!=null){
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
