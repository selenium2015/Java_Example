package com.java.thread;
/**
 * ������������� 
 * 
 * 
 */
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class LockAa implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			System.out.println(new Date().toString() + " LockA ��ʼִ��");
			while (true) {
				if (UnLockTest.a1.tryAcquire(1, TimeUnit.SECONDS)) {
					System.out.println(new Date().toString() + " LockA ��ס obj1");
					if (UnLockTest.a2.tryAcquire(1, TimeUnit.SECONDS)) {
						System.out.println(new Date().toString()+ " LockA ��ס obj2");
						Thread.sleep(60 * 1000); // do something
					} else {
						System.out.println(new Date().toString()+ "LockA �� obj2 ʧ��");
					}
				} else {
					System.out.println(new Date().toString()+ "LockA �� obj1 ʧ��");
				}
				UnLockTest.a1.release(); // �ͷ�
				UnLockTest.a2.release();
				Thread.sleep(1000); // ���Ͻ��г��ԣ���ʵ�����do something�ǲ�ȷ����
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
