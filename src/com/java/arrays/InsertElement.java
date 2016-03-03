package com.java.arrays;

import java.util.Arrays;

/*
 * �������Ԫ��
 * ʹ�� insertElement () �������������Ԫ�أ��Զ��巽����
 * 
 */
public class InsertElement {
	public static void main(String[] args) {
		int[] array={2,5,-2,6,-3,8,0,-7,-9,4 };
		
		//ʹ��sort����������������
		Arrays.sort(array);		
		SortArrays.printArray(array);//����SortArrays���printArray�������������
		
		//����Ԫ��
		array=insertElement(array,1,3);
		System.out.print("����Ԫ�غ�����飺");
		SortArrays.printArray(array);
		
	}
	
	//�Զ��巽����ʵ�����������Ԫ��
	 public static int[] insertElement(int original[], int element, int index) {//ԭ�����飬Ҫ�����Ԫ�أ�Ҫ�����λ��
		 int length = original.length;
		 int destination[] = new int[length + 1];//Ŀ�����飬���ȱ�ԭ������+1
		 
		 System.arraycopy(original, 0, destination, 0, index);//���鸴�ƣ�ԭ���飬ԭ���鿪ʼλ�ã�Ŀ�����飬Ŀ�����鿪ʼλ�ã�Ҫ���Ƶĳ���
		 
		 destination[index] = element;//��Ҫ�����Ԫ�ظ�ֵ��Ŀ�������ָ��λ��
		 
		 System.arraycopy(original, index, destination, index+ 1, length - index);//���鸴�ƣ�����λ�õĺ���
		 
		 return destination;
  }

}
