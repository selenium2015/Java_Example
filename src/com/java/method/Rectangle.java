package com.java.method;

/*
 * ��������override
 * 
 * ����(extends�̳и���)
 * 
 */

public class Rectangle extends Figure {// �̳и���
	
	Rectangle(double a, double b) {//���Ǹ����вι��죨���룬���򱨴�
		super(a, b);
	}

	Double area() {//��������
		System.out.println("Inside area for rectangle.");
		return (dim1 * dim2);
	}

}
