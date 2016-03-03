package com.java.string;


/*
 * 查找字符串最后一次出现的位置
 * 通过字符串函数 strOrig.lastIndexOf(Stringname) 来查找子字符串 Stringname 在 strOrig 出现的位置
 * 
 */

public class SearchlastString {
	
	public static void main(String[] args){
		
		String str="hello World!hello Kugo!";
		String subStr="hello";
		int lastIndex=str.lastIndexOf(subStr);
		
		if(lastIndex==-1){
			System.out.println(subStr+" not found !");
		}else{
			System.out.println(str.lastIndexOf(subStr));
		}
		
		System.out.println(str.lastIndexOf('W'));

	}

}
