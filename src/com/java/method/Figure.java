package com.java.method;

/*
 * 方法覆盖override
 * 
 * 父类
 * 
 */

public class Figure {
	double dim1;
	double dim2;

	Figure(double a, double b) {//有参构造函数
		dim1 = a;
		dim2 = b;
	}

	Double area() {
		System.out.println("Inside area for figure.");
		return (dim1 * dim2);
	}
}
