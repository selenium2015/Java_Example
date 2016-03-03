package com.java.dataStructure;

import java.util.LinkedList;

/**
 * 链表元素查找 
 * 链表元素查找 使用 linkedlistname.indexof(element) 和
 * linkedlistname.Lastindexof(elementname) 方法在链表中获取元素第一次和最后一次出现的位置
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
		System.out.println("元素 2 第一次出现的位置：" + lList.indexOf("2"));//如果返回-1，表示不存在该元素
		System.out.println("元素 2 最后一次出现的位置：" + lList.lastIndexOf("2"));
	}
}
