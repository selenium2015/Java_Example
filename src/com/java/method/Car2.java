package com.java.method;

/*
 * Enum（枚举）构造函数及方法的使用 
 * 
 */
enum Car2 {
	lamborghini(900),tata(2),audi(50),fiat(15),honda(12);
	
	private int price;
	Car2(int p){//枚举有参数数，需有对应有参构造函数
		price=p;
	}
	
	int getPrice(){
		return price;
	}

}
