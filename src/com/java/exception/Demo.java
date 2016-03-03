package com.java.exception;

/*
 * 多个异常处理（多个catch）
 * 对异常的处理:
 * 1.声明异常时，建议声明更为具体的异常，这样可以处理的更具体
 * 2.对方声明几个异常，就对应几个catch块， 如果多个catch块中的异常出现继承关系，父类异常catch块放在最下面
 * 
 */

public class Demo {
	int div(int a, int b) throws ArithmeticException,
			ArrayIndexOutOfBoundsException// 在功能上通过throws的关键字声明该功能可能出现问题
	{
		int[] arr = new int[a];

		System.out.println(arr[4]);// 制造的第一处异常

		return a / b;// 制造的第二处异常
	}
}