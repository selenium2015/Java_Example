package com.java.file;

import java.io.File;

/*
 * �ļ������� 
 * ʹ�� File ��� oldName.renameTo(newName) �������������ļ�
 * 
 */
public class Rename {
	public static void main(String[] args) {
		File file=new File("d:/text.txt");		
		File dir=new File("d:/text3.txt");		
		
		if(file.renameTo(dir)){//�����������������������ɹ�����true�����򷵻�false
			System.out.println(file.getName()+" ��������!");
		}else{
			System.out.println(file.getName()+" û��������!");
		}
		
	}

}
