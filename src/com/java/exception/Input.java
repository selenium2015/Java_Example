package com.java.exception;

/**
 * �Զ����쳣 
 * ͨ���̳� Exception ��ʵ���Զ����쳣
 * 
 * @author Administrator
 *
 */
public class Input {
	
	void method() throws WrongInputException{
		throw new WrongInputException("Wrong input");
	}

}
