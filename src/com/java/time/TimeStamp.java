package com.java.time;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * ʱ���ת����ʱ�� 
 * ʹ�� SimpleDateFormat ��� format() ������ʱ���ת����ʱ��
 * 
 */
public class TimeStamp {
	public static void main(String[] args) {
		long timaStamp=System.currentTimeMillis();//��ȡ��ǰʱ���
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		
		//parse����
		String str=sdf.format(new Date(Long.parseLong(String.valueOf(timaStamp))));//ʱ���ת����ʱ��
		//�Ƚ�timaStamp��long����ת����string��ʽ
		//�����ý���parseLongΪLong date��ʽ
		
        System.out.println(str);
	}

}
