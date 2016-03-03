package com.java.method;

/*
 * 阶乘 
 *  一个正整数的阶乘（英语：factorial）是所有小于及等于该数的正整数的积，并且有0的阶乘为1。自然数n的阶乘写作n!。
 *   亦即n!=1×2×3×...×n。阶乘亦可以递归方式定义：0!=1，n!=(n-1)!×n。
 * 
 * 
 */
public class Factorial {
	
	public static long factorial(long num){
		if(num<=1){
			return num;
		}else{
			return num*factorial(num-1);//递归调用
		}		
	}
	
	public static void main(String[] args) {
		for(int i=0;i<=10;i++){
			System.out.printf("%d! = %d\n", i,factorial(i));
			System.out.println();
		}
	}

}
