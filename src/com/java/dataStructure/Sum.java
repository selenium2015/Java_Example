package com.java.dataStructure;
/**
 * ����������� 
 * ʹ��do...while�ṹ��0~100����������֮��
 * 
 * @author Administrator
 *
 */
public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int sum=0;
		int i=0;
		do{
			sum+=i;
			i++;
		}
		while(i<=100);
			System.out.println(sum);	
		
	}

}
