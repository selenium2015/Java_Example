package com.java.time;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * ��ȡ��ǰʱ�� 
 * ʹ�� Date �༰ SimpleDateFormat ��� format(date) �����������ǰʱ��
 * 
 */
public class ApplyPattern {
	public static void main(String[] args) {
		SimpleDateFormat sdf=new SimpleDateFormat();// ��ʽ��ʱ�� 
		
		sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");// aΪam/pm�ı��  
		
		Date date=new Date();// ��ȡ��ǰʱ�� 
		
		System.out.println(sdf.format(date));
	}

}
