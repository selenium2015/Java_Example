package com.java.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * ����ת���� 
 * ʹ�� Java Util ��� list.add() �� list.toArray() ����������תΪ����
 * 
 * 
 * @author Administrator
 *
 */
public class CollectionToArray {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();//���ö�̬������Listָ������ArrayList����
		
		list.add("��");
	    list.add("��"); 
	    list.add("��");
	    list.add("��");
	    list.add("www.baidu.com");
	    
	    String[] arrays=list.toArray(new String[0]);//����ת����
	    for(String s:arrays){
	    	System.out.print(s);
	    }
	    
	    
		
	}
}
