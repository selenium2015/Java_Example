package com.java.diretory;

import java.io.File;

/*
 * �鿴ϵͳ��Ŀ¼ 
 * ʹ�� File ��� listRoots() ���������ϵͳ���и�Ŀ¼
 * 
 */
public class ListRoots {
	public static void main(String[] args) {
//		File file=new File();
		
		File[] roots=File.listRoots();
		
		System.out.println("ϵͳ���и�Ŀ¼��");
		for(File s:roots){
			System.out.println(s);
		}
	}

}
