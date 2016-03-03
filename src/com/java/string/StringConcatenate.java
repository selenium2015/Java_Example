package com.java.string;

/*
 * 连接字符串 
 * 通过 "+" 操作符和StringBuffer.append() 方法来连接字符串，并比较其性能
 * （+操作符的性能要好）
 * 
 */
public class StringConcatenate {
	public static void main(String[] args) {
		//1."+"操作符进行连接字符串
		long startTime1=System.currentTimeMillis();
		for(int i=0;i<50000;i++){
			String result="this is"+"testing the"+"difference between"+"String"+ "and"+ "StringBuffer";
		}
		long endTime1=System.currentTimeMillis();
		System.out.println("+操作符的时间为："+(endTime1-startTime1)+ " ms");
		
		//2.StringBuffer.append() 方法来连接字符串
		 long startTime2 = System.currentTimeMillis();
	      for(int i=0;i<5000;i++){
	         StringBuffer result = new StringBuffer();
	         result.append("This is");
	         result.append("testing the");
	         result.append("difference");
	         result.append("between");
	         result.append("String");
	         result.append("and");
	         result.append("StringBuffer");
	      }
	      long endTime2 = System.currentTimeMillis();
	      System.out.println("字符串连接" + " - 使用 StringBuffer : " + (endTime2 - startTime2)+ " ms");
		
	}

}
