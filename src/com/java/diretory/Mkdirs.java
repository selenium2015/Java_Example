package com.java.diretory;

import java.io.File;

/*
 * �ݹ鴴��Ŀ¼ 
 * ʹ�� File ��� mkdirs() ʵ�ֵݹ鴴��Ŀ¼
 * 
 */
public class Mkdirs {
	public static void main(String[] args) {
		String dirs="d://a//b//c";
		File file=new File(dirs);
		
		if(file.mkdirs()){
			System.out.println("�ѵݹ鴴��Ŀ¼");
		}else{
			System.out.println("Ŀ¼����ʧ��!");
		}
	}

}
