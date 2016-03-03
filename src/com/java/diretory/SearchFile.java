package com.java.diretory;

import java.io.File;
import java.io.FilenameFilter;

/*
 * ��ָ��Ŀ¼�в����ļ� 
 * �磺�� C ���в�������ĸ 'b' ��ͷ�������ļ�
 * 
 */
public class SearchFile {
	public static void main(String[] args) {
		File dir = new File("C:");
		//������
		FilenameFilter filter = new FilenameFilter() {
			public boolean accept(File dir, String name) {
				return name.startsWith("b");
			}
		};
		
		String[] children = dir.list(filter);
		if (children == null) {
			System.out.println("Ŀ¼�����ڻ�������һ��Ŀ¼");
		} else {
			for (int i = 0; i < children.length; i++) {
				String filename = children[i];
				System.out.println(filename);
			}
		}
	}
}
