package com.java.string;


/*
 * �����ַ������һ�γ��ֵ�λ��
 * ͨ���ַ������� strOrig.lastIndexOf(Stringname) ���������ַ��� Stringname �� strOrig ���ֵ�λ��
 * 
 */

public class SearchlastString {
	
	public static void main(String[] args){
		
		String str="hello World!hello Kugo!";
		String subStr="hello";
		int lastIndex=str.lastIndexOf(subStr);
		
		if(lastIndex==-1){
			System.out.println(subStr+" not found !");
		}else{
			System.out.println(str.lastIndexOf(subStr));
		}
		
		System.out.println(str.lastIndexOf('W'));

	}

}
