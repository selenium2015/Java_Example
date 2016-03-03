package com.java.exception;

/**
 * 自定义异常 
 * 通过继承 Exception 来实现自定义异常
 * 
 * @author Administrator
 *
 */
public class Input {
	
	void method() throws WrongInputException{
		throw new WrongInputException("Wrong input");
	}

}
