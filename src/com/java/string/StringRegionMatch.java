package com.java.string;

/*
 * ���������ַ��������Ƿ���� 
 * ʹ���� regionMatches() �������������ַ��������Ƿ����
 * 
 */
public class StringRegionMatch {
	public static void main(String[] args) {
		String str1="welcome to china!";
		String str2="welcome to Chine!";
		
		//��ʾ�� str1 �ַ����ӵ�6���ַ���ʼ�� str2 �ַ����ĵ�6���ַ���ʼ����Ƚϣ����Ƚ� 9 ���ַ��������ַ������ִ�Сд�����Խ��Ϊfalse��
		boolean b1=str1.regionMatches(6, str2, 6, 9);
		boolean b2=str1.regionMatches(true, 6, str2, 6, 9);//���õ�һ������Ϊ true �����ʾ���Դ�Сд�������Է��� true�� 
		
		System.out.println(b1);
		System.out.println(b2);
	}

}
