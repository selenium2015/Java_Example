package com.java.dataStructure;

import java.util.LinkedList;

/**
 * 
 * ������LinkedList���Ŀ�ͷ�ͽ�β ���Ԫ�� 
 * ʹ�� LinkedList ��� addFirst() �� addLast() ����������Ŀ�ͷ�ͽ�β���Ԫ��
 * @author Administrator
 *
 *	��ȡ����LinkedList���ĵ�һ�������һ��Ԫ��
 *	ʹ�� LinkedList ��� linkedlistname.getFirst() �� linkedlistname.getLast() ����ȡ����ĵ�һ�������һ��Ԫ��
 *
 *	ɾ��Ԫ��
 *	remove(),clear()��
 */
public class LinkedListAdd {
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
//		LinkedList ll=new LinkedList();//LinkedList ���� ����util��
		
		ll.add("1");
		ll.add("2");
		ll.add("3");
		
		System.out.println("�����list��"+ll);
		
		ll.addFirst("0");//���ӿ�ͷԪ��		
		System.out.println("���ӿ�ͷԪ�غ�"+ll);
		
		ll.addLast("4");//���ӽ�βԪ��
		System.out.println("���ӽ�βԪ�غ�"+ll);
		
		String firstStr=ll.getFirst();//��һ��Ԫ��
		String lastStr=ll.getLast();//���һ��Ԫ��
		System.out.println("��һ��Ԫ���ǣ�"+firstStr);
		System.out.println("���һ��Ԫ���ǣ�"+lastStr);
		
//		ll.remove();//ɾ����һ��Ԫ��
//		System.out.println(ll);
		
//		ll.clear();//ɾ������Ԫ��
//		ll.remove(2);//ɾ��ָ������λ�õ�Ԫ��,����ɾ��ǰ��λ�õ�Ԫ��ֵ
		System.out.println("ɾ��ǰ��λ�õ�Ԫ���ǣ�"+ll.remove(2));
		System.out.println("ɾ����λ�õ�Ԫ�غ��Ԫ���У�"+ll);
		
//		ll.subList(0, 2).clear();//��ȡָ����ʼ����λ�ã���������λ�õ�Ԫ��(��������������λ�õ�Ԫ�أ�)��Ȼ��ɾ��
//		System.out.println(ll);
//		
		
	}
}
