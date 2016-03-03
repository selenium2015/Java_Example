package com.java.collection;

import java.util.Enumeration;
import java.util.Hashtable;

/**
 * 遍历 HashTable 的键值
 *  使用 Hashtable 类的 keys() 方法来遍历输出键值
 * 
 * 
 * 使用 Enumeration 遍历 HashTable 
 * 使用 Enumeration 类的 hasMoreElements 和 nestElement 方法来遍历输出 HashTable 中的内容
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
