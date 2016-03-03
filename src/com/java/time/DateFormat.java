package com.java.time;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 格式化时间（SimpleDateFormat） 
 * 使用 SimpleDateFormat 类的 format(date) 方法来格式化时间 
 * 
 */
public class DateFormat {
	public static void main(String[] args) {
		Date date=new Date();
		System.out.println(date);//未格式化的日期：Wed Feb 24 10:56:09 CST 2016
		
		String strDateFormat="yyyy-MM-dd HH:mm:ss";//指定格式
		
		SimpleDateFormat sdf=new SimpleDateFormat(strDateFormat);
		
		System.out.println(sdf.format(date));
	}

}
