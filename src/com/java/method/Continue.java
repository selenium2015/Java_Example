package com.java.method;

/*
 * continue 关键字用法
 * continue 语句语句用来结束当前循环，并进入下一次循环，即仅仅这一次循环结束了，不是所有循环结束了，后边的循环依旧进行。
 * 
 */
public class Continue {
	public static void main(String[] args) {
		StringBuffer searchstr = new StringBuffer("hello how are you. ");
		int length = searchstr.length();
		int count = 0;
		for (int i = 0; i < length; i++) {
			if (searchstr.charAt(i) != 'h')
				continue;//结束当前循环后，继续for循环
			count++;
			searchstr.setCharAt(i, 'h');//把i位置的数据变为char类型'h'
		}
		System.out.println("发现 " + count + " 个 h 字符");
		System.out.println(searchstr);
	}

}
