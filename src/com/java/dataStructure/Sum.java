package com.java.dataStructure;
/**
 * 数字求和运算 
 * 使用do...while结构求0~100的整数数字之和
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
