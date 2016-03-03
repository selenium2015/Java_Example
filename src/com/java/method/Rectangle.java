package com.java.method;

/*
 * 方法覆盖override
 * 
 * 子类(extends继承父类)
 * 
 */

public class Rectangle extends Figure {// 继承父类
	
	Rectangle(double a, double b) {//覆盖父类有参构造（必须，否则报错）
		super(a, b);
	}

	Double area() {//方法覆盖
		System.out.println("Inside area for rectangle.");
		return (dim1 * dim2);
	}

}
