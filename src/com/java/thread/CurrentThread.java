package com.java.thread;

/**
 * 
 * 查看线程是否存活 
 * 通过继承Thread类并使用currentThread()方法来检测一个线程是否存活
 * 
 * 
 * 获取当前线程名称 
 * 通过继承 Thread 类并使用 getName() 方法来获取当前线程名称
 * 
 * @author Administrator
 * 
 */
public class CurrentThread extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			printMsg();
		}
	}

	public void printMsg() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println("name=" + name);
//		long id=t.getId();		
//		System.out.println("ThreadID="+id);
	}

	public static void main(String[] args) {
		CurrentThread tt = new CurrentThread();
		tt.setName("Thread");
		System.out.println("before start(), tt.isAlive()=" + tt.isAlive());
		tt.start();
		System.out.println("just after start(), tt.isAlive()=" + tt.isAlive());
		for (int i = 0; i < 10; i++) {
			tt.printMsg();
		}
		System.out.println("The end of main(), tt.isAlive()=" + tt.isAlive());
	}

}
