package com.java.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 向文件中追加数据 
 * 使用 filewriter 方法向文件中追加数据
 * （new FileWriter("d:/test2.txt",true)）
 * 
 * 1.追加数据
 * 2.读取文件内容
 * 
 */
public class Append {
	
	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw=new BufferedWriter(new FileWriter("d:/test2.txt",true));
		
		bw.write("aString2");
		bw.close();
		
		BufferedReader br=new BufferedReader(new FileReader("d:/test2.txt"));
		String str;
		while((str=br.readLine())!=null){
			System.out.println(str);
		}
		br.close();
	}

}
