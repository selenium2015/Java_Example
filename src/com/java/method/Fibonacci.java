package com.java.method;

/*
 * 쳲���������(fibonacci)
 * 쳲���������ָ��������һ������ 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144����
 * �ر�ָ������0����0����1���ǵ�һ��1��
 * ������дӵ����ʼ��ÿһ�����ǰ����֮�͡�
 * 
 */
public class Fibonacci {
	
	public static long fibonacci(long  num){
		if((num==0)||(num==1)){
			return num;
		}else{
			return fibonacci(num-1)+fibonacci(num-2);//�ݹ�
		}
	}
	
	
	public static void main(String[] args) {
	    for (int counter = 0; counter <= 10; counter++){
	    	System.out.printf("Fibonacci of %d is: %d\n",counter, fibonacci(counter));	    
	    }
	}
}
