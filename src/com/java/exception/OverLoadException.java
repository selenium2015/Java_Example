package com.java.exception;
/**
 * 重载方法异常处理 
 * 
 * @author Administrator
 *
 */
public class OverLoadException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println(sayHello(1));
			System.out.println(sayHello("s"));
			System.out.println(sayHello(true));
			System.out.println(sayHello(1,"a"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}

	public static int sayHello(int i){
		return i/0; //ArithmeticException
	}
	
	public static String sayHello(String s){
		return s;
	}
	
	public static boolean sayHello(boolean b){
		return b;
	}
	
	public static int sayHello(int a,String b){
		return a;
	}
}
