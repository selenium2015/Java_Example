package com.java.diretory;

import java.io.File;
import java.io.IOException;

/*
 * ��ӡĿ¼�ṹ 
 * ʹ�� File ��� file.getName() �� file.listFiles() ��������ӡĿ¼�ṹ
 * ��ͨ���Զ��巽��ʵ�֣�
 * 
 */
public class ShowDirTest {
	public static void main(String[] a) throws IOException {
		showDir(1, new File("d://a"));
	}

	static void showDir(int indent, File file) throws IOException {
		for (int i = 0; i < indent; i++){
			System.out.print('-');
		}
		System.out.println(file.getName());
		if (file.isDirectory()) {
			File[] files = file.listFiles();
			for (int i = 0; i < files.length; i++){
				showDir(indent + 4, files[i]);//�ݹ����
			}
		}
	}

}
