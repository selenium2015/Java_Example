package com.java.dataStructure;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * ���У�Queue���÷� LinkedList��ʵ����Queue�ӿڣ�������ǿ��԰�LinkedList����Queue���á�
 * ��������һ����������Ա���ֻ�����ڱ��ǰ�˽���ɾ�����������ڱ�ĺ�˽��в���������� ����ջ�෴���������Ƚ��ȳ���
 * 
 * @author Administrator
 * 
 */
public class QueueTest {
	public static void main(String[] args) {
		// add()��remove()������ʧ�ܵ�ʱ����׳��쳣(���Ƽ�)
		Queue<String> queue = new LinkedList<String>();//���ö�̬  �������ָ���������
		// ���Ԫ��
		queue.offer("a");//the element to add,true if the element was added to this queue, else false
		queue.offer("b");
		queue.offer("c");
		queue.offer("d");
		queue.offer("e");
		
		for (String q : queue) {
			System.out.println(q);
		}
		System.out.println("===");
		
		System.out.println("poll=" + queue.poll()); // ���ص�һ��Ԫ�أ����ڶ�����ɾ��		
		for (String q : queue) {
			System.out.println(q);
		}
		System.out.println("===");
		
		System.out.println("element=" + queue.element()); // ���ص�һ��Ԫ��
		for (String q : queue) {
			System.out.println(q);
		}
		System.out.println("===");
		
		System.out.println("peek=" + queue.peek()); // ���ص�һ��Ԫ��
		for (String q : queue) {
			System.out.println(q);
		}
	}

}
