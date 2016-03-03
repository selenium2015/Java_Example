package com.java.diretory;

import java.io.File;

/*
 * �ж�Ŀ¼�Ƿ�Ϊ��
 * ʹ�� File ��� file.isDirectory(),file.list() �� file.getPath() �������ж�Ŀ¼�Ƿ�Ϊ��
 * ��ͨ������Ŀ¼���ļ�ת�����ַ������飬Ȼ������ĳ������ж��Ƿ�Ϊ�գ�
 * 
 * �ж��ļ��Ƿ����� 
 * ʹ�� File ��� file.isHidden() �������ж��ļ��Ƿ�����
 * 
 */
public class IsEmptyDir {
	public static void main(String[] args) {
		File file=new File("d://a");
		
		if(file.isDirectory()){
			String[] str=file.list();
			if(str.length>0){
				System.out.println("Ŀ¼ "+file.getPath()+" ��Ϊ�գ�");
			}
		}else{
			System.out.println(file.getPath()+" ����Ŀ¼��");
		}
		
		if(file.isHidden()){
			System.out.println("Ŀ¼"+file.getPath()+" �����ص�!");
		}else{
			System.out.println("Ŀ¼"+file.getPath()+" �������ص�!");
		}
		
	}

}
