package com.java.string;

/*
 * 字符串性能比较测试 
 * 通过两种方式创建字符串，并测试其性能
 * 1）通过 String 关键词创建字符串
 * 2) 通过 String 对象创建字符串
 */
public class StringComparePerformance {
	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();
		
		for(int i=0;i<50000;i++){
			String str1="hello";
			String str2="world!";
		}
		long endTime=System.currentTimeMillis();
		
		System.out.println("通过 String 关键词创建字符串" + " : "+ (endTime - startTime) + " 毫秒" );
		
		long startTime1=System.currentTimeMillis();
		
		for(int i=0;i<50000;i++){
			String str3=new String("hello");
			String str4=new String("world!");
		}
		long endTime1=System.currentTimeMillis();
		
		System.out.println("通过 String 关键词创建字符串" + " : "+ (endTime1 - startTime1) + " 毫秒" );
	}

}
