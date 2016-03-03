package com.java.thread;
/**
 * ������/���������� 
 *  �����ߺ��������������߳�ģ���еľ������⣺
 * 	�����ߺ���������ͬһʱ����ڹ���ͬһ���洢�ռ䣬����ͼ��ʾ����������ռ��������ݣ���������ȡ������
 * 	���������Э�����ܻ�������������
 * 		�洢�ռ���������������ռ�������������ߵ����������ó��ռ�Ӷ�ȥ����Ʒ�������ߵ������������Ѳ�Ʒ���Ӷ���ռ�����Ӳ�Ʒ������ȴ����Ӷ�����������
 * 
 * @author Administrator
 *
 */
public class Producer extends Thread {
	private CubbyHole cubbyhole;
	private int number;

	public Producer(CubbyHole c, int number) {
		cubbyhole = c;
		this.number = number;
	}

	public void run() {
		for (int i = 0; i < 10; i++) {
			cubbyhole.put(i);
			System.out.println("������ #" + this.number + " put: " + i);
			try {
				sleep((int) (Math.random() * 100));
			} catch (InterruptedException e) {
			}
		}
	}
}
