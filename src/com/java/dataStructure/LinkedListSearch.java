package com.java.dataStructure;

import java.util.LinkedList;

/**
 * ����Ԫ�ز��� 
 * ����Ԫ�ز��� ʹ�� linkedlistname.indexof(element) ��
 * linkedlistname.Lastindexof(elementname) �����������л�ȡԪ�ص�һ�κ����һ�γ��ֵ�λ��
 * 
 * @author Administrator
 * 
 */
public class LinkedListSearch {
	public static void main(String[] args) {
		LinkedList lList = new LinkedList();
		lList.add("1");
		lList.add("2");
		lList.add("3");
		lList.add("4");
		lList.add("5");
		lList.add("2");
		System.out.println("Ԫ�� 2 ��һ�γ��ֵ�λ�ã�" + lList.indexOf("2"));//�������-1����ʾ�����ڸ�Ԫ��
		System.out.println("Ԫ�� 2 ���һ�γ��ֵ�λ�ã�" + lList.lastIndexOf("2"));
	}
}
