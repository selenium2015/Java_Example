package com.java.arrays;

/*
 * 获取数组长度
 * 使用数组的属性 length 来获取数组的长度
 * （第二维数组长度获取：array[0].length）
 * 
 */
public class LengthArrays {
	public static void main(String[] args) {
		String[][] data=new String[2][5];
	    System.out.println("第一维数组长度: " + data.length);
	    System.out.println("第二维数组长度: "+data[0].length);
	}

}
