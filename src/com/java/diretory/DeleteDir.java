package com.java.diretory;

import java.io.File;

/*
 * ɾ��Ŀ¼ 
 * ʹ�� File ��� ofdir.isDirectory(), dir.list() �� deleteDir() ������һ����ɾ���ļ���ɾ��Ŀ¼
 *  ���Զ��巽��ʵ�֣�
 * 
 * 1.�ж��Ƿ�ΪĿ¼
 * 2.ɾ����Ŀ¼��Ŀ¼�µ��ļ�
 * 3.ɾ����Ŀ¼
 * 
 */
public class DeleteDir {
	public static void main(String[] args) {
		deleteDir(new File("d://a"));		
	}
	
	public static boolean deleteDir(File dir) {
		if(dir.isDirectory()){//�ж��Ƿ�ΪĿ¼
			String[] str=dir.list();//��Ŀ¼�µ�Ŀ¼���ļ�ת�����ַ�������
			for(String s:str){
				boolean success=deleteDir(new File(dir,s));//����File����dir��·��Ϊs���ݹ����
				if(!success){
					return false;
				}
			}
		}
		return dir.delete();//ִ��ɾ������
	}
}
