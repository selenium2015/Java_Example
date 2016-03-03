package com.java.arrays;

import java.util.ArrayList;
import java.util.Collections;

/*
 * 数组反转 
 * 使用 Collections.reverse(ArrayList) 将数组进行反转
 * （使用ArrayList对象时，需导入对应的包）
 * 
 */
public class Reverse {
	public static void main(String[] args) {
	      ArrayList arrayList = new ArrayList();
	      
	      arrayList.add("A");//是个集合，成员显示为：[A, B, C, D]
	      arrayList.add("B");
	      arrayList.add("C");
	      arrayList.add("D");
	      
	      System.out.println("反转前排序: " + arrayList);
	      
	      Collections.reverse(arrayList);
	      System.out.println("反转后排序: " + arrayList);
	}

}
