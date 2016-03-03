package com.java.thread;
/**
 * 死锁及解决方法 
 * 
 * 
 */
import java.util.concurrent.Semaphore;

public class UnLockTest {
	public static String obj1 = "obj1";
	public static final Semaphore a1 = new Semaphore(1);
	
	public static String obj2 = "obj2";
	public static final Semaphore a2 = new Semaphore(1);

	public static void main(String[] args) {
		LockAa la = new LockAa();
		new Thread(la).start();
		
		LockBb lb = new LockBb();
		new Thread(lb).start();
	}
}
