package com.java.file;

import java.io.File;

/*
 * �ļ�·���Ƚ� 
 * ʹ�� File ��� filename.compareTo (another filename) �������Ƚ������ļ�·���Ƿ���ͬһ��Ŀ¼��
 * 
 */
public class CompareTo {
	public static void main(String[] args) {
		File file = new File("d:/text.txt");
		File dir = new File("d:/text2.txt");

		if (file.compareTo(dir) == 0) {//0��ʾ·��һ�£�������ʾ��һ��
			System.out.println("�ļ�·��һ�£�");
		} else {
			System.out.println("�ļ�·����һ�£�");
		}
	}

}
