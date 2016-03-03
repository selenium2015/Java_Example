package com.java.method;

/*
 * 方法覆盖 Overriding（重写？）
 * 	如果在子类中定义一个方法，其名称、返回类型及参数签名正好与父类中某个方法的名称、返回类型及参数签名相匹配，那么可以说，子类的方法覆盖了父类的方法。 
 * 
 */
public class Overriding {
	public static void main(String[] agrs) {
		Figure f = new Figure(10, 10);
		Rectangle r = new Rectangle(9, 5);
		Figure figref;
		figref = f;
		System.out.println("Area is :" + figref.area());
		figref = r;
		System.out.println("Area is :" + figref.area());
	}
}
