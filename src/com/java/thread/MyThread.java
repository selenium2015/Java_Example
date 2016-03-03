package com.java.thread;

/**
 * 状态监测 通过继承 Thread 类并使用 currentThread.getName() 方法来监测线程的状态
 * 
 * 
 * @author Administrator
 * 
 */
public class MyThread extends Thread {
	boolean waiting = true;
	boolean ready = false;

	MyThread() {
		
	}

	public void run() {
		String thrdName = Thread.currentThread().getName();
		System.out.println(thrdName + " starting.");
		while (waiting)
			System.out.println("waiting:" + waiting);
		System.out.println("waiting...");
		startWait();
		try {
			Thread.sleep(1000);
		} catch (Exception exc) {
			System.out.println(thrdName + " interrupted.");
		}
		System.out.println(thrdName + " terminating.");
	}

	synchronized void startWait() {//同步的
		try {
			while (!ready)
				wait();
		} catch (InterruptedException exc) {
			System.out.println("wait() interrupted");
		}
	}

	synchronized void notice() {
		ready = true;
		notify();//唤醒线程
	}

}
