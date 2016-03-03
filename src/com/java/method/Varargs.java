package com.java.method;

/*
 * Varargs �ɱ����ʹ�� 
 * Java1.5�ṩ��һ����varargs���¹��ܣ����ǿɱ䳤�ȵĲ�����
 *  ����ʵ�θ����ɱ�ķ�����ֻҪ��һ���βε�"����"��"������"֮���������������"."����"..."��Ӣ����ľ���ʡ�Ժţ����Ϳ��������Ͳ�ȷ����ʵ����ƥ�䡣 
 * 
 * 
 */
public class Varargs {
	public static void main(String[] args) {
		int[] array={1,2,3,4,5};
		int sum=sumvarargs(array);
		
		System.out.println("�������֮��Ϊ: " +sum);
	}
	
	static int sumvarargs(int... intArrays){
		int sum,i;
		sum=0;
		for(int a:intArrays){
			sum+=a;
		}
		return sum;
	}

}
