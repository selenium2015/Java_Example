package com.java.exception;

/**
 * ��ʽ�쳣
 * ʹ�ö�� catch �����������쳣
 * 
 * @author Administrator
 * 
 */
public class ChainException {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int n = 20, result = 0;
		try {
			result = n / 0;
			System.out.println("���Ϊ" + result);
		} catch (ArithmeticException ex) {
			System.out.println("�������쳣: " + ex);
			try {
				throw new NumberFormatException();
			} catch (NumberFormatException ex1) {
				System.out.println("�ֶ��׳������쳣 : " + ex1);
			}
		}
	}
}
