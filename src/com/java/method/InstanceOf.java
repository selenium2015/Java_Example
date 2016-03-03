package com.java.method;

import java.util.ArrayList;
import java.util.Vector;

/*
 * instanceOf �ؼ����÷� 
 * instanceof��Java��һ����Ԫ�������������� ==��>��<�Ȳ�������
 * instanceof��Java�ı����ؼ��֡����������ǲ�������ߵĶ����Ƿ������ұߵ����ʵ��������boolean���������͡� 
 * 
 */

public class InstanceOf {
	
	public static void main(String[] args) {
		Object testObject = new ArrayList();
		displayObjectClass(testObject);
	}

	public static void displayObjectClass(Object o) {
		if (o instanceof Vector)//Vector������java.util������
			System.out.println("������ java.util.Vector ���ʵ��");
		else if (o instanceof ArrayList)
			System.out.println("������ java.util.ArrayList ���ʵ��");
		else
			System.out.println("������ " + o.getClass() + " ���ʵ��");
	}

}
