package com.java.arrays;

import java.util.ArrayList;
import java.util.Collections;

/*
 * ���鷴ת 
 * ʹ�� Collections.reverse(ArrayList) ��������з�ת
 * ��ʹ��ArrayList����ʱ���赼���Ӧ�İ���
 * 
 */
public class Reverse {
	public static void main(String[] args) {
	      ArrayList arrayList = new ArrayList();
	      
	      arrayList.add("A");//�Ǹ����ϣ���Ա��ʾΪ��[A, B, C, D]
	      arrayList.add("B");
	      arrayList.add("C");
	      arrayList.add("D");
	      
	      System.out.println("��תǰ����: " + arrayList);
	      
	      Collections.reverse(arrayList);
	      System.out.println("��ת������: " + arrayList);
	}

}
