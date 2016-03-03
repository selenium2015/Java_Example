package com.java.diretory;

import java.io.File;

/*
 * 判断目录是否为空
 * 使用 File 类的 file.isDirectory(),file.list() 和 file.getPath() 方法来判断目录是否为空
 * （通过把子目录和文件转换成字符串数组，然后数组的长度来判断是否为空）
 * 
 * 判断文件是否隐藏 
 * 使用 File 类的 file.isHidden() 方法来判断文件是否隐藏
 * 
 */
public class IsEmptyDir {
	public static void main(String[] args) {
		File file=new File("d://a");
		
		if(file.isDirectory()){
			String[] str=file.list();
			if(str.length>0){
				System.out.println("目录 "+file.getPath()+" 不为空！");
			}
		}else{
			System.out.println(file.getPath()+" 不是目录！");
		}
		
		if(file.isHidden()){
			System.out.println("目录"+file.getPath()+" 是隐藏的!");
		}else{
			System.out.println("目录"+file.getPath()+" 不是隐藏的!");
		}
		
	}

}
