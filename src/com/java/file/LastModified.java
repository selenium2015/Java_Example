package com.java.file;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * ��ȡ���޸��ļ������޸����� 
 * ʹ�� File ��� File.lastModified() ��ȡ�ļ��޸�ʱ�� 
 *	File setLastModified() �������޸��ļ������޸�����
 */
public class LastModified {
	public static void main(String[] args) {

		File file = new File("d:/test.txt");

		String str = "YYYY-MM-dd HH:mm:ss";
		SimpleDateFormat sdf = new SimpleDateFormat(str);// ʱ���ʽת��

		System.out.println(sdf.format(file.lastModified()));// ��ȡ�ļ�����޸�����

		// �޸��ļ��������
		System.out.println(file.setLastModified(System.currentTimeMillis()));// ��ӡ�Ƿ�����޸ģ��޸ķ���true�����򷵻�false
		// Date date=new Date(file.lastModified());

		System.out.println("�޸ĺ�����ڣ�" + sdf.format(file.lastModified()));// ��ȡ�ļ�����޸�����

	}

}
