package com.java.collection;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * ���� HashTable �ļ�ֵ
 *  ʹ�� Hashtable ��� keys() ���������������ֵ
 * 
 * 
 * ʹ�� Enumeration ���� HashTable 
 * ʹ�� Enumeration ��� hasMoreElements �� nestElement ������������� HashTable �е�����
 * 
 * @author Administrator
 * 
 */
public class HashTableKey {

	public static void main(String[] args) {
		Hashtable ht = new Hashtable();

		ht.put("1", "Monday");
		ht.put("2", "tuesday");
		ht.put("3", "Wednesday ");
		ht.put("4", "Thursday");
		ht.put("5", "Friday");
		ht.put("6", "Saturday");
		ht.put("7", "Sunday");

		Enumeration e = ht.keys();//an enumeration of the keys in this hashtable.

		while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
	}

}
