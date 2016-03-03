package com.java.string;

/*
 *  删除字符串中的一个字符
 *  通过字符串函数 substring() 函数来删除字符串中的一个字符
 *  需自定义方法来实现该功能，此处将功能封装在 removeCharAt 函数中。
 * 
 */

public class DeleteOneCharacter {
	public static void main(String[] args) {
		String str ="hellol World!";
		
		//传参，指定需要删除字符的位置
		System.out.println(removeCharAt(5,str));
	}
	
	//自定义方法实现删除字符串中的一个字符功能
	//1.分割原字符串为两个字符串；2.拼接两个字符串，并返回。
	public static String removeCharAt(int pos,String s){
		return (s.substring(0, pos)+s.substring(pos+1));
	}

}
