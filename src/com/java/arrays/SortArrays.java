package com.java.arrays;

import java.util.Arrays;

/*
 * ��������Ԫ�ز���
 * ʹ��sort()������Java����������򣨴�С����
 * ʹ�� binarySearch() ���������������е�Ԫ�أ�����Ԫ�ص�����λ�ã�
 * 
 */
public class SortArrays {
	public static void main(String[] args) {
		int[] array={2,5,-2,6,-3,8,0,-7,-9,4 };
		
		//ʹ��sort����������������
		Arrays.sort(array);
		printArray(array);
		
		//����������Ԫ�ص�λ��
		int index=Arrays.binarySearch(array, -2);
		System.out.println("Ԫ�� -2 �������е�λ��Ϊ��"+index);
	}
	
	//printArray�������������
	public static void printArray(int[] array){
		for(int i=0;i<array.length;i++){
			if(i!=0){
				System.out.print(",");//ʹ�����������ͬһ�У����ö̺ţ��������
			}
			System.out.print(array[i]);
		}
		System.out.println();
	}
}
