package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * 集合打乱顺序 
	使用 Collections 类 Collections.shuffle() 方法来打乱集合元素的顺序
 * 
 * @author Administrator
 *
 */
public class Shuffle {
	public static void main(String[] args) {
		List<Integer> list =new ArrayList<Integer>();
		
		for(int i=0;i<10;i++){
			list.add(new Integer(i));//使类型相同  Integer  int
			
		}
		
        System.out.println("打乱前:");
        System.out.println(list);
        
        Collections.shuffle(list);//Randomly 
        System.out.println("打乱后:");
        System.out.println(list);
	}

}
