package com.java.dataStructure;

import java.util.Collections;
import java.util.Vector;

/**
 * 
 * ��ת���� 
 * ʹ�� swap() ��������ת����
 * ��ָ������λ�õ�Ԫ�ؽ��л���λ�ã�
 * 
 * @author Administrator
 * 
 */
public class VectorSwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v = new Vector();
		v.add("1");
		v.add("2");
		v.add("3");
		v.add("4");
		v.add("5");
		
		System.out.println(v);
		Collections.swap(v, 0, 4);
		System.out.println("��ת��");
		System.out.println(v);
	}

}
