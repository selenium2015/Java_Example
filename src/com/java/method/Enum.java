package com.java.method;

/*
 * enum �� switch ���ʹ�� 
 * Java ����ö������Ҫʹ�� enum �ؼ��֣������������������Ͷ��� java.lang.Enum �������
 * 
 */

public class Enum {
	public static void main(String[] args) {
		Car c;
		c=Car.tata;
		
		switch(c){
		case lamborghini:
			System.out.println("ѡ������������");
			break;
		case tata:
			System.out.println("ѡ������������");
			break;
		case audi:
			System.out.println("ѡ���˰µ�����");
			break;
		case fiat:
			System.out.println("ѡ���˷���������");
			break;
		case honda:
			System.out.println("ѡ���˷�������");
			break;
		default:
			System.out.println("û��ѡ����");
		}
	}

}
