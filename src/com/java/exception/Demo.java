package com.java.exception;

/*
 * ����쳣�������catch��
 * ���쳣�Ĵ���:
 * 1.�����쳣ʱ������������Ϊ������쳣���������Դ���ĸ�����
 * 2.�Է����������쳣���Ͷ�Ӧ����catch�飬 ������catch���е��쳣���ּ̳й�ϵ�������쳣catch�����������
 * 
 */

public class Demo {
	int div(int a, int b) throws ArithmeticException,
			ArrayIndexOutOfBoundsException// �ڹ�����ͨ��throws�Ĺؼ��������ù��ܿ��ܳ�������
	{
		int[] arr = new int[a];

		System.out.println(arr[4]);// ����ĵ�һ���쳣

		return a / b;// ����ĵڶ����쳣
	}
}