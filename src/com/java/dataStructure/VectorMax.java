package com.java.dataStructure;

import java.util.Collections;
import java.util.Vector;

/**
 * ��ȡ���������Ԫ�� 
 * ʹ�� Vector ��� v.add() ����
 *  Collection ��� Collections.max() ����ȡ���������Ԫ��
 * 
 * @author Administrator
 *
 */
public class VectorMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		
		v.add("3.2");
		v.add("2.2");
		v.add("4.1");
		v.add("3.0");
				
		System.out.println(v);
		
		Object obj=Collections.max(v);//���ö�̬���������ָ���������
		System.out.println(obj);
		
		v.indexOf("2.2");
		
		
	}

}
