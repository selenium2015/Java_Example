package com.java.method;

/*
 * ��ŵ���㷨 ���ݹ��㷨��
 * ��ŵ�����ֳƺ�������,�淨����
 * 	1.����������A,B,C��A���������ɵ���
 * 	2.ÿ���ƶ�һ�����,С��ֻ�ܵ��ڴ������
 * 	3.�����е��Ӵ�A��ȫ���Ƶ�C����
 * 
 * 
 */
public class HeNeiTa {
	
	public static void main(String[] args) {
		int nDisks = 3;
		doTowers(nDisks, 'A', 'B', 'C');
	}

	public static void doTowers(int topN, char from, char inter, char to) {//������Դ���ӣ��м����ӣ�Ŀ������
		if (topN == 1) {
			System.out.println("Disk 1 from " + from + " to " + to);
		} else {
			doTowers(topN - 1, from, to, inter);//�ݹ飬ע�����˳��ͬ
			System.out.println("Disk " + topN + " from " + from + " to " + to);
			doTowers(topN - 1, inter, from, to);//�ݹ�
		}
	}

}
