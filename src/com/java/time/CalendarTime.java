package com.java.time;

import java.util.Calendar;
/*
 * 获取年份、月份等 
 * 使用 Calendar 类来输出年份、月份等
 * 
 */
public class CalendarTime {
	public static void main(String[] args) {
		Calendar cal= Calendar.getInstance();

		int day=cal.get(cal.DATE);
        int month = cal.get(Calendar.MONTH) +1;//月份从0开始算，所以需+1来显示
        int year = cal.get(Calendar.YEAR);
        int dow = cal.get(Calendar.DAY_OF_WEEK);
        int dom = cal.get(Calendar.DAY_OF_MONTH);
        int doy = cal.get(Calendar.DAY_OF_YEAR);
        
        System.out.println("当期时间: " + cal.getTime());
        System.out.println("日期: " + day);
        System.out.println("月份: " + month);
        System.out.println("年份: " + year);
        System.out.println("一周的第几天: " + dow);  // 星期日为一周的第一天输出为 1，星期一输出为 2，以此类推
        System.out.println("一月中的第几天: " + dom);
        System.out.println("一年的第几天: " + doy);
		
	}

}
