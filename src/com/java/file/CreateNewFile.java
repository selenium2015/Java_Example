package com.java.file;

import java.io.File;
import java.io.IOException;

/*
 * �����ļ� 
 * ʹ�� File ��� File() ���캯���� file.createNewFile() ����������һ���µ��ļ� 
 * file.createNewFile() ��������Boolean����ֵ���������׳�IO�쳣
 * 
 */
public class CreateNewFile {
	public static void main(String[] args) {
		File file=new File("d:/test2.txt");//Ҫ��б�ܡ�/��
		
		try {
			if(file.createNewFile()){
				System.out.println(file+"�ļ������ɹ�");
			}else{
				System.out.println(file+"�ļ��Ѵ��ڣ�");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
