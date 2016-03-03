package com.java.thread;

/**
 * ͨ���̳�Thread�������߳�
 * 
 * 
 * @author Administrator
 * 
 */
public class NewThread2 extends Thread {
	
	NewThread2() {
		// �����ڶ������߳�
		super("Demo Thread");
		System.out.println("Child thread: " + this);
		start(); // ��ʼ�߳�
	}

	// �ڶ����߳����
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Child Thread: " + i);
				// ���߳�����һ��
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			System.out.println("Child interrupted.");
		}
		System.out.println("Exiting child thread.");
	}
}
