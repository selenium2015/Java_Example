package com.java.arrays;

import java.util.Arrays;

/*
 * �ж������Ƿ���� 
 * ʹ��Arrays.equals ()�������ж������Ƿ����
 * 
 */
public class Equals {
	public static void main(String[] args) {
		int[] array1={1,2,3,4,5};
		int[] array2={1,2,3,4,5};
		int[] array3={1,2,3,4};
		
		System.out.println(Arrays.equals(array1, array2));
		System.out.println(Arrays.equals(array1, array3));
		
	}

}
