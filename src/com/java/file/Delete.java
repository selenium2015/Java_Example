package com.java.file;

import java.io.File;

/*
 * ɾ���ļ� 
 * ʹ�� delete() �������ļ�ɾ��
 * 
 * 1. ����File���󣬲�ͨ��������ʽ�ƶ��ļ�·��
 * 2. ����file.delete()���������ļ�ɾ������
 * 
 */
public class Delete {
	public static void main(String[] args) {
		
		try {
			File file =new File("d:/test.txt");
			
			if(file.delete()){
				System.out.println(file.getName()+" �ļ�ɾ���ɹ���");
			}else{
				System.out.println(file.getName()+" �ļ�ɾ��ʧ�ܣ�");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
