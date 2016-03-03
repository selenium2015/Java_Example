package com.java.string;

/*
 * 字符串搜索
 * 使用了 String 类的 indexOf() 方法在字符串中查找子字符串出现的位置
 * 如果存在返回字符串出现的位置（第一位为0），如果不存在返回 -1：
 * 
 */

public class SearchStringEmp {
	public static void main(String[] args) {
		String str="hello World!";
		String subStr="ll";
		
		int pos=str.indexOf(subStr);
		if(pos==-1){
			System.out.println(subStr+"not found!");
		}else{
			System.out.println("子字符串出现的位置为："+pos);
		}
		
	}

}
