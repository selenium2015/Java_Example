package com.java.file;

import java.io.File;

/*
 * 设置文件只读
 * 使用 File 类的 file.setReadOnly() 方法来设置文件只读
 * 使用File类的file.canWrite()来判断是否有写权限 
 * 
 */
public class SetReadOnly {
	public static void main(String[] args) {
		File file = new File("d:/test.txt");
		file.setReadOnly();//设置为只读
//		file.setWritable(true);//设置为可写
		
		if(file.canWrite()){
			System.out.println(file.getName()+" 文件是可写的");
		}else{
			System.out.println(file.getName()+" 文件是只读的");
		}
	}

}
