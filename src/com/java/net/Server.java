package com.java.net;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * ServerSocket �� Socket ͨ��ʵ�� 
 * 
 *  ������������
 * 	����������ͨ��ServerSocket
 * 	����������Socket���տͻ�������
 * 	����IO��������ȡ�ͻ��˷��͵�����
 * 	����IO�������ͻ��˷���������Ϣ
 * 
 * ��ʾ�����ʵ�ֿͻ��˷�����Ϣ�������������������յ���Ϣ����ȡ�����Ȼ��д�����ͻ��˿ͻ��˽��յ������
 * 
 *
 */
public class Server {
	public static void main(String[] args) {		
		
        try {
			ServerSocket ss = new ServerSocket(8888);
			
			System.out.println("����������....");
			//�����˿ڣ�ֱ�����յ�
			Socket s = ss.accept();//Listens for a connection to be made to this socket and accepts it. The method blocks until a connection is made. 

			System.out.println("�ͻ���:"+s.getInetAddress().getLocalHost()+"�����ӵ�������");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			//��ȡ�ͻ��˷���������Ϣ
			String mess = br.readLine();
			System.out.println("�ͻ��ˣ�"+mess);
			
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			bw.write(mess+"\n");
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
