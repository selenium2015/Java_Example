package com.java.thread;

/**
 * 创建线程并开始让它执行的实例
 * 
 * 
 * @author Administrator
 * 
 */
public class NewThread implements Runnable {

	Thread t;
	
	//构造方法
	NewThread() {
		// 创建第二个新线程
		t = new Thread(this, "Demo Thread");  //Thread 常用构造方法
		System.out.println("Child thread: " + t);
		t.start(); // 开始线程
	}

	// 第二个线程入口
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Child Thread: " + i);
				// 暂停线程
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			System.out.println("Child interrupted.");
		}
		System.out.println("Exiting child thread.");
	}
}
