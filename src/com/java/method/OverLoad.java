package com.java.method;

/*
 * ��������
 * ���壺��������������ķ�������ͬ����������һ�£���ô����˵һ����������һ�����������ء�
 * 
 * ˵����
 * 	��������ͬ
 * 	�����Ĳ������ͣ�����˳��������һ�ͬ
 * 	�����ķ������Ϳ��Բ���ͬ
 * 	���������η����Բ���ͬ
 * 	main����Ҳ���Ա����� 
 * 
 * 
 * ��ʾ��������� MyClass ��� info ����
 */
public class OverLoad {
	
	int height;
	
	OverLoad(){
	     System.out.println("�޲������캯��");
	     height=4;
	}
	
	OverLoad(int i){
		System.out.println("���Ӹ߶�Ϊ��"+i+" ��");
		height=i;
	}
	
	void info(){
		System.out.println("���Ӹ߶�Ϊ " + height+" ��");
	}
	
	void info(String s){
		System.out.println(s+"�����Ӹ߶�Ϊ " + height+" ��");
	}
	
	
	public static void main(String[] args) {
		OverLoad ol=new OverLoad();//ʵ��������Ĭ�����޲ι��캯��		
		OverLoad o=new OverLoad(3);
		
		ol.info();
		ol.info("���ط���");
		
	}

}
