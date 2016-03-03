package com.java.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


/*
 * ��ȡ�ļ����� 
 * ʹ�� readLine() ��������ȡ�ļ� ����
 * 
 *  1.����FileReader����
 * 	2.����BufferedReader���󣬲���FileReader���󴫲θ������ļ���ַ��
 * 	3������BufferedReader�����readLine()���������ж�ȡ����
 * 	4���ر�BufferedReader����
 * 
 */
public class ReadLine {
	
	public static void main(String[] args) {

		try {
			BufferedReader  br =new BufferedReader(new FileReader("d:/test.txt"));		
			String str;
			while((str=br.readLine())!=null){
				System.out.println(str);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
