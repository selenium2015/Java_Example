package com.java.arrays;

import java.util.ArrayList;

/*
 * 数组差集 
 * 使用 removeAll () 方法来计算两个数组的差集
 * （差集：去掉相同的，剩下不同的）
 * 
 * 数组交集
 * 使用 retainAll () 方法来计算两个数组的交集
 * 
 * 数组是否包含指定元素
 * 使用 contains 方法来表示是否包含（存在）指定元素，如果存在，返回true，不存在，返回false
 * 
 */
public class RemoveAll {
	public static void main(String[] args) {
	      ArrayList objArray = new ArrayList();
	      ArrayList objArray2 = new ArrayList();
	      
	      objArray.add(0, "e1");
	      objArray.add(1, "e2");
	      objArray.add(2, "e3");
	      
	      objArray2.add(0, "e1");
	      objArray2.add(1, "e2");
	      objArray2.add(2, "e4");
	      
	      //是否包含指定元素
	      System.out.println(objArray.contains("e1"));
	      System.out.println(objArray.contains(objArray2));//是否包含数组
	      
	      //差集
//	      objArray.removeAll(objArray2);
//	      System.out.println("objArray 与 objArray2 数组差集为："+objArray);
	      
	      //交集
	      objArray.retainAll(objArray2);
	      System.out.println("objArray 与 objArray2 数组交集为："+objArray);
	      
	}

}
