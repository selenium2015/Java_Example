package com.java.thread;
/**
 * 死锁及解决方法 
 * 
 * 死锁是这样一种情形：多个线程同时被阻塞，它们中的一个或者全部都在等待某个资源被释放。由于线程被无限期地阻塞，因此程序不可能正常终止。

java 死锁产生的四个必要条件：

    1>互斥使用，即当资源被一个线程使用(占有)时，别的线程不能使用
    2>不可抢占，资源请求者不能强制从资源占有者手中夺取资源，资源只能由资源占有者主动释放。
    3>请求和保持，即当资源请求者在请求其他的资源的同时保持对原有资源的战友。
    4>循环等待，即存在一个等待队列：P1占有P2的资源，P2占有P3的资源，P3占有P1的资源。这样就形成了一个等待环路。

当上述四个条件都成立的时候，便形成死锁。当然，死锁的情况下如果打破上述任何一个条件，便可让死锁消失。下面用java代码来模拟一下死锁的产生。

解决死锁问题的方法是：一种是用synchronized，一种是用Lock显式锁实现。

而如果不恰当的使用了锁，且出现同时要锁多个对象时，会出现死锁情况
 * 
 */
public class LockTest {
	public static String obj1 = "obj1";
	public static String obj2 = "obj2";

	public static void main(String[] args) {
		LockA la = new LockA();
		new Thread(la).start();
		
		LockB lb = new LockB();
		new Thread(lb).start();
	}
}
