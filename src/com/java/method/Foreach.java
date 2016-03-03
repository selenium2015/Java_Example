package com.java.method;

/*
 * for 和 foreach循环使用 
 * for 语句比较简单，用于循环数据。for循环执行的次数是在执行前就确定的。
 * for(初始化; 布尔表达式; 更新) {
 *     //代码语句
 *  }
 *  
 *  
 *   foreach语句是java5的新特征之一，在遍历数组、集合方面，foreach为开发人员提供了极大的方便。 
 *   for(元素类型t 元素变量x : 遍历对象obj){ 
 *        引用了x的java语句; 
 *   }      
 * 
 * 
 */
public class Foreach {
	public static void main(String[] args) {
		int[] array={1,2,3,4,5};
		
		forDisplay(array);
		foreachDisplay(array);
		
	}
	
	public static void forDisplay(int[] array) {
		System.out.println("这是for循环");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	public static void foreachDisplay(int[] array) {
		System.out.println("这是foreach循环");
		for(int i : array){
			System.out.print(i+" ");
		}
	}

}
