package com.java.diretory;

import java.io.File;

/*
 * 查看系统根目录 
 * 使用 File 类的 listRoots() 方法来输出系统所有根目录
 * 
 */
public class ListRoots {
	public static void main(String[] args) {
//		File file=new File();
		
		File[] roots=File.listRoots();
		
		System.out.println("系统所有根目录：");
		for(File s:roots){
			System.out.println(s);
		}
	}

}
