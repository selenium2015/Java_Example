package com.java.exception;

/**
 * ���߳��쳣������
 * 
 * @author Administrator
 *
 */
public class MyThread extends Thread{
	
	public void run(){
		System.out.println("Throwing in " +"MyThread");
		throw new RuntimeException();//����ʱ�쳣�� ����ʱ�쳣�ǿ��ܱ�����Ա������쳣���������쳣�෴������ʱ�쳣�����ڱ���ʱ�����ԡ�
	}
}
