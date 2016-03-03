package com.java.thread;

/**
 * �����̲߳���ʼ����ִ�е�ʵ��
 * 
 * 
 * @author Administrator
 * 
 */
public class NewThread implements Runnable {

	Thread t;
	
	//���췽��
	NewThread() {
		// �����ڶ������߳�
		t = new Thread(this, "Demo Thread");  //Thread ���ù��췽��
		System.out.println("Child thread: " + t);
		t.start(); // ��ʼ�߳�
	}

	// �ڶ����߳����
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Child Thread: " + i);
				// ��ͣ�߳�
				Thread.sleep(50);
			}
		} catch (InterruptedException e) {
			System.out.println("Child interrupted.");
		}
		System.out.println("Exiting child thread.");
	}
}
