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
public class Consumer extends Thread {
	private CubbyHole cubbyhole;
	private int number;

	public Consumer(CubbyHole c, int number) {
		cubbyhole = c;
		this.number = number;
	}

	public void run() {
		int value = 0;
		for (int i = 0; i < 10; i++) {
			value = cubbyhole.get();
			System.out.println("������ #" + this.number + " got: " + value);
		}
	}
}
