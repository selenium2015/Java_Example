package com.java.method;

/*
 * 斐波那契数列(fibonacci)
 * 斐波那契数列指的是这样一个数列 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144……
 * 特别指出：第0项是0，第1项是第一个1。
 * 这个数列从第三项开始，每一项都等于前两项之和。
 * 
 */
public class Fibonacci {
	
	public static long fibonacci(long  num){
		if((num==0)||(num==1)){
			return num;
		}else{
			return fibonacci(num-1)+fibonacci(num-2);//递归
		}
	}
	
	
	public static void main(String[] args) {
	    for (int counter = 0; counter <= 10; counter++){
	    	System.out.printf("Fibonacci of %d is: %d\n",counter, fibonacci(counter));	    
	    }
	}
}
