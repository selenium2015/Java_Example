package com.java.string;

/*
 * �ַ�������
 * ʹ���� String ��� indexOf() �������ַ����в������ַ������ֵ�λ��
 * ������ڷ����ַ������ֵ�λ�ã���һλΪ0������������ڷ��� -1��
 * 
 */

public class SearchStringEmp {
	public static void main(String[] args) {
		String str="hello World!";
		String subStr="ll";
		
		int pos=str.indexOf(subStr);
		if(pos==-1){
			System.out.println(subStr+"not found!");
		}else{
			System.out.println("���ַ������ֵ�λ��Ϊ��"+pos);
		}
		
	}

}
