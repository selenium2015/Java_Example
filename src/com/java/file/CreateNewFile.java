package com.java.file;

import java.io.File;
import java.io.IOException;

/*
 * 创建文件 
 * 使用 File 类的 File() 构造函数和 file.createNewFile() 方法来创建一个新的文件 
 * file.createNewFile() 方法返回Boolean类型值，而且需抛出IO异常
 * 
 */
public class CreateNewFile {
	public static void main(String[] args) {
		File file=new File("d:/test2.txt");//要用斜杠“/”
		
		try {
			if(file.createNewFile()){
				System.out.println(file+"文件创建成功");
			}else{
				System.out.println(file+"文件已存在！");
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
