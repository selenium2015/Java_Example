package com.java.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * 集合转数组 
 * 使用 Java Util 类的 list.add() 和 list.toArray() 方法将集合转为数组
 * 
 * 
 * @author Administrator
 *
 */
public class CollectionToArray {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();//引用多态，父类List指向子类ArrayList对象
		
		list.add("菜");
	    list.add("鸟"); 
	    list.add("教");
	    list.add("程");
	    list.add("www.baidu.com");
	    
	    String[] arrays=list.toArray(new String[0]);//集合转数组
	    for(String s:arrays){
	    	System.out.print(s);
	    }
	    
	    
		
	}
}
