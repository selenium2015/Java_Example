package com.java.arrays;

import java.util.Arrays;

/*
 * 数组添加元素
 * 使用 insertElement () 方法向数组插入元素（自定义方法）
 * 
 */
public class InsertElement {
	public static void main(String[] args) {
		int[] array={2,5,-2,6,-3,8,0,-7,-9,4 };
		
		//使用sort方法进行数组排序
		Arrays.sort(array);		
		SortArrays.printArray(array);//调用SortArrays类的printArray方法来输出数组
		
		//插入元素
		array=insertElement(array,1,3);
		System.out.print("插入元素后的数组：");
		SortArrays.printArray(array);
		
	}
	
	//自定义方法，实现向数组插入元素
	 public static int[] insertElement(int original[], int element, int index) {//原有数组，要插入的元素，要插入的位置
		 int length = original.length;
		 int destination[] = new int[length + 1];//目标数组，长度比原有数组+1
		 
		 System.arraycopy(original, 0, destination, 0, index);//数组复制；原数组，原数组开始位置，目标数组，目标数组开始位置，要复制的长度
		 
		 destination[index] = element;//把要插入的元素赋值给目标数组的指定位置
		 
		 System.arraycopy(original, index, destination, index+ 1, length - index);//数组复制，插入位置的后半段
		 
		 return destination;
  }

}
