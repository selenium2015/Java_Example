package com.java.collection;

import java.util.*;


/**
 * 集合比较 将字符串转换为集合并使用 Collection 类的 Collection.min() 和 Collection.max() 来比较集合中的元素
 * 
 * 
 * @author Administrator
 * 
 */
public class MaxAndMin {
	public static void main(String[] args) {
		String[] coins = { "Penny", "nickel", "dime", "Quarter", "dollar" };
		
		//TreeSet 继承于AbstractSet，使用元素的自然顺序对元素进行排序.
		//AbstractSet  继承于AbstractCollection 并且实现了大部分Set接口。
		//AbstractCollection  实现了大部分的集合接口。		
		Set set = new TreeSet(); //Set 继承于 Collection，是一个不包含重复元素的集合。
		for (int i = 0; i < coins.length; i++)
			set.add(coins[i]);
		System.out.println(Collections.min(set));
		////如果数组或集合元素是String类型，则可以利用Java API实现的Comparator<String>对象String.CASE_INSENSITIVE_ORDER为容器元素排序。
		System.out.println(Collections.min(set, String.CASE_INSENSITIVE_ORDER));//忽略大小写排序
		
		for (int i = 0; i <= 10; i++)
			System.out.print("-");
		System.out.println("");
		
		System.out.println(Collections.max(set));
		System.out.println(Collections.max(set, String.CASE_INSENSITIVE_ORDER));

	}

}
