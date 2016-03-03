package com.java.dataStructure;

import java.util.LinkedList;

/**
 * 
 * 链表修改 
 * 使用 listname.set() 方法来修改链接中的元素
 * 
 * @author Administrator
 * 
 */
public class LinkedListModify {
	public static void main(String[] a) {
		LinkedList officers = new LinkedList();
		officers.add("B");
		officers.add("B");
		officers.add("T");
		officers.add("H");
		officers.add("P");
		System.out.println(officers);
		officers.set(2, "M");
		System.out.println(officers);
	}

}
