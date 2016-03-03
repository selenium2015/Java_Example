package com.java.thread;
/**
 * 生产者/消费者问题 
 *  生产者和消费者问题是线程模型中的经典问题：
 * 	生产者和消费者在同一时间段内共用同一个存储空间，如下图所示，生产者向空间里存放数据，而消费者取用数据
 * 	如果不加以协调可能会出现以下情况：
 * 		存储空间已满，而生产者占用着它，消费者等着生产者让出空间从而去除产品，生产者等着消费者消费产品，从而向空间中添加产品。互相等待，从而发生死锁。
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
			System.out.println("消费者 #" + this.number + " got: " + value);
		}
	}
}
