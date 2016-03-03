package com.java.time;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * 时间戳转换成时间 
 * 使用 SimpleDateFormat 类的 format() 方法将时间戳转换成时间
 * 
 */
public class TimeStamp {
	public static void main(String[] args) {
		long timaStamp=System.currentTimeMillis();//获取当前时间戳
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		
		//parse解析
		String str=sdf.format(new Date(Long.parseLong(String.valueOf(timaStamp))));//时间戳转换成时间
		//先将timaStamp从long类型转换成string格式
		//再利用解析parseLong为Long date格式
		
        System.out.println(str);
	}

}
