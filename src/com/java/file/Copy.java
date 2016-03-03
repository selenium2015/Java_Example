package com.java.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * 将文件内容复制到另一个文件 
 * 使用 BufferedWriter 类的 read 和 write 方法将文件内容复制到另一个文件
 * （没有直接现成的方法进行复制）
 * 
 * 1.把源文件内容读取出来，保存
 * 2.把保存的内容写入目标文件
 * 3.读取目标文件内容
 */
public class Copy {
	
	public static void main(String[] args) {
		
		try {
			BufferedReader br=new BufferedReader(new FileReader("d:/test.txt"));		
			String str=br.readLine();
			br.close();
			
			BufferedWriter bw=new BufferedWriter(new FileWriter("d:/test2.txt"));
			bw.write(str);
			bw.close();
			
			BufferedReader br2=new BufferedReader(new FileReader("d:/test2.txt"));
			String str2;


			while((str2=br2.readLine())!=null){
				System.out.println(str2);
			}
			br2.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
