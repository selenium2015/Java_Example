package com.java.dataStructure;

/**
 * 
 * ջ��ʵ�� ͨ���������ڲ���Ԫ�ص��Զ��庯�� push() ���������ڵ���Ԫ�ص� pop() ������ʵ��ջ
 * ��ջ��Stack��ʵ����һ������ȳ���LIFO�������ݽṹ����
 * @author Administrator
 * 
 */
public class StackTest {
	private int maxSize;
	private long[] stackArray;
	private int top;

	public StackTest(int s) {//�вι��캯��
		maxSize = s;
		stackArray = new long[maxSize];
		top = -1;
	}

	public void push(long j) {
		stackArray[++top] = j;
	}

	public long pop() {
		return stackArray[top--];
	}

	public long peek() {
		return stackArray[top];
	}

	public boolean isEmpty() {
		return (top == -1);
	}

	public boolean isFull() {
		return (top == maxSize - 1);
	}

	public static void main(String[] args) {
		StackTest theStack = new StackTest(10);
		theStack.push(10);
		theStack.push(20);
		theStack.push(30);
		theStack.push(40);
		theStack.push(50);
		while (!theStack.isEmpty()) {
			long value = theStack.pop();
			System.out.print(value);
			System.out.print(" ");
		}
		System.out.println("");
	}
}
