package com.java.exception;

/*
 * ����쳣�������catch��
 * ���쳣�Ĵ���:
 * 1.�����쳣ʱ������������Ϊ������쳣���������Դ���ĸ�����
 * 2.�Է����������쳣���Ͷ�Ӧ����catch�飬 ������catch���е��쳣���ּ̳й�ϵ�������쳣catch�����������
 * 
 */
public class MultipleCatch {
	public static void main(String[] args) // throws Exception
	{
		Demo d = new Demo();

		try {
			int x = d.div(4, 0);// �������н�ͼ�е�����ʾ�� �ֱ��Ӧ�˴������д���
//			 int x = d.div(5,0);
//			 int x = d.div(4,1);
			System.out.println("x=" + x);
		} catch (ArithmeticException e) {
			System.out.println(e.toString());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		} catch (Exception e)// ���� д�ڴ˴���Ϊ�˲�׽����ûԤ�ϵ����쳣 ֻ��д�������쳣�Ĵ������
								// ����һ��������ǲ�д��
		{
			System.out.println(e.toString());
		}

		System.out.println("Over");
	}

}
