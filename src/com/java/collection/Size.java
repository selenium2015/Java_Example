package com.java.collection;

import java.util.HashSet;

/**
 * ���ϳ��� 
 * ʹ�� Collections �� ��collection.add() ��������ݲ�ʹ�� collection.size()�����㼯�ϵĳ���
 * 
 * 
 * @author Administrator
 * 
 */
public class Size {
	public static void main(String[] args) {
		System.out.println("����ʵ��!\n");
		int size;
		HashSet collection = new HashSet();
		String str1 = "Yellow", str2 = "White", str3 = "Green", str4 = "Blue";
		java.util.Iterator iterator;
		collection.add(str1);
		collection.add(str2);
		collection.add(str3);
		collection.add(str4);
		System.out.print("��������: ");
		//��������
		iterator = collection.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		
		size = collection.size();//��ȡ���ϳ���
		
		if (collection.isEmpty()) {
			System.out.println("�����ǿյ�");
		} else {
			System.out.println("���ϳ���: " + size);
		}
		System.out.println();
	}

}
