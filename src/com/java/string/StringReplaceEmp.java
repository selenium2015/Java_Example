package com.java.string;

/*
 * �ַ����滻 
 * ʹ�� java String ��� replace �������滻�ַ����е��ַ�
 * 
 */
public class StringReplaceEmp {
	public static void main(String[] args) {
		String str="hello World!";
		
		System.out.println(str.replace("World", "kugo"));//�ַ���
		System.out.println(str.replace('h', 'n'));//�ַ�
		System.out.println(str.replaceAll("o", "x"));//����ƥ�䣬�滻ȫ��
		System.out.println(str.replaceFirst("o", "x"));//����ƥ�䣬�滻��һ��
	}

}
