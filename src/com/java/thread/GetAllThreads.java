package com.java.thread;
/**
 * ��ȡ�����߳� 
 * ʹ�� getName() ������ȡ�����������е��߳�
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
			System.out.println("�̺߳ţ�" + i + " = " + lstThreads[i].getName());
	}
}
