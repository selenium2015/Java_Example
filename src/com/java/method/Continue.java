package com.java.method;

/*
 * continue �ؼ����÷�
 * continue ����������������ǰѭ������������һ��ѭ������������һ��ѭ�������ˣ���������ѭ�������ˣ���ߵ�ѭ�����ɽ��С�
 * 
 */
public class Continue {
	public static void main(String[] args) {
		StringBuffer searchstr = new StringBuffer("hello how are you. ");
		int length = searchstr.length();
		int count = 0;
		for (int i = 0; i < length; i++) {
			if (searchstr.charAt(i) != 'h')
				continue;//������ǰѭ���󣬼���forѭ��
			count++;
			searchstr.setCharAt(i, 'h');//��iλ�õ����ݱ�Ϊchar����'h'
		}
		System.out.println("���� " + count + " �� h �ַ�");
		System.out.println(searchstr);
	}

}
