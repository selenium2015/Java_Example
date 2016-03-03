package com.java.method;

/*
 * Varargs 可变参数使用 
 * Java1.5提供了一个叫varargs的新功能，就是可变长度的参数。
 *  定义实参个数可变的方法：只要在一个形参的"类型"与"参数名"之间加上三个连续的"."（即"..."，英文里的句中省略号），就可以让它和不确定个实参相匹配。 
 * 
 * 
 */
public class Varargs {
	public static void main(String[] args) {
		int[] array={1,2,3,4,5};
		int sum=sumvarargs(array);
		
		System.out.println("数字相加之和为: " +sum);
	}
	
	static int sumvarargs(int... intArrays){
		int sum,i;
		sum=0;
		for(int a:intArrays){
			sum+=a;
		}
		return sum;
	}

}
