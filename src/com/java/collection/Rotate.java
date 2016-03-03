package com.java.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 
 * List ѭ���ƶ�Ԫ�� 
 * ʹ�� Collections ��� rotate() ��ѭ���ƶ�Ԫ�أ������ڶ�������ָ�����ƶ�����ʼλ��
 * (rotate ��ʹĳ� ��ת)
 * 
 * ���� List �е������Сֵ 
 * ʹ�� Collections ��� max() �� min() ��������ȡList�������Сֵ
 * 
 * @author Administrator
 *
 */
public class Rotate {
	public static void main(String[] args) {
		List list=Arrays.asList("one two three four five six".split(" "));
		
		System.out.println(list);
		
		System.out.println("list�����ֵ��"+Collections.max(list));
		System.out.println("list�����ֵ��"+Collections.min(list));
		
		Collections.rotate(list, 5);//����ͨ��ָ���ľ��������תָ���б��е�Ԫ��
		//�Ӻ����Ԫ���ƶ�����ͷλ�ã�  ѭ���ƶ����ƶ�N�Σ���N����list����ʱ����ԭԪ��һ��
		
		System.out.println(list);
		
	}

}
