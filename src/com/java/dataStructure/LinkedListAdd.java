package com.java.dataStructure;

import java.util.LinkedList;

/**
 * 
 * 在链表（LinkedList）的开头和结尾 添加元素 
 * 使用 LinkedList 类的 addFirst() 和 addLast() 方法在链表的开头和结尾添加元素
 * @author Administrator
 *
 *	获取链表（LinkedList）的第一个和最后一个元素
 *	使用 LinkedList 类的 linkedlistname.getFirst() 和 linkedlistname.getLast() 来获取链表的第一个和最后一个元素
 *
 *	删除元素
 *	remove(),clear()等
 */
public class LinkedListAdd {
	public static void main(String[] args) {
		LinkedList<String> ll=new LinkedList<String>();
//		LinkedList ll=new LinkedList();//LinkedList 数组 属于util类
		
		ll.add("1");
		ll.add("2");
		ll.add("3");
		
		System.out.println("填充后的list："+ll);
		
		ll.addFirst("0");//增加开头元素		
		System.out.println("增加开头元素后："+ll);
		
		ll.addLast("4");//增加结尾元素
		System.out.println("增加结尾元素后："+ll);
		
		String firstStr=ll.getFirst();//第一个元素
		String lastStr=ll.getLast();//最后一个元素
		System.out.println("第一个元素是："+firstStr);
		System.out.println("最后一个元素是："+lastStr);
		
//		ll.remove();//删除第一个元素
//		System.out.println(ll);
		
//		ll.clear();//删除所有元素
//		ll.remove(2);//删除指定索引位置的元素,返回删除前该位置的元素值
		System.out.println("删除前该位置的元素是："+ll.remove(2));
		System.out.println("删除该位置的元素后的元素有："+ll);
		
//		ll.subList(0, 2).clear();//获取指定开始索引位置，结束索引位置的元素(不包括结束索引位置的元素？)，然后删除
//		System.out.println(ll);
//		
		
	}
}
