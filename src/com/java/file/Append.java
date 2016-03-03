package com.java.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ���ļ���׷������ 
 * ʹ�� filewriter �������ļ���׷������
 * ��new FileWriter("d:/test2.txt",true)��
 * 
 * 1.׷������
 * 2.��ȡ�ļ�����
 * 
 */
public class Append {
	
	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw=new BufferedWriter(new FileWriter("d:/test2.txt",true));
		
		bw.write("aString2");
		bw.close();
		
		BufferedReader br=new BufferedReader(new FileReader("d:/test2.txt"));
		String str;
		while((str=br.readLine())!=null){
			System.out.println(str);
		}
		br.close();
	}

}
