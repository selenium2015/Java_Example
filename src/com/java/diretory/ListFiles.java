package com.java.diretory;

import java.io.File;
import java.io.FileFilter;

/*
 * ����ָ��Ŀ¼�µ�����Ŀ¼ 
 * ʹ�� File ��� list ����������ָ��Ŀ¼�µ�����Ŀ¼
 * 
 */
public class ListFiles {
	public static void main(String[] args) {
		File dir = new File("E:");

		//������
		FileFilter fileFilter = new FileFilter() {
			public boolean accept(File file) {
				return file.isDirectory();
			}
		};
		
		File[] files = dir.listFiles(fileFilter);		
		System.out.println(files.length);
		
		if (files.length == 0) {
			System.out.println("Ŀ¼�����ڻ�������һ��Ŀ¼");
		} else {
			for (int i = 0; i < files.length; i++) {
				File filename = files[i];
				System.out.println(filename.toString());
			}
		}
	}

}
