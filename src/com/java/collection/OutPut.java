package com.java.collection;

import java.util.TreeMap;

/**
 * ������� 
 * ʹ�� Java Util ��� tMap.keySet(),tMap.values() �� tMap.firstKey() ����������Ԫ�����
 * 
 * 
 * @author Administrator
 * 
 */
public class OutPut {
	public static void main(String[] args) {
		System.out.println("TreeMap ʵ����\n");
		TreeMap tMap = new TreeMap();
		tMap.put(1, "Sunday");
		tMap.put(2, "Monday");
		tMap.put(3, "Tuesday");
		tMap.put(4, "Wednesday");
		tMap.put(5, "Thursday");
		tMap.put(6, "Friday");
		tMap.put(7, "Saturday");
		
		System.out.println("TreeMap ����" + tMap.keySet());
		System.out.println("TreeMap ֵ��" + tMap.values());
		
		System.out.println("��Ϊ 5 ��ֵΪ: " + tMap.get(5) + "\n");
		System.out.println("��һ����: " + tMap.firstKey() + " Value: "+ tMap.get(tMap.firstKey()) + "\n");
		System.out.println("���һ����: " + tMap.lastKey() + " Value: "+ tMap.get(tMap.lastKey()) + "\n");
		
		System.out.println("�Ƴ���һ������: " + tMap.remove(tMap.firstKey()));
		System.out.println("���� TreeMap ��Ϊ: " + tMap.keySet());
		System.out.println("���� TreeMap ����: " + tMap.values() + "\n");
		
		System.out.println("�Ƴ����һ������: " + tMap.remove(tMap.lastKey()));
		System.out.println("���� TreeMap ��Ϊ: " + tMap.keySet());
		System.out.println("���� TreeMap ����: " + tMap.values());
	}
}
