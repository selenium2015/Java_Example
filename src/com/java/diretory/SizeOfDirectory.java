package com.java.diretory;

import java.io.File;
import org.apache.commons.io.FileUtils;

/*
 * 获取目录大小 
 * 使用 File 类的 FileUtils.sizeofDirectory(File Name) 来获取目录的大小
 * 
 */
public class SizeOfDirectory {
	public static void main(String[] args) {
		File file=new File("d://a");
		
		long size=FileUtils.sizeOfDirectory(file);
		
		System.out.println("目录"+file.getPath()+" 大小为："+size);
	}

}
