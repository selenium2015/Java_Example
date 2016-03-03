package com.java.dataStructure;

import java.util.LinkedList;

/**
 * 获取链表的元素 使用 top() 和 pop() 方法来获取链表的元素
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
		return list.removeFirst();//删除第一个元素，然后返回删除前的第一个元素
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
