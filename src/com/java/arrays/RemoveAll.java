package com.java.arrays;

import java.util.ArrayList;

/*
 * ���� 
 * ʹ�� removeAll () ������������������Ĳ
 * �����ȥ����ͬ�ģ�ʣ�²�ͬ�ģ�
 * 
 * ���齻��
 * ʹ�� retainAll () ������������������Ľ���
 * 
 * �����Ƿ����ָ��Ԫ��
 * ʹ�� contains ��������ʾ�Ƿ���������ڣ�ָ��Ԫ�أ�������ڣ�����true�������ڣ�����false
 * 
 */
public class RemoveAll {
	public static void main(String[] args) {
	      ArrayList objArray = new ArrayList();
	      ArrayList objArray2 = new ArrayList();
	      
	      objArray.add(0, "e1");
	      objArray.add(1, "e2");
	      objArray.add(2, "e3");
	      
	      objArray2.add(0, "e1");
	      objArray2.add(1, "e2");
	      objArray2.add(2, "e4");
	      
	      //�Ƿ����ָ��Ԫ��
	      System.out.println(objArray.contains("e1"));
	      System.out.println(objArray.contains(objArray2));//�Ƿ��������
	      
	      //�
//	      objArray.removeAll(objArray2);
//	      System.out.println("objArray �� objArray2 ����Ϊ��"+objArray);
	      
	      //����
	      objArray.retainAll(objArray2);
	      System.out.println("objArray �� objArray2 ���齻��Ϊ��"+objArray);
	      
	}

}
