package com.java.file;

import java.io.File;

/*
 * 删除文件 
 * 使用 delete() 方法将文件删除
 * 
 * 1. 创建File对象，并通过参数形式制定文件路径
 * 2. 调用file.delete()方法进行文件删除操作
 * 
 */
public class Delete {
	public static void main(String[] args) {
		
		try {
			File file =new File("d:/test.txt");
			
			if(file.delete()){
				System.out.println(file.getName()+" 文件删除成功！");
			}else{
				System.out.println(file.getName()+" 文件删除失败！");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
}
