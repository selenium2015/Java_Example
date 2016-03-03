package com.java.string;

/*
 * �ַ����Ż� 
 * ͨ�� String.intern() �������Ż��ַ���
 * 
 */
public class StringOptimization {
	
	//ͨ��3�ִ����ַ����ķ�ʽ�Ա�˵��
	public static void main(String[] args) {
		String variables[]=new String[50000];
		for(int i=0;i<50000;i++){
			variables[i]="s"+i;
		}
		//1.ͨ���ַ��������ķ�ʽ
		long startTime1=System.currentTimeMillis();
		for(int i=0;i<50000;i++){
			variables[i]="hello";
		}		
		long endTime1=System.currentTimeMillis();
		System.out.println("Creation time"+ " of String literals : "+ (endTime1 - startTime1)+ " ms" ); 
		
		
		//2.ͨ���ַ�������Ĺؼ���new��ʽ
		long startTime2=System.currentTimeMillis();
		for(int i=0;i<50000;i++){
	         variables[i] = new String("hello");
	      }
		long endTime2=System.currentTimeMillis();
		System.out.println("Creation time"+ " String objects with 'new' key word : "+ (endTime2 - startTime2)+ " ms" ); 

		
		//3.ͨ���ַ��������intern() ����
		long startTime3=System.currentTimeMillis();
		 for(int i=0;i<50000;i++){
	         variables[i] = new String("hello");
	         variables[i] = variables[i].intern();		  
	      }
		long endTime3=System.currentTimeMillis();
		System.out.println("Creation time"+ " String objects with intern(): " + (endTime3 - startTime3)+ " ms" ); 

	}

}
