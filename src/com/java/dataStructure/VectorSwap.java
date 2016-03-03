package com.java.dataStructure;

import java.util.Collections;
import java.util.Vector;

/**
 * 
 * 旋转向量 
 * 使用 swap() 函数来旋转向量
 * （指定两个位置的元素进行互换位置）
 * 
 * @author Administrator
 * 
 */
public class VectorSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v = new Vector();
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");
		v.add("5");
		
		System.out.println(v);
		Collections.swap(v, 0, 4);
		System.out.println("旋转后");
		System.out.println(v);
	}

}
