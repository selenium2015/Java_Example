package com.java.time;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * ��ʽ��ʱ�䣨SimpleDateFormat�� 
 * ʹ�� SimpleDateFormat ��� format(date) ��������ʽ��ʱ�� 
 * 
 */
public class DateFormat {
	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date);//δ��ʽ�������ڣ�Wed Feb 24 10:56:09 CST 2016
		
		String strDateFormat="yyyy-MM-dd HH:mm:ss";//ָ����ʽ
		
		SimpleDateFormat sdf=new SimpleDateFormat(strDateFormat);
		
		System.out.println(sdf.format(date));
	}

}
