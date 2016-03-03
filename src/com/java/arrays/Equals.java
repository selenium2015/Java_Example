package com.java.arrays;

import java.util.Arrays;

/*
 * 判断数组是否相等 
 * 使用Arrays.equals ()方法来判断数组是否相等
 * 
 */
public class Equals {
	public static void main(String[] args) {
		int[] array1={1,2,3,4,5};
		int[] array2={1,2,3,4,5};
		int[] array3={1,2,3,4};
		
		System.out.println(Arrays.equals(array1, array2));
		System.out.println(Arrays.equals(array1, array3));
		
	}

}
