package com.java.exception;

/*
 * 异常处理方法 
 * 使用 System 类的 System.err.println() 来展示异常的处理方法
 * (syse)
 * 
 */

public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			throw new Exception("My Exception");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("Caught Exception");
			System.err.println("getMessage():" + e.getMessage());//返回关于发生的异常的详细信息
			System.err.println("getLocalizedMessage():"+ e.getLocalizedMessage());//本地描述
			System.err.println("toString():" + e);
			System.err.println("printStackTrace():");
			e.printStackTrace();//打印toString()结果和栈层次到System.err，即错误输出流。
		}
	}

}
