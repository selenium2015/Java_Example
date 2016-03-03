package com.java.collection;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * 数组转集合
 * 使用 Java Util 类的 Arrays.asList(name) 方法将数组转换为集合
 * 
 * 
 * 集合转数组 
 * 使用 Java Util 类的 list.add() 和 list.toArray() 方法将集合转为数组
 * 
 * @author Administrator
 *
 */
public class ArrayToCollection {
	public static void main(String[] args) {

		String[] str=new String[5];
		
		for(int i=0;i<5;i++){
			str[i]=String.valueOf(i);//整型转换为字符串型			
		}
		
		List<String> list=Arrays.asList(str);
		System.out.println();
		
		for(String s:list){
			System.out.print(s+" ");
		}
		
	}

}
