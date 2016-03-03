package com.java.method;

/*
 *  break 关键字用法 
 *   Java break 语句可以直接强行退出当前的循环，忽略循环体中任何其他语句和循环条件测试。
 * 
 */
public class Break {

	public static void main(String[] args) {
		int[] intary = { 99, 12, 22, 34, 45, 67, 5678, 8990 };
		int no = 5678;
		int i = 0;
		boolean found = false;
		for (; i < intary.length; i++) {
			if (intary[i] == no) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println(no + " 元素的索引位置在: " + i);
		} else {
			System.out.println(no + " 元素不在数组总");
		}
	}
}
