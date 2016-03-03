package com.java.file;

import java.io.File;

/*
 * 文件重命名 
 * 使用 File 类的 oldName.renameTo(newName) 方法来重命名文件
 * 
 */
public class Rename {
	public static void main(String[] args) {
		File file=new File("d:/text.txt");		
		File dir=new File("d:/text3.txt");		
		
		if(file.renameTo(dir)){//进行重命名操作，重命名成功返回true，否则返回false
			System.out.println(file.getName()+" 已重命名!");
		}else{
			System.out.println(file.getName()+" 没有重命名!");
		}
		
	}

}
