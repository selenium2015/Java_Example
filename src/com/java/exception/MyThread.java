package com.java.exception;

/**
 * 多线程异常处理方法
 * 
 * @author Administrator
 *
 */
public class MyThread extends Thread{
	
	public void run(){
		System.out.println("Throwing in " +"MyThread");
		throw new RuntimeException();//运行时异常： 运行时异常是可能被程序员避免的异常。与检查性异常相反，运行时异常可以在编译时被忽略。
	}
}
