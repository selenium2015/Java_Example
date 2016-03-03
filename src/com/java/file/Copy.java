package com.java.file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * ���ļ����ݸ��Ƶ���һ���ļ� 
 * ʹ�� BufferedWriter ��� read �� write �������ļ����ݸ��Ƶ���һ���ļ�
 * ��û��ֱ���ֳɵķ������и��ƣ�
 * 
 * 1.��Դ�ļ����ݶ�ȡ����������
 * 2.�ѱ��������д��Ŀ���ļ�
 * 3.��ȡĿ���ļ�����
 */
public class Copy {
	
	public static void main(String[] args) {
		
		try {
			BufferedReader br=new BufferedReader(new FileReader("d:/test.txt"));		
			String str=br.readLine();
			br.close();
			
			BufferedWriter bw=new BufferedWriter(new FileWriter("d:/test2.txt"));
			bw.write(str);
			bw.close();
			
			BufferedReader br2=new BufferedReader(new FileReader("d:/test2.txt"));
			String str2;


			while((str2=br2.readLine())!=null){
				System.out.println(str2);
			}
			br2.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
