package com.java.string;

/*
 * �ַ�����ת 
 * ʹ�� Java �ķ�ת���� reverse() ���ַ�����ת
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
