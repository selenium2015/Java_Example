package com.java.thread;
/**
 * 获取所有线程 
 * 使用 getName() 方法获取所有正在运行的线程
 * 
 * 
 * @author Administrator
 *
 */
public class GetAllThreads extends Thread {
	public static void main(String[] args) {
		GetAllThreads t1 = new GetAllThreads();
		t1.setName("thread1");
		t1.start();
		
		ThreadGroup currentGroup = Thread.currentThread().getThreadGroup();
		
		int noThreads = currentGroup.activeCount();//Returns an estimate of the number of active threads in this thread group and its subgroups. 
		
		Thread[] lstThreads = new Thread[noThreads];
		
		currentGroup.enumerate(lstThreads);//Copies into the specified array every active thread in this thread group and its subgroups. 
		
		for (int i = 0; i < noThreads; i++)
			System.out.println("线程号：" + i + " = " + lstThreads[i].getName());
	}
}
