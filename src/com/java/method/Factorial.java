package com.java.method;

/*
 * �׳� 
 *  һ���������Ľ׳ˣ�Ӣ�factorial��������С�ڼ����ڸ������������Ļ���������0�Ľ׳�Ϊ1����Ȼ��n�Ľ׳�д��n!��
 *   �༴n!=1��2��3��...��n���׳�����Եݹ鷽ʽ���壺0!=1��n!=(n-1)!��n��
 * 
 * 
 */
public class Factorial {
	
	public static long factorial(long num){
		if(num<=1){
			return num;
		}else{
			return num*factorial(num-1);//�ݹ����
		}		
	}
	
	public static void main(String[] args) {
		for(int i=0;i<=10;i++){
			System.out.printf("%d! = %d\n", i,factorial(i));
			System.out.println();
		}
	}

}
