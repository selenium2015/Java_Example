package com.java.collection;

import java.util.*;


/**
 * ���ϱȽ� ���ַ���ת��Ϊ���ϲ�ʹ�� Collection ��� Collection.min() �� Collection.max() ���Ƚϼ����е�Ԫ��
 * 
 * 
 * @author Administrator
 * 
 */
public class MaxAndMin {
	public static void main(String[] args) {
		String[] coins = { "Penny", "nickel", "dime", "Quarter", "dollar" };
		
		//TreeSet �̳���AbstractSet��ʹ��Ԫ�ص���Ȼ˳���Ԫ�ؽ�������.
		//AbstractSet  �̳���AbstractCollection ����ʵ���˴󲿷�Set�ӿڡ�
		//AbstractCollection  ʵ���˴󲿷ֵļ��Ͻӿڡ�		
		Set set = new TreeSet(); //Set �̳��� Collection����һ���������ظ�Ԫ�صļ��ϡ�
		for (int i = 0; i < coins.length; i++)
			set.add(coins[i]);
		System.out.println(Collections.min(set));
		////�������򼯺�Ԫ����String���ͣ����������Java APIʵ�ֵ�Comparator<String>����String.CASE_INSENSITIVE_ORDERΪ����Ԫ������
		System.out.println(Collections.min(set, String.CASE_INSENSITIVE_ORDER));//���Դ�Сд����
		
		for (int i = 0; i <= 10; i++)
			System.out.print("-");
		System.out.println("");
		
		System.out.println(Collections.max(set));
		System.out.println(Collections.max(set, String.CASE_INSENSITIVE_ORDER));

	}

}
