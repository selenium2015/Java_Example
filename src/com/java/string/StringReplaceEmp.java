package com.java.string;

/*
 * 字符串替换 
 * 使用 java String 类的 replace 方法来替换字符串中的字符
 * 
 */
public class StringReplaceEmp {
	public static void main(String[] args) {
		String str="hello World!";
		
		System.out.println(str.replace("World", "kugo"));//字符串
		System.out.println(str.replace('h', 'n'));//字符
		System.out.println(str.replaceAll("o", "x"));//正则匹配，替换全部
		System.out.println(str.replaceFirst("o", "x"));//正则匹配，替换第一个
	}

}
