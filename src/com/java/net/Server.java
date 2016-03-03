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
 * ServerSocket 和 Socket 通信实例 
 * 
 *  建立服务器端
 * 	服务器建立通信ServerSocket
 * 	服务器建立Socket接收客户端连接
 * 	建立IO输入流读取客户端发送的数据
 * 	建立IO输出流向客户端发送数据消息
 * 
 * 演示了如何实现客户端发送消息到服务器，服务器接收到消息并读取输出，然后写出到客户端客户端接收到输出。
 * 
 *
 */
public class Server {
	public static void main(String[] args) {		
		
        try {
			ServerSocket ss = new ServerSocket(8888);
			
			System.out.println("启动服务器....");
			//监听端口，直至接收到
			Socket s = ss.accept();//Listens for a connection to be made to this socket and accepts it. The method blocks until a connection is made. 

			System.out.println("客户端:"+s.getInetAddress().getLocalHost()+"已连接到服务器");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));
			
			//读取客户端发送来的消息
			String mess = br.readLine();
			System.out.println("客户端："+mess);
			
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(s.getOutputStream()));
			bw.write(mess+"\n");
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
