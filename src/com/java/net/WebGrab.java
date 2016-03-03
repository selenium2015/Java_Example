package com.java.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * ��ҳץȡ 
 * ʹ�� net.URL ��� URL() ���캯����ץȡ��ҳ
 * 
 * 
 * @author Administrator
 * 
 */
public class WebGrab {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://www.w3cschool.cc");
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));//Opens a connection to this URL and returns an InputStream for reading from that connection. 
		BufferedWriter writer = new BufferedWriter(new FileWriter("data.html"));
		
		String line;
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
			writer.write(line);
			writer.newLine();
		}
		reader.close();
		writer.close();
	}
}
