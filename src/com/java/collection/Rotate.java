package com.java.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 * List 循环移动元素 
 * 使用 Collections 类的 rotate() 来循环移动元素，方法第二个参数指定了移动的起始位置
 * (rotate （使某物） 旋转)
 * 
 * 查找 List 中的最大最小值 
 * 使用 Collections 类的 max() 和 min() 方法来获取List中最大最小值
 * 
 * @author Administrator
 *
 */
public class Rotate {
	public static void main(String[] args) {
		List list=Arrays.asList("one two three four five six".split(" "));
		
		System.out.println(list);
		
		System.out.println("list中最大值："+Collections.max(list));
		System.out.println("list中最大值："+Collections.min(list));
		
		Collections.rotate(list, 5);//用于通过指定的距离进行旋转指定列表中的元素
		//从后面的元素移动到开头位置？  循环移动，移动N次，当N等于list长度时，与原元素一样
		
		System.out.println(list);
		
	}

}
