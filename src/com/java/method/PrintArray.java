package com.java.method;

/*
 * �������Ԫ�� 
 * �����ݷ������أ���ͬ����������������ͬ���͵�����Ԫ�أ�
 * 
 * ͨ������ PrintArray ��� printArray ���������ͬ����(����, ˫���ȼ��ַ���)������
 */
public class PrintArray {
	
	public static void printArray(Integer[] inputArray){
		for(Integer i:inputArray){
			System.out.printf("%s",i);
			System.out.println();
		}		
	}

	public static void printArray(Double[] inputArray){
		for(Double i:inputArray){
			System.out.printf("%s",i);
			System.out.println();
		}		
	}
	
	public static void printArray(Character[] inputArray){
		for(Character i:inputArray){
			System.out.printf("%s",i);
			System.out.println();
		}		
	}
	
	public static void main(String[] args) {
	      Integer[] integerArray = { 1, 2, 3, 4, 5, 6 };
	      Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4,5.5, 6.6, 7.7 };
	      Character[] characterArray = { 'H', 'E', 'L', 'L', 'O' };
	      
	      printArray(integerArray);
	      System.out.println();
	      printArray(doubleArray);
	      System.out.println();
	      printArray(characterArray);	      
	}
}
