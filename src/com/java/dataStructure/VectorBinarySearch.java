package com.java.dataStructure;

import java.util.Collections;
import java.util.Vector;

/**
 * 
 * ��ȡ����Ԫ�ص�����ֵ ʹ�� Collections ��� sort() ������������������ ��ʹ�� binarySearch()
 * ��������ȡ����Ԫ�ص�����ֵ
 * 
 * @author Administrator
 * 
 */
public class VectorBinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector();
		v.add("X");
		v.add("M");
		v.add("D");
		v.add("A");
		v.add("O");
		
		System.out.println("����ǰ��"+v);
		Collections.sort(v);
		System.out.println("�����"+v);
		
		int index=Collections.binarySearch(v, "M");
		System.out.println(index);
		
		
	}

}
