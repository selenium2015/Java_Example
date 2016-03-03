package com.java.net;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;
import java.util.Map;
import java.util.Set;

/**
 * ��ȡ URL��Ӧͷ��������Ϣ 
 * ʹ�� HttpURLConnection �� getDate() ��������ȡ URL��Ӧͷ��������Ϣ
 * 
 * 
 * ��ȡ URL ��Ӧͷ��Ϣ 
 * URLConnection ���getHeaderFields()����
 * 
 * @author Administrator
 * 
 */
public class GetResponseHeadDate {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://www.baidu.com");
		URLConnection conn=url.openConnection();
		HttpURLConnection httpCon = (HttpURLConnection) conn;
		long date = httpCon.getDate();
		if (date == 0)
			System.out.println("�޷���ȡ��Ϣ��");
		else
			System.out.println("Date: " + new Date(date));
			System.out.println();
		
        Map headers = conn.getHeaderFields();//Returns an unmodifiable Map of the header fields.
        Set<String> keys = headers.keySet();//������
        
        for( String key : keys ){
            String val = conn.getHeaderField(key);//Returns the value of the named header field. 

            System.out.println(key+"    "+val);
        }
        System.out.println();
        System.out.println( conn.getLastModified() );//or 0 if not known.

	}

}
