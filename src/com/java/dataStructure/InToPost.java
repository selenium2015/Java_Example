package com.java.dataStructure;

import java.io.IOException;

/**
 * 利用堆栈 将中缀表达式 转换成 后缀表达式 使用堆栈进行表达式的堆栈将中缀（Infix）表达式转换成后缀（postfix）表达式
 * 
 * 中缀（Infix）表达式（或中缀记法）是一个通用的算术或逻辑公式表示方法， 操作符是以中缀形式处于操作数的中间（例：3 +
 * 4），中缀表达式是人们常用的算术表示方法。 与前缀表达式（例：+ 3 4）或后缀表达式（例：3 4 +）相比，中缀表达式不容易被计算机解析
 * 
 * @author Administrator
 * 
 */
public class InToPost {
	private Stack theStack;
	private String input;
	private String output = "";

	public InToPost(String in) {
		input = in;
		int stackSize = input.length();
		theStack = new Stack(stackSize);
	}

	public String doTrans() {
		for (int j = 0; j < input.length(); j++) {
			char ch = input.charAt(j);
			switch (ch) {
			case '+':
			case '-':
				gotOper(ch, 1);
				break;
			case '*':
			case '/':
				gotOper(ch, 2);
				break;
			case '(':
				theStack.push(ch);
				break;
			case ')':
				gotParen(ch);
				break;
			default:
				output = output + ch;
				break;
			}
		}
		while (!theStack.isEmpty()) {
			output = output + theStack.pop();
		}
		System.out.println(output);
		return output;
	}

	public void gotOper(char opThis, int prec1) {
		while (!theStack.isEmpty()) {
			char opTop = theStack.pop();
			if (opTop == '(') {
				theStack.push(opTop);
				break;
			} else {
				int prec2;
				if (opTop == '+' || opTop == '-')
					prec2 = 1;
				else
					prec2 = 2;
				if (prec2 < prec1) {
					theStack.push(opTop);
					break;
				} else
					output = output + opTop;
			}
		}
		theStack.push(opThis);
	}

	public void gotParen(char ch) {
		while (!theStack.isEmpty()) {
			char chx = theStack.pop();
			if (chx == '(')
				break;
			else
				output = output + chx;
		}
	}

	public static void main(String[] args) throws IOException {
		String input = "1+2*4/5-7+3/6";
		String output;
		InToPost theTrans = new InToPost(input);
		output = theTrans.doTrans();
		System.out.println("Postfix is " + output + '\n');
	}

	//内部类
	class Stack {
		private int maxSize;
		private char[] stackArray;
		private int top;

		public Stack(int max) {
			maxSize = max;
			stackArray = new char[maxSize];
			top = -1;
		}

		public void push(char j) {
			stackArray[++top] = j;
		}

		public char pop() {
			return stackArray[top--];
		}

		public char peek() {
			return stackArray[top];
		}

		public boolean isEmpty() {
			return (top == -1);
		}
	}
}
