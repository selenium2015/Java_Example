package com.java.method;

/*
 * Enum��ö�٣����캯����������ʹ�� 
 * 
 */
public class Enum2 {
	public static void main(String[] args) {
		System.out.println("���������ļ۸�	");
		
		for(Car2 c: Car2.values()){//ö�����͵�ֵ��������
			System.out.println(c+" ��Ҫ"+c.getPrice()+" ǧ��Ԫ��");
		}
	}

}
