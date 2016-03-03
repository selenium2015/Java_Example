package com.java.exception;

/**
 *  自定义异常 
 * 通过继承 Exception 来实现自定义异常
 * 
 * @author Administrator
 *
 */
public class WrongInputException extends Exception {
	
	WrongInputException(String s){
		super(s);
	}

}
