package com.java.collection;

import java.util.HashSet;

/**
 * ɾ��������ָ��Ԫ�� 
 * ʹ�� Collection ��� collection.remove() ������ɾ�������е�ָ����Ԫ��
 * 
 * 
 * 
 * @author Administrator
 * 
 */
public class Remove {
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
		iterator = collection.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		
		collection.remove(str2);
		
		System.out.println("ɾ��֮�� [" + str2 + "]\n");
		System.out.print("���ڼ��ϵ�������: ");
		iterator = collection.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		
		size = collection.size();
		System.out.println("���ϴ�С: " + size + "\n");
	}
}
