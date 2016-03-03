package com.java.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * 数组并集 
 * 使用 union ()方法来表示数组并集
 * （通过自定义方法来实现）
 */
public class Union {
	public static void main(String[] args) {
		String[] str1={"1","2","3"};
		String[] str2={"4","5","6"};
		
		String[] unionStr=union(str1,str2);
		
		System.out.println("并集结果为：");
		
		for(String us: unionStr){
			System.out.println(us);
		}
	}
	
    // 求两个字符串数组的并集，利用set的元素唯一性
	public static String[] union(String[] str1,String[] str2){
		Set<String> set=new HashSet<String>();//实例化Set对象
		
		for(String str:str1){
			set.add(str);//把str1数组的元素加入到set中
		}
		
		for(String str:str2){
			set.add(str);
		}
		
		String[] result={};
		
		return set.toArray(result);//返回并集结果数组（先转换成数组格式toArray）
	}

}
