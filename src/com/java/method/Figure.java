package com.java.method;

/*
 * ��������override
 * 
 * ����
 * 
 */

public class Figure {
	double dim1;
	double dim2;

	Figure(double a, double b) {//�вι��캯��
		dim1 = a;
		dim2 = b;
	}

	Double area() {
		System.out.println("Inside area for figure.");
		return (dim1 * dim2);
	}
}
