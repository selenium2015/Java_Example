package com.java.collection;

import java.util.Collection;
import java.util.HashMap;

/**
 * HashMap���� 
 * ʹ�� Collection ��� iterator() ��������������
 * 
 * 
 * @author Administrator
 * 
 */
public class Iterator {
	public static void main(String[] args) {
		HashMap<String, String> hMap = new HashMap<String, String>();
		hMap.put("1", "1st");// ��ָ����ֵ�����ļ�
		hMap.put("2", "2nd");
		hMap.put("3", "3rd");
		
		Collection cl = hMap.values();
		
		java.util.Iterator itr = cl.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
