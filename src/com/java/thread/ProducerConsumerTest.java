package com.java.thread;
/**
 * ������/���������� 
 * �����ߺ��������������߳�ģ���еľ������⣺
 * 	�����ߺ���������ͬһʱ����ڹ���ͬһ���洢�ռ䣬����ͼ��ʾ����������ռ��������ݣ���������ȡ������
 * 	���������Э�����ܻ�������������
 * 		�洢�ռ���������������ռ�������������ߵ����������ó��ռ�Ӷ�ȥ����Ʒ�������ߵ������������Ѳ�Ʒ���Ӷ���ռ�����Ӳ�Ʒ������ȴ����Ӷ�����������
 * 
 * @author Administrator
 *
 */
public class ProducerConsumerTest {
	
	public static void main(String[] args) {
		CubbyHole c = new CubbyHole();
		Producer p1 = new Producer(c, 1);
		Consumer c1 = new Consumer(c, 1);
		p1.start();
		c1.start();
	}
}

class CubbyHole {
	private int contents;
	private boolean available = false;

	public synchronized int get() {
		while (available == false) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		available = false;
		notifyAll();
		return contents;
	}

	public synchronized void put(int value) {
		while (available == true) {
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		contents = value;
		available = true;
		notifyAll();
	}
}
