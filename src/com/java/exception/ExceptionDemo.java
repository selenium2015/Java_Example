package com.java.exception;

/*
 * �쳣������ 
 * ʹ�� System ��� System.err.println() ��չʾ�쳣�Ĵ�����
 * (syse)
 * 
 */

public class ExceptionDemo {
	public static void main(String[] args) {
		try {
			throw new Exception("My Exception");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.err.println("Caught Exception");
			System.err.println("getMessage():" + e.getMessage());//���ع��ڷ������쳣����ϸ��Ϣ
			System.err.println("getLocalizedMessage():"+ e.getLocalizedMessage());//��������
			System.err.println("toString():" + e);
			System.err.println("printStackTrace():");
			e.printStackTrace();//��ӡtoString()�����ջ��ε�System.err���������������
		}
	}

}
