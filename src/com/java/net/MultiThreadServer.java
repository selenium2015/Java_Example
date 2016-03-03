package com.java.net;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Socket ʵ�ֶ��̷߳��������� 
 * ʹ�� Socket ��� accept() ������ ServerSocket ��� MultiThreadServer(socketname) ������ʵ�ֶ��̷߳���������
 * 
 * 
 * 
 */
public class MultiThreadServer implements Runnable {

	Socket csocket;

	//�вι��췽��
	MultiThreadServer(Socket csocket) {
		this.csocket = csocket;
	}

	@Override
	public void run() {
		try {
			PrintStream pstream = new PrintStream(csocket.getOutputStream());//Returns an output stream for this socket. 

			for (int i = 100; i >= 0; i--) {
				pstream.println(i + " bottles of beer on the wall");
			}
			pstream.close();
			csocket.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}

	public static void main(String args[]) throws Exception {
		ServerSocket ssock = new ServerSocket(8888);
		System.out.println("Listening");
		while (true) {
			Socket sock = ssock.accept();
			System.out.println("Connected");
			new Thread(new MultiThreadServer(sock)).start();
		}
	}

}
