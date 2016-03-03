package com.java.diretory;

import java.io.File;
import java.util.Date;

/*
 *在指定目录中查找文件 
 *使用 File 类的 dir.list() 方法在指定目录中查找所有文件列表 
 * 
 * 	1.转换成字符串数组
 * 	2.判断是否存在
 * 	3.用foreach循环打印目录下的文件及目录
 * 
 * 获取文件的上级目录 
 * 使用 File 类的 file.getParent() 方法来获取文件的上级目录
 * 
 * 获取目录最后修改时间 
 * 使用 File 类的 file.lastModified() 方法来获取目录的最后修改时间
 * 
 */

public class SearchDir {
	public static void main(String[] args) {
		File file =new File("D:/a");
		
		String[] str=file.list();
		if(str==null){
			System.out.println("目录不存在！");
		}else{
			for(String s : str){
				System.out.println(s);
			}
		}
		
		
		System.out.println(file.getParent());//获取上级目录
		System.out.println(new Date(file.lastModified()));//获取目录最后修改日期
	}

}
