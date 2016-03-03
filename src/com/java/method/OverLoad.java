package com.java.method;

/*
 * 方法重载
 * 定义：如果有两个方法的方法名相同，但参数不一致，那么可以说一个方法是另一个方法的重载。
 * 
 * 说明：
 * 	方法名相同
 * 	方法的参数类型，个数顺序至少有一项不同
 * 	方法的返回类型可以不相同
 * 	方法的修饰符可以不相同
 * 	main方法也可以被重载 
 * 
 * 
 * 演示了如何重载 MyClass 类的 info 方法
 */
public class OverLoad {
	
	int height;
	
	OverLoad(){
	     System.out.println("无参数构造函数");
	     height=4;
	}
	
	OverLoad(int i){
		System.out.println("房子高度为："+i+" 米");
		height=i;
	}
	
	void info(){
		System.out.println("房子高度为 " + height+" 米");
	}
	
	void info(String s){
		System.out.println(s+"：房子高度为 " + height+" 米");
	}
	
	
	public static void main(String[] args) {
		OverLoad ol=new OverLoad();//实例化对象，默认是无参构造函数		
		OverLoad o=new OverLoad(3);
		
		ol.info();
		ol.info("重载方法");
		
	}

}
