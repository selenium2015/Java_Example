package com.java.string;

/*
 *  ɾ���ַ����е�һ���ַ�
 *  ͨ���ַ������� substring() ������ɾ���ַ����е�һ���ַ�
 *  ���Զ��巽����ʵ�ָù��ܣ��˴������ܷ�װ�� removeCharAt �����С�
 * 
 */

public class DeleteOneCharacter {
	public static void main(String[] args) {
		String str ="hellol World!";
		
		//���Σ�ָ����Ҫɾ���ַ���λ��
		System.out.println(removeCharAt(5,str));
	}
	
	//�Զ��巽��ʵ��ɾ���ַ����е�һ���ַ�����
	//1.�ָ�ԭ�ַ���Ϊ�����ַ�����2.ƴ�������ַ����������ء�
	public static String removeCharAt(int pos,String s){
		return (s.substring(0, pos)+s.substring(pos+1));
	}

}
