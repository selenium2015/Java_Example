package com.java.dataStructure;

import java.util.LinkedList;

/**
 * 
 * �����޸� 
 * ʹ�� listname.set() �������޸������е�Ԫ��
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
