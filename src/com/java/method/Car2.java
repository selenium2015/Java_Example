package com.java.method;

/*
 * Enum��ö�٣����캯����������ʹ�� 
 * 
 */
enum Car2 {
	lamborghini(900),tata(2),audi(50),fiat(15),honda(12);
	
	private int price;
	Car2(int p){//ö���в����������ж�Ӧ�вι��캯��
		price=p;
	}
	
	int getPrice(){
		return price;
	}

}
