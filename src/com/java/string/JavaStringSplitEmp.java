package com.java.string;

/*
 * �ַ����ָ� 
 * ʹ���� split(string) ����ͨ��ָ���ָ������ַ����ָ�Ϊ����
 * 
 * 
 */
public class JavaStringSplitEmp {
	
	public static void main(String[] args) {
		String str="www.baidu.com";
		String[] tmp;
		
		//�ָ��ַ�����Ȼ���ʼ���ַ�������
		tmp=str.split("\\.");//ת�����.
		
		//��forѭ����ӡ����tmp��ֵ
		for(int i=0;i<tmp.length;i++){
			System.out.println(tmp[i]);
			System.out.println("");
		}
		
		System.out.println("======ʹ��for each ѭ������ķ���======");
		//�÷����ϱ��
		for(String x:tmp){
	         System.out.println(x);
	         System.out.println("");
		}
		
		

	}

}
