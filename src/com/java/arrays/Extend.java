package com.java.arrays;

/*
 * 数组扩容
 * 在数组初始化后对数组进行扩容（利用arraycopy方法）
 * （先赋值，再复制）
 */
public class Extend {
	public static void main(String[] args) {
		String[] names=new String[]{"A","B","C"};
		String[] extended=new String[names.length+2];
		extended[3]="D";
		extended[4]="E";
		
		System.arraycopy(names, 0, extended, 0, names.length);//数组复制
		
		for(String str :extended){//for each循环
			System.out.println(str);
		}
	}
}
