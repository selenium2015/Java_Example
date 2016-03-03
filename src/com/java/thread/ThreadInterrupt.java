package com.java.thread;
/**
 * ��ֹ�߳�
 * Java��ԭ����Thread���ṩ��stop()��������ֹ�̣߳�����������ǲ���ȫ�ģ�����һ�㲻����ʹ�á�
 * ����ʹ��interrupt�����ж��̡߳�
 * 
 * ʹ��interrupt�������ն��߳̿ɷ�Ϊ���������
 * 	��1���̴߳�������״̬����ʹ����sleep������ 
 * 	��2��ʹ��while����isInterrupted������{����}���ж��߳��Ƿ��жϡ�
 * 
 * �ڵ�һ�������ʹ��interrupt������sleep�������׳�һ��InterruptedException����
 * ���ڵڶ���������߳̽�ֱ���˳���
 * 
 * ����Ĵ�����ʾ���ڵ�һ�������ʹ��interrupt������
 * 
 * @author Administrator
 *
 */
public class ThreadInterrupt extends Thread {
	public void run() {
		try {
			sleep(50000); // �ӳ�50��
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) throws Exception {
		Thread thread = new ThreadInterrupt();
		thread.start();
		System.out.println("��50��֮�ڰ�������ж��߳�!");
		System.in.read();
		thread.interrupt();
		thread.join();
		System.out.println("�߳��Ѿ��˳�!");
	}
}
