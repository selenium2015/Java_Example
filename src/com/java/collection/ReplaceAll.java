package com.java.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * List Ԫ���滻 
 * ʹ�� Collections ��� replaceAll() ���滻List�����е�ָ��Ԫ��
 * 
 * 
 * @author Administrator
 * 
 */
public class ReplaceAll {
	public static void main(String[] args) {
		List list = Arrays.asList("one Two three Four five six one three Four".split(" "));
		System.out.println("List :" + list);
		
		Collections.replaceAll(list, "one", "hundread");
		System.out.println("replaceAll: " + list);
		
		}

}
