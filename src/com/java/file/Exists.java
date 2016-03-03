package com.java.file;

import java.io.File;

/*
 * 检测文件是否存在 
 * 使用 File 类的 file.exists() 方法来检测文件是否存在
 * 
 * 
 */
public class Exists {
	public static void main(String[] args) {
		File file = new File("d:/test.txt");
		
		if(file.exists()){
			System.out.println(file.getName()+" 存在！");
		}else{
			System.out.println(file.getAbsolutePath()+" 不存在！");
		}
		
	}

}
