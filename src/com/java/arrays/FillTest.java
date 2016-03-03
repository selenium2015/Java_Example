package com.java.arrays;

import java.util.Arrays;

/*
 * 数组填充
 * 通过 Java Util 类的 Arrays.fill(arrayname,value) 方法和 Arrays.fill(arrayname ,starting index ,ending index ,value) 方法向数组中填充元素
 * 
 */
public class FillTest {
	public static void main(String[] args) {
		int[] array=new int[6];
		
		Arrays.fill(array, 100);//全部元素值都为100
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
		System.out.println();
		
		Arrays.fill(array, 3, 6, 50);//从位置3到6，填充值为50
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}

}
