package com.java.method;

/*
 * �������� Overriding����д����
 * 	����������ж���һ�������������ơ��������ͼ�����ǩ�������븸����ĳ�����������ơ��������ͼ�����ǩ����ƥ�䣬��ô����˵������ķ��������˸���ķ����� 
 * 
 */
public class Overriding {
	public static void main(String[] agrs) {
		Figure f = new Figure(10, 10);
		Rectangle r = new Rectangle(9, 5);
		Figure figref;
		figref = f;
		System.out.println("Area is :" + figref.area());
		figref = r;
		System.out.println("Area is :" + figref.area());
	}
}
