package com.java.diretory;

/*
 * 	查看当前工作目录 
 * 	使用 System 的 getProperty() 方法来获取当前的工作目录
 * 
 */
public class GetCurrentDir {
	public static void main(String[] args) {
		String str = System.getProperty("user.dir");//user.dir表示用户当前目录
		System.out.println("你当前的工作目录为 :" + str);
	}

}
