package com.java.diretory;

import java.io.File;
import java.util.Date;

/*
 *��ָ��Ŀ¼�в����ļ� 
 *ʹ�� File ��� dir.list() ������ָ��Ŀ¼�в��������ļ��б� 
 * 
 * 	1.ת�����ַ�������
 * 	2.�ж��Ƿ����
 * 	3.��foreachѭ����ӡĿ¼�µ��ļ���Ŀ¼
 * 
 * ��ȡ�ļ����ϼ�Ŀ¼ 
 * ʹ�� File ��� file.getParent() ��������ȡ�ļ����ϼ�Ŀ¼
 * 
 * ��ȡĿ¼����޸�ʱ�� 
 * ʹ�� File ��� file.lastModified() ��������ȡĿ¼������޸�ʱ��
 * 
 */

public class SearchDir {
	public static void main(String[] args) {
		File file =new File("D:/a");
		
		String[] str=file.list();
		if(str==null){
			System.out.println("Ŀ¼�����ڣ�");
		}else{
			for(String s : str){
				System.out.println(s);
			}
		}
		
		
		System.out.println(file.getParent());//��ȡ�ϼ�Ŀ¼
		System.out.println(new Date(file.lastModified()));//��ȡĿ¼����޸�����
	}

}
