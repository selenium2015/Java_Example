package com.java.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * ����ϲ� 
 * ͨ�� List ��� Arrays.toString () ������ List ��� list.Addall(array1.asList(array2) ��������������ϲ�Ϊһ������
 * 
 */
public class Merge {
	public static void main(String[] args) {
	      String a[] = { "A", "E", "I" };
	      String b[] = { "O", "U" };
	      
	      List list = new ArrayList(Arrays.asList(a));//Arrays.asList(a)ת���ַ�������ΪList�����
	      
	      list.addAll(Arrays.asList(b));//���ַ�������bת����List�����Ȼ������list��addAll������a��b�������
	      
	      Object[] c = list.toArray();//����Ϻ��List����listת����������󣬸���Object����c
	      
	      System.out.println(Arrays.toString(c));//��Object����cת�����ַ��������ӡ
	}

}
