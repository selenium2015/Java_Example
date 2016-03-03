package com.java.time;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 获取当前时间 
 * 使用 Date 类及 SimpleDateFormat 类的 format(date) 方法来输出当前时间
 * 
 */
public class ApplyPattern {
	public static void main(String[] args) {
		SimpleDateFormat sdf=new SimpleDateFormat();// 格式化时间 
		
		sdf.applyPattern("yyyy-MM-dd HH:mm:ss a");// a为am/pm的标记  
		
		Date date=new Date();// 获取当前时间 
		
		System.out.println(sdf.format(date));
	}

}
