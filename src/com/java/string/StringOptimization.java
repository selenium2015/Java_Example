package com.java.string;

/*
 * 字符串优化 
 * 通过 String.intern() 方法来优化字符串
 * 
 */
public class StringOptimization {
	
	//通过3种创建字符串的方式对比说明
	public static void main(String[] args) {
		String variables[]=new String[50000];
		for(int i=0;i<50000;i++){
			variables[i]="s"+i;
		}
		//1.通过字符串常量的方式
		long startTime1=System.currentTimeMillis();
		for(int i=0;i<50000;i++){
			variables[i]="hello";
		}		
		long endTime1=System.currentTimeMillis();
		System.out.println("Creation time"+ " of String literals : "+ (endTime1 - startTime1)+ " ms" ); 
		
		
		//2.通过字符串对象的关键字new方式
		long startTime2=System.currentTimeMillis();
		for(int i=0;i<50000;i++){
	         variables[i] = new String("hello");
	      }
		long endTime2=System.currentTimeMillis();
		System.out.println("Creation time"+ " String objects with 'new' key word : "+ (endTime2 - startTime2)+ " ms" ); 

		
		//3.通过字符串对象的intern() 方法
		long startTime3=System.currentTimeMillis();
		 for(int i=0;i<50000;i++){
	         variables[i] = new String("hello");
	         variables[i] = variables[i].intern();		  
	      }
		long endTime3=System.currentTimeMillis();
		System.out.println("Creation time"+ " String objects with intern(): " + (endTime3 - startTime3)+ " ms" ); 

	}

}
