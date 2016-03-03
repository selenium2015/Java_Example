package com.java.file;

import java.io.File;

/*
 * 文件路径比较 
 * 使用 File 类的 filename.compareTo (another filename) 方法来比较两个文件路径是否在同一个目录下
 * 
 */
public class CompareTo {
	public static void main(String[] args) {
		File file = new File("d:/text.txt");
		File dir = new File("d:/text2.txt");

		if (file.compareTo(dir) == 0) {//0表示路径一致，其它表示不一致
			System.out.println("文件路径一致！");
		} else {
			System.out.println("文件路径不一致！");
		}
	}

}
