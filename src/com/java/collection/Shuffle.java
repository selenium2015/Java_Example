package com.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * ���ϴ���˳�� 
	ʹ�� Collections �� Collections.shuffle() ���������Ҽ���Ԫ�ص�˳��
 * 
 * @author Administrator
 *
 */
public class Shuffle {
	public static void main(String[] args) {
		List<Integer> list =new ArrayList<Integer>();
		
		for(int i=0;i<10;i++){
			list.add(new Integer(i));//ʹ������ͬ  Integer  int
			
		}
		
        System.out.println("����ǰ:");
        System.out.println(list);
        
        Collections.shuffle(list);//Randomly 
        System.out.println("���Һ�:");
        System.out.println(list);
	}

}
