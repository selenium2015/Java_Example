package com.java.arrays;

import java.util.Arrays;

/*
 * 数组排序及元素查找
 * 使用sort()方法对Java数组进行排序（从小到大）
 * 使用 binarySearch() 方法来查找数组中的元素（返回元素的索引位置）
 * 
 */
public class SortArrays {
	public static void main(String[] args) {
		int[] array={2,5,-2,6,-3,8,0,-7,-9,4 };
		
		//使用sort方法进行数组排序
		Arrays.sort(array);
		printArray(array);
		
		//查找数组中元素的位置
		int index=Arrays.binarySearch(array, -2);
		System.out.println("元素 -2 在数组中的位置为："+index);
	}
	
	//printArray方法对数组输出
	public static void printArray(int[] array){
		for(int i=0;i<array.length;i++){
			if(i!=0){
				System.out.print(",");//使输出的数组在同一行，并用短号（，）间隔
			}
			System.out.print(array[i]);
		}
		System.out.println();
	}
}
