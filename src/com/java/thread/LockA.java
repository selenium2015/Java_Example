package com.java.thread;
/**
 * ������������� 
 * 
 * 
 */
import java.util.Date;

public class LockA implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println(new Date().toString() + " LockA ��ʼִ��");
			while (true) {
				synchronized (LockTest.obj1) {
					System.out.println(new Date().toString() + " LockA ��ס obj1");
					Thread.sleep(3000); // �˴��ȴ��Ǹ�B����ס����
					
					synchronized (LockTest.obj2) {
						System.out.println(new Date().toString()+ " LockA ��ס obj2");
						Thread.sleep(60 * 1000); // Ϊ���ԣ�ռ���˾Ͳ���
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
