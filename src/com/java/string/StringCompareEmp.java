package com.java.string;


/*
 * �ַ����Ƚ�
 * ͨ���ַ������� compareTo (string) ��compareToIgnoreCase(String) �� compareTo(object string) ���Ƚ������ַ������������ַ����е�һ����ĸASCII�Ĳ�ֵ��
 */

public class StringCompareEmp {
	public static void main(String[] args){
		
		String strOne="hello";
		String strTwo="Hello";
		
		Object objStr=strOne;		
				
		System.out.println(strOne.compareTo(strTwo));
		System.out.println(strOne.compareToIgnoreCase(strTwo));
		System.out.println(strOne.compareTo(objStr.toString()));
		
	}
	
	

}
