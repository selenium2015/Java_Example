package com.java.diretory;

import java.io.File;

/*
 * ����Ŀ¼��Ŀ¼�µ��ļ�
 * ʹ�� File ��� dir.isDirectory() �� dir.list() ����������Ŀ¼
 * 
 */

public class VisitAllDirsAndFiles {
	public static void main(String[] argv) throws Exception {
		System.out.println("����Ŀ¼");
		File dir = new File("E:/Appium"); // Ҫ������Ŀ¼
		visitAllDirsAndFiles(dir);
	}

	public static void visitAllDirsAndFiles(File dir) {
		System.out.println(dir);
		if (dir.isDirectory()) {
			String[] children = dir.list();
			for (int i = 0; i < children.length; i++) {
				visitAllDirsAndFiles(new File(dir, children[i]));//�ݹ����
			}
		}
	}

}
