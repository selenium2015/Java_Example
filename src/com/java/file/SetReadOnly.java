package com.java.file;

import java.io.File;

/*
 * �����ļ�ֻ��
 * ʹ�� File ��� file.setReadOnly() �����������ļ�ֻ��
 * ʹ��File���file.canWrite()���ж��Ƿ���дȨ�� 
 * 
 */
public class SetReadOnly {
	public static void main(String[] args) {
		File file = new File("d:/test.txt");
		file.setReadOnly();//����Ϊֻ��
//		file.setWritable(true);//����Ϊ��д
		
		if(file.canWrite()){
			System.out.println(file.getName()+" �ļ��ǿ�д��");
		}else{
			System.out.println(file.getName()+" �ļ���ֻ����");
		}
	}

}
