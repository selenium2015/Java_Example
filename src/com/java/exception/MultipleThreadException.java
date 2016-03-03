package com.java.exception;

/**
 * 多线程异常处理 
 * 
 * @author Administrator
 *
 */
public class MultipleThreadException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread mt=new MyThread();
		mt.start();
		try {
			mt.sleep(1000);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			e.printStackTrace();
		}
	}

}
