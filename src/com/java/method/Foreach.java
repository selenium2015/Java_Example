package com.java.method;

/*
 * for �� foreachѭ��ʹ�� 
 * for ���Ƚϼ򵥣�����ѭ�����ݡ�forѭ��ִ�еĴ�������ִ��ǰ��ȷ���ġ�
 * for(��ʼ��; �������ʽ; ����) {
 *     //�������
 *  }
 *  
 *  
 *   foreach�����java5��������֮һ���ڱ������顢���Ϸ��棬foreachΪ������Ա�ṩ�˼���ķ��㡣 
 *   for(Ԫ������t Ԫ�ر���x : ��������obj){ 
 *        ������x��java���; 
 *   }      
 * 
 * 
 */
public class Foreach {
	public static void main(String[] args) {
		int[] array={1,2,3,4,5};
		
		forDisplay(array);
		foreachDisplay(array);
		
	}
	
	public static void forDisplay(int[] array) {
		System.out.println("����forѭ��");
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	public static void foreachDisplay(int[] array) {
		System.out.println("����foreachѭ��");
		for(int i : array){
			System.out.print(i+" ");
		}
	}

}
