package com.java.thread;

/**
 * ��ȡ�߳�״̬ 
 * Java�е��̵߳��������ڴ���ɷ�Ϊ5��״̬��
 * 	1. �½�״̬��New�����´�����һ���̶߳���
 * 	2. ����״̬��Runnable�����̶߳��󴴽��������̵߳����˸ö����start()��������״̬���߳�λ�ڿ������̳߳��У���ÿ����У��ȴ���ȡCPU��ʹ��Ȩ��
 * 	3. ����״̬��Running��������״̬���̻߳�ȡ��CPU��ִ�г�����롣
 * 	4. ����״̬��Blocked��������״̬���߳���Ϊĳ��ԭ�����CPUʹ��Ȩ����ʱֹͣ���С�ֱ���߳̽������״̬�����л���ת������״̬����������������֣�
 * 		��һ�����ȴ����������е��߳�ִ��wait()������JVM��Ѹ��̷߳���ȴ����С�
 * 		��������ͬ�����������е��߳��ڻ�ȡ�����ͬ����ʱ������ͬ����������߳�ռ�ã���JVM��Ѹ��̷߳��������С�
 * 		���������������������е��߳�ִ��sleep()��join()���������߷�����I/O����ʱ��JVM��Ѹ��߳���Ϊ����״̬����sleep()״̬��ʱ��join()�ȴ��߳���ֹ���߳�ʱ������I/O�������ʱ���߳�����ת�����״̬��
 * 	5. ����״̬��Dead�����߳�ִ�����˻������쳣�˳���run()���������߳̽����������ڡ�
 * 
 * http://www.runoob.com/java/thread-status.html
 * 
 * @author Administrator
 *
 */
public class GetThreadStatus extends Thread {
	boolean waiting = true;
	boolean ready = false;

	GetThreadStatus() {
		
	}

	public void run() {
		String thrdName = Thread.currentThread().getName();
		System.out.println(thrdName + " ����");
		while (waiting)
			System.out.println("�ȴ���" + waiting);
		System.out.println("�ȴ�...");
		startWait();
		try {
			Thread.sleep(1000);
		} catch (Exception exc) {
			System.out.println(thrdName + " �жϡ�");
		}
		System.out.println(thrdName + " ������");
	}

	synchronized void startWait() {
		try {
			while (!ready)
				wait();
		} catch (InterruptedException exc) {
			System.out.println("wait() �жϡ�");
		}
	}

	synchronized void notice() {
		ready = true;
		notify();
	}
}