package com.java.thread;
/**
 * �ж��߳� 
 * ʹ��interrupt()�������ж��̲߳�ʹ�� isInterrupted() �������ж��߳��Ƿ����ж�
 * 
 * 
 * @author Administrator
 *
 */
public class Interrupt extends Object implements Runnable {
	
	public void run() {//��дRunnable�ӿڷ���
		try {
			System.out.println("in run() - ������ work2() ����");
			work2();
			System.out.println("in run() - �� work2() ��������");
		} catch (InterruptedException x) {
			System.out.println("in run() - �ж� work2() ����");
			return;
		}
		System.out.println("in run() - ���ߺ�ִ��");
		System.out.println("in run() - �����뿪");
	}

	public void work2() throws InterruptedException {
		while (true) {
			if (Thread.currentThread().isInterrupted()) {
				System.out.println("C isInterrupted()="	+ Thread.currentThread().isInterrupted());
				Thread.sleep(2000);
				System.out.println("D isInterrupted()="	+ Thread.currentThread().isInterrupted());
			}
		}
	}

	public void work() throws InterruptedException {
		while (true) {
			for (int i = 0; i < 100000; i++) {
				int j = i * 2;
			}
			System.out.println("A isInterrupted()="	+ Thread.currentThread().isInterrupted());
			if (Thread.interrupted()) {
				System.out.println("B isInterrupted()="	+ Thread.currentThread().isInterrupted());
				throw new InterruptedException();
			}
		}
	}

	public static void main(String[] args) {
		Interrupt si = new Interrupt();
		Thread t = new Thread(si);
		t.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException x) {
			
		}
		System.out.println("in main() - �ж������߳�");
		t.interrupt();//Interrupts this thread. 
		System.out.println("in main() - �뿪");
	}
}
