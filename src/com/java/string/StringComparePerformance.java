package com.java.string;

/*
 * �ַ������ܱȽϲ��� 
 * ͨ�����ַ�ʽ�����ַ�����������������
 * 1��ͨ�� String �ؼ��ʴ����ַ���
 * 2) ͨ�� String ���󴴽��ַ���
 */
public class StringComparePerformance {
	public static void main(String[] args) {
		long startTime=System.currentTimeMillis();
		
		for(int i=0;i<50000;i++){
			String str1="hello";
			String str2="world!";
		}
		long endTime=System.currentTimeMillis();
		
		System.out.println("ͨ�� String �ؼ��ʴ����ַ���" + " : "+ (endTime - startTime) + " ����" );
		
		long startTime1=System.currentTimeMillis();
		
		for(int i=0;i<50000;i++){
			String str3=new String("hello");
			String str4=new String("world!");
		}
		long endTime1=System.currentTimeMillis();
		
		System.out.println("ͨ�� String �ؼ��ʴ����ַ���" + " : "+ (endTime1 - startTime1) + " ����" );
	}

}
