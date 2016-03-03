package com.java.thread;

/**
 * 
 * 状态监测 通过继承 Thread 类并使用 currentThread.getName() 方法来监测线程的状态
 * 
 * 
 * @author Administrator
 * 
 */
public class ThreadStatusMonitor {
	public static void main(String args[]) throws Exception {
		MyThread thrd = new MyThread();
		thrd.setName("MyThread #1");
		showThreadStatus(thrd);
		
		thrd.start();
		Thread.sleep(50);
		showThreadStatus(thrd);
		
		thrd.waiting = false;
		Thread.sleep(50);
		showThreadStatus(thrd);
		
		thrd.notice();
		Thread.sleep(50);
		showThreadStatus(thrd);
		
		while (thrd.isAlive())
			System.out.println("alive");
		showThreadStatus(thrd);
	}

	static void showThreadStatus(Thread thrd) {
		System.out.println(thrd.getName() + "Alive:=" + thrd.isAlive()
				+ " State:=" + thrd.getState());
	}

}
