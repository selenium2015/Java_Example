package com.java.method;

/*
 * 汉诺塔算法 （递归算法）
 * 汉诺塔（又称河内塔）,玩法如下
 * 	1.有三根杆子A,B,C。A杆上有若干碟子
 * 	2.每次移动一块碟子,小的只能叠在大的上面
 * 	3.把所有碟子从A杆全部移到C杆上
 * 
 * 
 */
public class HeNeiTa {
	
	public static void main(String[] args) {
		int nDisks = 3;
		doTowers(nDisks, 'A', 'B', 'C');
	}

	public static void doTowers(int topN, char from, char inter, char to) {//层数，源柱子，中间柱子，目标柱子
		if (topN == 1) {
			System.out.println("Disk 1 from " + from + " to " + to);
		} else {
			doTowers(topN - 1, from, to, inter);//递归，注意参数顺序不同
			System.out.println("Disk " + topN + " from " + from + " to " + to);
			doTowers(topN - 1, inter, from, to);//递归
		}
	}

}
