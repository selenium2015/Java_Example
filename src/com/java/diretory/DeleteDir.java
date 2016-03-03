package com.java.diretory;

import java.io.File;

/*
 * 删除目录 
 * 使用 File 类的 ofdir.isDirectory(), dir.list() 和 deleteDir() 方法在一个个删除文件后删除目录
 *  （自定义方法实现）
 * 
 * 1.判断是否为目录
 * 2.删除子目录及目录下的文件
 * 3.删掉父目录
 * 
 */
public class DeleteDir {
	public static void main(String[] args) {
		deleteDir(new File("d://a"));		
	}
	
	public static boolean deleteDir(File dir) {
		if(dir.isDirectory()){//判断是否为目录
			String[] str=dir.list();//把目录下的目录及文件转换成字符串数组
			for(String s:str){
				boolean success=deleteDir(new File(dir,s));//创建File对象dir，路径为s；递归调用
				if(!success){
					return false;
				}
			}
		}
		return dir.delete();//执行删除操作
	}
}
