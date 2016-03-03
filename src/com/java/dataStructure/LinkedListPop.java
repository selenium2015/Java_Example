package com.java.dataStructure;

import java.util.LinkedList;

/**
 * ��ȡ�����Ԫ�� ʹ�� top() �� pop() ��������ȡ�����Ԫ��
 * 
 * 
 * @author Administrator
 * 
 */
public class LinkedListPop {
	private LinkedList list = new LinkedList();

	public void push(Object v) {
		list.addFirst(v);
	}

	public Object top() {
		return list.getFirst();
	}

	public Object pop() {
		return list.removeFirst();//ɾ����һ��Ԫ�أ�Ȼ�󷵻�ɾ��ǰ�ĵ�һ��Ԫ��
	}

	public static void main(String[] args) {
		LinkedListPop stack = new LinkedListPop();
		for (int i = 30; i < 40; i++)
			stack.push(new Integer(i));
		System.out.println(stack.list);
		
		System.out.println(stack.top());
		System.out.println(stack.pop());
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}

}
