package com.java.exception;

/**
 * 
 * @author Administrator
 * 
 * ʹ�� catch �����쳣 
 * 
 * ��ȡ�쳣�Ķ�ջ��Ϣ 
 * ʹ���쳣��� printStack() ��������ȡ��ջ��Ϣ
 *
 */
public class CatchTest {

	public static void main(String[] args) {
		int[] array={10,20,30};
		
		try {
			for(int i=0;i<5;i++){
				System.out.println(array[i]);//ѭ�������������鳤�ȣ�����������Ƿ������쳣��ArrayIndexOutOfBoundsException��
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();//��ȡ�쳣�Ķ�ջ��Ϣ 
		}

	}

}
