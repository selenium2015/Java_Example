package com.java.exception;

/**
 * 
 * @author Administrator
 * 
 *         Finally���÷� Java �е� Finally �ؼ�һ����tryһ��ʹ��
 *         �ڳ������try��֮�����۳�������Ϊ�쳣����ֹ��������ʽ������ֹ�ģ�finally�������һ���ᱻִ�� ��
 * 
 *         ʹ�� finally ͨ�� e.getMessage() �������쳣���Ƿ������쳣��
 * 
 */

public class FinallyTest {

	public static void main(String[] args) {
		new FinallyTest().doTheWork();
	}

	public void doTheWork() {
		Object o = null;
		for (int i = 0; i < 5; i++) {
			try {
				o = makeObj(i);
			} catch (IllegalArgumentException e) {
				System.err.println("Error: (" + e.getMessage() + ").");
				return;
			} finally {
				System.err.println("����ִ�����");
				if (o == null)
					System.exit(0);
			}
			System.out.println(o);
		}
	}

	public Object makeObj(int type) throws IllegalArgumentException {//�׳����쳣�����򷽷�������һ�����Ϸ�����ȷ�Ĳ�����
		if (type == 1)
			throw new IllegalArgumentException("����ָ�������ͣ� " + type);
		return new Object();
	}

}
