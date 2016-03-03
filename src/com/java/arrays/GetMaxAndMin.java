package com.java.arrays;

import java.util.Arrays;
import java.util.Collections;

/*
 * �����ȡ������Сֵ 
 * ͨ�� Collection ��� Collections.max() �� Collections.min() ���������������е�������Сֵ
 * 
 * ��Ҳ��ͨ�������ȡ��һ�������һ��ֵ����ȡ��
 */
public class GetMaxAndMin {
	public static void main(String[] args) {
	      Integer[] numbers = { 8, 2, 7, 1, 4, 9, 5};
	      
	      int max = (int)Collections.max(Arrays.asList(numbers));
	      int min = (int)Collections.min(Arrays.asList(numbers));
	      System.out.println("��Сֵ: " + min);
	      System.out.println("���ֵ: " + max);
	}

}
