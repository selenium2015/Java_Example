package com.java.diretory;

import java.io.File;

/*
 * 输出指定目录下的所有文件 
 * 使用 File 类的 list 方法来输出指定目录下的所有文件
 * 
 */
public class OutputAllFiles {
	public static void main(String[] args) {
		File file=new File("E:/selenium");
		String[] str=file.list();
		
		if(str==null){
			System.out.println("目录不存在或它不是一个目录");
		}else{
			for(String s: str){
				System.out.println(s);
			}
		}
	}

}
