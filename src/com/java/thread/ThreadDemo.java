package com.java.thread;

/**
 * 创建线程并开始让它执行的实例
 * 
 * 
 * @author Administrator
 * 
 */
public class ThreadDemo {
	public static void main(String args[]) {
		new NewThread(); // 创建一个新线程
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Main Thread: " + i);
				Thread.sleep(100);
			}
		} catch (InterruptedException e) {
			System.out.println("Main thread interrupted.");
		}
		System.out.println("Main thread exiting.");
	}
}
