package com.java.diretory;

import java.io.File;

/*
 * ���ָ��Ŀ¼�µ������ļ� 
 * ʹ�� File ��� list ���������ָ��Ŀ¼�µ������ļ�
 * 
 */
public class OutputAllFiles {
	public static void main(String[] args) {
		File file=new File("E:/selenium");
		String[] str=file.list();
		
		if(str==null){
			System.out.println("Ŀ¼�����ڻ�������һ��Ŀ¼");
		}else{
			for(String s: str){
				System.out.println(s);
			}
		}
	}

}
