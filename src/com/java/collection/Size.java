package com.java.collection;

import java.util.HashSet;

/**
 * 集合长度 
 * 使用 Collections 类 的collection.add() 来添加数据并使用 collection.size()来计算集合的长度
 * 
 * 
 * @author Administrator
 * 
 */
public class Size {
	public static void main(String[] args) {
		System.out.println("集合实例!\n");
		int size;
		HashSet collection = new HashSet();
		String str1 = "Yellow", str2 = "White", str3 = "Green", str4 = "Blue";
		java.util.Iterator iterator;
		collection.add(str1);
		collection.add(str2);
		collection.add(str3);
		collection.add(str4);
		System.out.print("集合数据: ");
		//遍历集合
		iterator = collection.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + " ");
		}
		System.out.println();
		
		size = collection.size();//获取集合长度
		
		if (collection.isEmpty()) {
			System.out.println("集合是空的");
		} else {
			System.out.println("集合长度: " + size);
		}
		System.out.println();
	}

}
