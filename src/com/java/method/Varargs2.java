package com.java.method;

/*
 * ����(overloading)������ʹ�� Varargs
 * 
 */
public class Varargs2 {
	
	static void varTest(int... no){
		System.out.print("varTest(int...): " + "��������: " + no.length +"�� ����: ");
		for(int i:no){
			System.out.print(i+"   ");
		}
		System.out.println();
	}
	
	static void varTest(boolean... bo){
		System.out.print("varTest(int...): " + "��������: " + bo.length +"�� ����: ");
		for(boolean b:bo){
			System.out.print(b+"   ");
		}
		System.out.println();
	}
	
	static void varTest(String... str){
		System.out.print("varTest(int...): " + "��������: " + str.length +"�� ����: ");
		for(String s:str){
			System.out.print(s+"   ");
		}
		System.out.println();
	}	
	
	public static void main(String[] args) {
		varTest(1,2,3);
		varTest(true,false,false);
		varTest("1","��","three");

	}
}
