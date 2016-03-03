package com.java.method;

/*
 * enum 和 switch 语句使用 
 * Java 创建枚举类型要使用 enum 关键字，隐含了所创建的类型都是 java.lang.Enum 类的子类
 * 
 */

public class Enum {
	public static void main(String[] args) {
		Car c;
		c=Car.tata;
		
		switch(c){
		case lamborghini:
			System.out.println("选择了兰博基尼");
			break;
		case tata:
			System.out.println("选择了塔塔汽车");
			break;
		case audi:
			System.out.println("选择了奥迪汽车");
			break;
		case fiat:
			System.out.println("选择了菲亚特汽车");
			break;
		case honda:
			System.out.println("选择了丰田汽车");
			break;
		default:
			System.out.println("没有选择车型");
		}
	}

}
