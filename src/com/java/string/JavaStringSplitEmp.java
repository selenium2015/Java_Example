package com.java.string;

/*
 * 字符串分割 
 * 使用了 split(string) 方法通过指定分隔符将字符串分割为数组
 * 
 * 
 */
public class JavaStringSplitEmp {
	
	public static void main(String[] args) {
		String str="www.baidu.com";
		String[] tmp;
		
		//分割字符串，然后初始化字符串数组
		tmp=str.split("\\.");//转义符号.
		
		//用for循环打印数组tmp的值
		for(int i=0;i<tmp.length;i++){
			System.out.println(tmp[i]);
			System.out.println("");
		}
		
		System.out.println("======使用for each 循环输出的方法======");
		//该方法较便捷
		for(String x:tmp){
	         System.out.println(x);
	         System.out.println("");
		}
		
		

	}

}
