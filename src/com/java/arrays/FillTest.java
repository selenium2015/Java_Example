package com.java.arrays;

import java.util.Arrays;

/*
 * �������
 * ͨ�� Java Util ��� Arrays.fill(arrayname,value) ������ Arrays.fill(arrayname ,starting index ,ending index ,value) ���������������Ԫ��
 * 
 */
public class FillTest {
	public static void main(String[] args) {
		int[] array=new int[6];
		
		Arrays.fill(array, 100);//ȫ��Ԫ��ֵ��Ϊ100
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
		System.out.println();
		
		Arrays.fill(array, 3, 6, 50);//��λ��3��6�����ֵΪ50
		for(int i=0;i<array.length;i++){
			System.out.println(array[i]);
		}
	}

}