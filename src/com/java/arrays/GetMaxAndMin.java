package com.java.arrays;

import java.util.Arrays;
import java.util.Collections;

/*
 * 数组获取最大和最小值 
 * 通过 Collection 类的 Collections.max() 和 Collections.min() 方法来查找数组中的最大和最小值
 * 
 * （也可通过排序后，取第一个和最后一个值来获取）
 */
public class GetMaxAndMin {
	public static void main(String[] args) {
	      Integer[] numbers = { 8, 2, 7, 1, 4, 9, 5};
	      
	      int max = (int)Collections.max(Arrays.asList(numbers));
	      int min = (int)Collections.min(Arrays.asList(numbers));
	      System.out.println("最小值: " + min);
	      System.out.println("最大值: " + max);
	}

}
