package com.java.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 数组合并 
 * 通过 List 类的 Arrays.toString () 方法和 List 类的 list.Addall(array1.asList(array2) 方法将两个数组合并为一个数组
 * 
 */
public class Merge {
	public static void main(String[] args) {
	      String a[] = { "A", "E", "I" };
	      String b[] = { "O", "U" };
	      
	      List list = new ArrayList(Arrays.asList(a));//Arrays.asList(a)转换字符串数组为List类对象
	      
	      list.addAll(Arrays.asList(b));//将字符串数组b转换成List类对象，然后利用list的addAll方法将a、b组合起来
	      
	      Object[] c = list.toArray();//将组合后的List对象list转换成数组对象，赋给Object对象c
	      
	      System.out.println(Arrays.toString(c));//将Object对象c转换成字符串数组打印
	}

}
