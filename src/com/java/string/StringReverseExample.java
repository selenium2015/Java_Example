package com.java.string;

/*
 * 字符串反转 
 * 使用 Java 的反转函数 reverse() 将字符串反转
 * 
 */
public class StringReverseExample {
	
	public static void main(String[] args) {
		String str="hello World!";
		
		String reverse=new StringBuffer(str).reverse().toString();
		
		System.out.println("before reverse: "+str);		
		System.out.println("after reverse: "+reverse);

	}

}
