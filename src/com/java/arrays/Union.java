package com.java.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * ���鲢�� 
 * ʹ�� union ()��������ʾ���鲢��
 * ��ͨ���Զ��巽����ʵ�֣�
 */
public class Union {
	public static void main(String[] args) {
		String[] str1={"1","2","3"};
		String[] str2={"4","5","6"};
		
		String[] unionStr=union(str1,str2);
		
		System.out.println("�������Ϊ��");
		
		for(String us: unionStr){
			System.out.println(us);
		}
	}
	
    // �������ַ�������Ĳ���������set��Ԫ��Ψһ��
	public static String[] union(String[] str1,String[] str2){
		Set<String> set=new HashSet<String>();//ʵ����Set����
		
		for(String str:str1){
			set.add(str);//��str1�����Ԫ�ؼ��뵽set��
		}
		
		for(String str:str2){
			set.add(str);
		}
		
		String[] result={};
		
		return set.toArray(result);//���ز���������飨��ת���������ʽtoArray��
	}

}
