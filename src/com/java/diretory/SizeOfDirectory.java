package com.java.diretory;

import java.io.File;
import org.apache.commons.io.FileUtils;

/*
 * ��ȡĿ¼��С 
 * ʹ�� File ��� FileUtils.sizeofDirectory(File Name) ����ȡĿ¼�Ĵ�С
 * 
 */
public class SizeOfDirectory {
	public static void main(String[] args) {
		File file=new File("d://a");
		
		long size=FileUtils.sizeOfDirectory(file);
		
		System.out.println("Ŀ¼"+file.getPath()+" ��СΪ��"+size);
	}

}
