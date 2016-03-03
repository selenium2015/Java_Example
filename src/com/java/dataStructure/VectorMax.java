package com.java.dataStructure;

import java.util.Collections;
import java.util.Vector;

/**
 * 获取向量的最大元素 
 * 使用 Vector 类的 v.add() 方法
 *  Collection 类的 Collections.max() 来获取向量的最大元素
 * 
 * @author Administrator
 *
 */
public class VectorMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		
		v.add("3.2");
		v.add("2.2");
		v.add("4.1");
		v.add("3.0");
				
		System.out.println(v);
		
		Object obj=Collections.max(v);//引用多态，父类对象指向子类对象
		System.out.println(obj);
		
		v.indexOf("2.2");
		
		
	}

}
