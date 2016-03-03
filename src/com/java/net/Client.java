package com.java.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * ServerSocket �� Socket ͨ��ʵ��
 * 
 * �����ͻ��� ����Socketͨ�ţ�����ͨ�ŷ�������IP��Port ����IO����������������������Ϣ ����IO��������ȡ��������������������Ϣ
 * 
 * 
 * ��ʾ�����ʵ�ֿͻ��˷�����Ϣ�������������������յ���Ϣ����ȡ�����Ȼ��д�����ͻ��˿ͻ��˽��յ������
 * 
 */
public class Client {
	public static void main(String[] args) {
		try {
			Socket s = new Socket("127.0.0.1", 8888);

			// ����IO
			InputStream is = s.getInputStream();
			OutputStream os = s.getOutputStream();

			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
			// ��������˷���һ����Ϣ
			bw.write("���Կͻ��˺ͷ�����ͨ�ţ����������յ���Ϣ���ص��ͻ���\n");
			bw.flush();

			// ��ȡ���������ص���Ϣ
			BufferedReader br = new BufferedReader(new InputStreamReader(is));
			String mess = br.readLine();
			System.out.println("��������" + mess);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
