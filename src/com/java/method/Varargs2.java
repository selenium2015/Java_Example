package com.java.method;

/*
 * 重载(overloading)方法中使用 Varargs
 * 
 */
public class Varargs2 {
	
	static void varTest(int... no){
		System.out.print("varTest(int...): " + "参数个数: " + no.length +"； 内容: ");
		for(int i:no){
			System.out.print(i+"   ");
		}
		System.out.println();
	}
	
	static void varTest(boolean... bo){
		System.out.print("varTest(int...): " + "参数个数: " + bo.length +"； 内容: ");
		for(boolean b:bo){
			System.out.print(b+"   ");
		}
		System.out.println();
	}
	
	static void varTest(String... str){
		System.out.print("varTest(int...): " + "参数个数: " + str.length +"； 内容: ");
		for(String s:str){
			System.out.print(s+"   ");
		}
		System.out.println();
	}	
	
	public static void main(String[] args) {
		varTest(1,2,3);
		varTest(true,false,false);
		varTest("1","二","three");

	}
}
