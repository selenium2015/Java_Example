package com.java.collection;

import java.util.Collection;
import java.util.HashMap;

/**
 * HashMap遍历 
 * 使用 Collection 类的 iterator() 方法来遍历集合
 * 
 * 
 * @author Administrator
 * 
 */
public class Iterator {
	public static void main(String[] args) {
		HashMap<String, String> hMap = new HashMap<String, String>();
		hMap.put("1", "1st");// 与指定的值关联的键
		hMap.put("2", "2nd");
		hMap.put("3", "3rd");
		
		Collection cl = hMap.values();
		
		java.util.Iterator itr = cl.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
