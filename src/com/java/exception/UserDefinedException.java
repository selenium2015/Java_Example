package com.java.exception;

/**
 * �Զ����쳣 
 * ͨ���̳� Exception ��ʵ���Զ����쳣
 * 
 * @author Administrator
 *
 */
public class UserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new Input().method();
		} catch (WrongInputException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());//���ع��ڷ������쳣����ϸ��Ϣ��
		}
	}

}
