package com.java.exception;

/**
 * 自定义异常 
 * 通过继承 Exception 来实现自定义异常
 * 
 * @author Administrator
 *
 */
public class UserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new Input().method();
		} catch (WrongInputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());//返回关于发生的异常的详细信息。
		}
	}

}
