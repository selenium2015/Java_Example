package com.java.string;

/*
 * 测试两个字符串区域是否相等 
 * 使用了 regionMatches() 方法测试两个字符串区域是否相等
 * 
 */
public class StringRegionMatch {
	public static void main(String[] args) {
		String str1="welcome to china!";
		String str2="welcome to Chine!";
		
		//表示将 str1 字符串从第6个字符开始和 str2 字符串的第6个字符开始逐个比较，共比较 9 对字符，由于字符串区分大小写，所以结果为false。
		boolean b1=str1.regionMatches(6, str2, 6, 9);
		boolean b2=str1.regionMatches(true, 6, str2, 6, 9);//设置第一个参数为 true ，则表示忽略大小写区别，所以返回 true。 
		
		System.out.println(b1);
		System.out.println(b2);
	}

}
