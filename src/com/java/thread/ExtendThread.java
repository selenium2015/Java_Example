package com.java.thread;

/**
 * ͨ���̳�Thread�������߳�
 * 
 * 
 * @author Administrator
 * 
 */
public class ExtendThread {
	public static void main(String args[]) {
		new NewThread(); // ����һ�����߳�
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
