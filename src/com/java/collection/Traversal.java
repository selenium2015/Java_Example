package com.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Iterator;

/**
 * ���ϱ��� ��ʾ����α�����Collection�ӿ��������List��Set���Լ�ֵ����ʽ���洢��Map���͵ļ��ϣ� ���·ֱ�ʹ������ͨfor����ǿ�͵�
 * for ��iterator �ȷ�ʽ����������
 * 
 * 
 * @author Administrator
 * 
 */
public class Traversal {
	public static void main(String[] args) {
		// List���ϵı���
		listTest();
		// Set���ϵı���
		setTest();
	}

	private static void setTest() {
		Set<String> set = new HashSet<String>();
		set.add("JAVA");
		set.add("C");
		set.add("C++");
		// �ظ��������ʧ��
		set.add("JAVA");
		set.add("JAVASCRIPT");

		// ʹ��iterator����set����
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			String value = it.next();
			System.out.println(value);
		}

		// ʹ����ǿforѭ������set����
		for (String s : set) {
			System.out.println(s);
		}
	}

	// ����list����
	private static void listTest() {
		List<String> list = new ArrayList<String>();
		list.add("��");
		list.add("��");
		list.add("��");
		list.add("��");
		list.add("www.w3cschool.cc");

		// ʹ��iterator����
		Iterator<String> it = list.iterator();
		while (it.hasNext()) {
			String value = it.next();
			System.out.println(value);
		}

		// ʹ�ô�ͳforѭ�����б���
		for (int i = 0, size = list.size(); i < size; i++) {
			String value = list.get(i);
			System.out.println(value);
		}

		// ʹ����ǿforѭ�����б���
		for (String value : list) {
			System.out.println(value);
		}
	}
}
