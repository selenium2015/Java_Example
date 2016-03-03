package com.java.string;

/*
 * �����ַ��� 
 * ͨ�� "+" ��������StringBuffer.append() �����������ַ��������Ƚ�������
 * ��+������������Ҫ�ã�
 * 
 */
public class StringConcatenate {
	public static void main(String[] args) {
		//1."+"���������������ַ���
		long startTime1=System.currentTimeMillis();
		for(int i=0;i<50000;i++){
			String result="this is"+"testing the"+"difference between"+"String"+ "and"+ "StringBuffer";
		}
		long endTime1=System.currentTimeMillis();
		System.out.println("+��������ʱ��Ϊ��"+(endTime1-startTime1)+ " ms");
		
		//2.StringBuffer.append() �����������ַ���
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
	      System.out.println("�ַ�������" + " - ʹ�� StringBuffer : " + (endTime2 - startTime2)+ " ms");
		
	}

}
