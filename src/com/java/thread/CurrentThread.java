package com.java.thread;

/**
 * 
 * �鿴�߳��Ƿ��� 
 * ͨ���̳�Thread�ಢʹ��currentThread()���������һ���߳��Ƿ���
 * 
 * 
 * ��ȡ��ǰ�߳����� 
 * ͨ���̳� Thread �ಢʹ�� getName() ��������ȡ��ǰ�߳�����
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
