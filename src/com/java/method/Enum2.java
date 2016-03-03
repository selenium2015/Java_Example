package com.java.method;

/*
 * Enum（枚举）构造函数及方法的使用 
 * 
 */
public class Enum2 {
	public static void main(String[] args) {
		System.out.println("所有汽车的价格：	");
		
		for(Car2 c: Car2.values()){//枚举类型的值属于数组
			System.out.println(c+" 需要"+c.getPrice()+" 千美元。");
		}
	}

}
