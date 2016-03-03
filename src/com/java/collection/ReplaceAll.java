package com.java.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * List 元素替换 
 * 使用 Collections 类的 replaceAll() 来替换List中所有的指定元素
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
