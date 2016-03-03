package com.java.diretory;

import java.io.File;

/*
 * 递归创建目录 
 * 使用 File 类的 mkdirs() 实现递归创建目录
 * 
 */
public class Mkdirs {
	public static void main(String[] args) {
		String dirs="d://a//b//c";
		File file=new File(dirs);
		
		if(file.mkdirs()){
			System.out.println("已递归创建目录");
		}else{
			System.out.println("目录创建失败!");
		}
	}

}
