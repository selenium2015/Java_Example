package com.java.collection;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * ����ת����
 * ʹ�� Java Util ��� Arrays.asList(name) ����������ת��Ϊ����
 * 
 * 
 * ����ת���� 
 * ʹ�� Java Util ��� list.add() �� list.toArray() ����������תΪ����
 * 
 * @author Administrator
 *
 */
public class ArrayToCollection {
	public static void main(String[] args) {

		String[] str=new String[5];
		
		for(int i=0;i<5;i++){
			str[i]=String.valueOf(i);//����ת��Ϊ�ַ�����			
		}
		
		List<String> list=Arrays.asList(str);
		System.out.println();
		
		for(String s:list){
			System.out.print(s+" ");
		}
		
	}

}
