package com.java.arrays;

/*
 * ��������
 * �������ʼ���������������ݣ�����arraycopy������
 * ���ȸ�ֵ���ٸ��ƣ�
 */
public class Extend {
	public static void main(String[] args) {
		String[] names=new String[]{"A","B","C"};
		String[] extended=new String[names.length+2];
		extended[3]="D";
		extended[4]="E";
		
		System.arraycopy(names, 0, extended, 0, names.length);//���鸴��
		
		for(String str :extended){//for eachѭ��
			System.out.println(str);
		}
	}
}
