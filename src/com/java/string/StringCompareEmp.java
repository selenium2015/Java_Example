package com.java.string;


/*
 * 字符串比较
 * 通过字符串函数 compareTo (string) ，compareToIgnoreCase(String) 及 compareTo(object string) 来比较两个字符串，并返回字符串中第一个字母ASCII的差值。
 */

public class StringCompareEmp {
	public static void main(String[] args){
		
		String strOne="hello";
		String strTwo="Hello";
		
		Object objStr=strOne;		
				
		System.out.println(strOne.compareTo(strTwo));
		System.out.println(strOne.compareToIgnoreCase(strTwo));
		System.out.println(strOne.compareTo(objStr.toString()));
		
	}
	
	

}
