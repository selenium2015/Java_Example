package com.java.thread;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * �������������
 * 
 * 
 */
public class LockBb implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println(new Date().toString() + " LockB ��ʼִ��");
			while (true) {
				if (UnLockTest.a2.tryAcquire(1, TimeUnit.SECONDS)) {
					System.out.println(new Date().toString() + " LockB ��ס obj2");
					if (UnLockTest.a1.tryAcquire(1, TimeUnit.SECONDS)) {
						System.out.println(new Date().toString()+ " LockB ��ס obj1");
						Thread.sleep(60 * 1000); // do something
					} else {
						System.out.println(new Date().toString()+ "LockB �� obj1 ʧ��");
					}
				} else {
					System.out.println(new Date().toString()+ "LockB �� obj2 ʧ��");
				}
				UnLockTest.a1.release(); // �ͷ�
				UnLockTest.a2.release();
				Thread.sleep(10 * 1000); // ����ֻ��Ϊ����ʾ������tryAcquireֻ��1�룬����BҪ��A�ó���ִ�е�ʱ�䣬����������Զ������
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
