package com.java.string;

import java.util.Locale;

/*
 * �ַ�����ʽ�� 
 * ͨ�� format() ��������ʽ���ַ�����������ָ����������ʽ������
 * 
 */
public class StringFormat {
	public static void main(String[] args) {
		double e=Math.E;
		System.out.format("%f%n", e);//��ʽ��Ϊ��float��ʽ
		System.out.format(Locale.CHINA, "%-10.4f", e);//ָ������Ϊ��China��10�ĸ�4�η�����4λС��
	}

}
