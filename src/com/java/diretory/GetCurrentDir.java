package com.java.diretory;

/*
 * 	�鿴��ǰ����Ŀ¼ 
 * 	ʹ�� System �� getProperty() ��������ȡ��ǰ�Ĺ���Ŀ¼
 * 
 */
public class GetCurrentDir {
	public static void main(String[] args) {
		String str = System.getProperty("user.dir");//user.dir��ʾ�û���ǰĿ¼
		System.out.println("�㵱ǰ�Ĺ���Ŀ¼Ϊ :" + str);
	}

}
