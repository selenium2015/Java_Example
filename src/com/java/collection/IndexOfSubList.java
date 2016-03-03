package com.java.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 * List ��ȡ ʹ�� Collections ��� indexOfSubList() �� lastIndexOfSubList()
 * �������鿴���б��Ƿ����б��У����鿴���б����б������ڵ�λ��
 * 
 * @author Administrator
 * 
 */
public class IndexOfSubList {
	public static void main(String[] args) {
		List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
		System.out.println("List :" + list);
		
		List sublist = Arrays.asList("three Four".split(" "));
		System.out.println("���б� :" + sublist);
		
		System.out.println("indexOfSubList: "+ Collections.indexOfSubList(list, sublist));
		
		System.out.println("lastIndexOfSubList: "+ Collections.lastIndexOfSubList(list, sublist));
	}
}
