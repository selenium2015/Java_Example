package com.java.arrays;

import java.util.ArrayList;

/*
 * 删除数组元素
 * 使用 remove () 方法来删除数组元素 
 * 
 */
public class Remove {
	public static void main(String[] args) {
		ArrayList objArray=new ArrayList();
		
		objArray.clear();//清掉list中的所有元素
		objArray.add(0, "第一个元素");//位置，元素值
		objArray.add(1, "第二个元素");
		objArray.add(2, "第三个元素");
		
	    System.out.println("数组删除元素前："+objArray);
	    
	    objArray.remove(1);//删除位置为1的元素
	    objArray.remove("0th element");//删除元素：0th element，如果存在时
	    
	    System.out.println("数组删除元素后："+objArray);
	}

}
