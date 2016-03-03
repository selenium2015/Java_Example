package com.java.diretory;

import java.io.File;

/*
 * 遍历目录和目录下的文件
 * 使用 File 类的 dir.isDirectory() 和 dir.list() 方法来遍历目录
 * 
 */

public class VisitAllDirsAndFiles {
	public static void main(String[] argv) throws Exception {
		System.out.println("遍历目录");
		File dir = new File("E:/Appium"); // 要遍历的目录
		visitAllDirsAndFiles(dir);
	}

	public static void visitAllDirsAndFiles(File dir) {
		System.out.println(dir);
		if (dir.isDirectory()) {
			String[] children = dir.list();
			for (int i = 0; i < children.length; i++) {
				visitAllDirsAndFiles(new File(dir, children[i]));//递归调用
			}
		}
	}

}
