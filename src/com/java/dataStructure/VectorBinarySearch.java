package com.java.dataStructure;

import java.util.Collections;
import java.util.Vector;

/**
 * 
 * 获取向量元素的索引值 使用 Collections 类的 sort() 方法对向量进行排序 并使用 binarySearch()
 * 方法来获取向量元素的索引值
 * 
 * @author Administrator
 * 
 */
public class VectorBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		v.add("X");
		v.add("M");
		v.add("D");
		v.add("A");
		v.add("O");
		
		System.out.println("排序前："+v);
		Collections.sort(v);
		System.out.println("排序后："+v);
		
		int index=Collections.binarySearch(v, "M");
		System.out.println(index);
		
		
	}

}
