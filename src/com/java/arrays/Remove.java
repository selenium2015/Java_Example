package com.java.arrays;

import java.util.ArrayList;

/*
 * ɾ������Ԫ��
 * ʹ�� remove () ������ɾ������Ԫ�� 
 * 
 */
public class Remove {
	public static void main(String[] args) {
		ArrayList objArray=new ArrayList();
		
		objArray.clear();//���list�е�����Ԫ��
		objArray.add(0, "��һ��Ԫ��");//λ�ã�Ԫ��ֵ
		objArray.add(1, "�ڶ���Ԫ��");
		objArray.add(2, "������Ԫ��");
		
	    System.out.println("����ɾ��Ԫ��ǰ��"+objArray);
	    
	    objArray.remove(1);//ɾ��λ��Ϊ1��Ԫ��
	    objArray.remove("0th element");//ɾ��Ԫ�أ�0th element���������ʱ
	    
	    System.out.println("����ɾ��Ԫ�غ�"+objArray);
	}

}
