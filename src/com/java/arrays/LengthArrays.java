package com.java.arrays;

/*
 * ��ȡ���鳤��
 * ʹ����������� length ����ȡ����ĳ���
 * ���ڶ�ά���鳤�Ȼ�ȡ��array[0].length��
 * 
 */
public class LengthArrays {
	public static void main(String[] args) {
		String[][] data=new String[2][5];
	    System.out.println("��һά���鳤��: " + data.length);
	    System.out.println("�ڶ�ά���鳤��: "+data[0].length);
	}

}
