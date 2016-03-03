package com.java.exception;

/**
 * 
 * @author Administrator
 * 
 * 使用 catch 处理异常 
 * 
 * 获取异常的堆栈信息 
 * 使用异常类的 printStack() 方法来获取堆栈信息
 *
 */
public class CatchTest {

	public static void main(String[] args) {
		int[] array={10,20,30};
		
		try {
			for(int i=0;i<5;i++){
				System.out.println(array[i]);//循环次数超出数组长度，将出现数组非法索引异常（ArrayIndexOutOfBoundsException）
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();//获取异常的堆栈信息 
		}

	}

}
