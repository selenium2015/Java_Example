package com.java.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.OutputStream;

/*
 * 将文件内容复制到另一个文件
 * 使用 BufferedWriter 类的 read 和 write 方法将文件内容复制到另一个文件
 * 
 * （一个流Stream可以理解为一个数据的序列。输入流表示从一个源读取数据，输出流表示向一个目标写数据。 ）
 */
public class Copy2 {
	public static void main(String[] args) throws Exception {
		
		//可先写入源文件内容
//		BufferedWriter out1 = new BufferedWriter(new FileWriter("d:/test.txt"));
//		out1.write("string to be copied\n");
//		out1.close();
		
		InputStream in = new FileInputStream(new File("d:/test.txt"));
		OutputStream out = new FileOutputStream(new File("d:/test2.txt"));
		
		byte[] buf = new byte[1024];
		int len;
		while ((len = in.read(buf)) > 0) {//判断源文件内容长度
			out.write(buf, 0, len);//将源文件内容的从0到len（即所有）写入到目标文件
		}
		in.close();
		out.close();
		
		//读取复制内容后的目标文件内容
		BufferedReader in1 = new BufferedReader(new FileReader("d:/test2.txt"));
		String str;
		while ((str = in1.readLine()) != null) {
			System.out.println(str);
		}
		in.close();
	}

}
