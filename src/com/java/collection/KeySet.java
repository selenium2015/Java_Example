package com.java.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Iterator;
import java.util.Map.Entry;

/**
 * 
 * ����Map���ͼ��ϵı��� 
 * ʹ���� HashMap �� keySet()��entrySet()��������������
 * 
 * 
 * @author Administrator
 * 
 */
public class KeySet {
	public static void main(String[] args) {
		// ����һ��HashMap����,��������һЩ��ֵ�ԡ�
		Map<String, String> maps = new HashMap<String, String>();
		maps.put("1", "PHP");
		maps.put("2", "Java");
		maps.put("3", "C");
		maps.put("4", "C++");
		maps.put("5", "HTML");

		// ��ͳ�ı���map���ϵķ���1; keySet()
		// traditionalMethod1(maps);
		// ��ͳ�ı���map���ϵķ���2; entrySet()
		// traditionalMethod2(maps);
		// ʹ����ǿForѭ��������map���Ϸ���1; keySet()
		// strongForMethod1(maps);
		// ʹ����ǿForѭ��������map���Ϸ���2; entrySet()
		strongForMethod2(maps);
	}

	private static void strongForMethod2(Map<String, String> maps) {
		Set<Entry<String, String>> set = maps.entrySet();
		for (Entry<String, String> entry : set) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " : " + value);
		}
	}

	private static void strongForMethod1(Map<String, String> maps) {
		Set<String> set = maps.keySet();
		for (String s : set) {
			String key = s;
			String value = maps.get(s);
			System.out.println(key + " : " + value);
		}
	}

	// ʹ��entrySet()��������ȡmaps�����е�ÿһ����ֵ�ԣ�
	private static void traditionalMethod2(Map<String, String> maps) {
		Set<Map.Entry<String, String>> sets = maps.entrySet();//a set view of the mappings contained in this map
		// ȡ�õ�������������Ӧ��ֵ��
		Iterator<Entry<String, String>> it = sets.iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> entry = (Entry<String, String>) it.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + " : " + value);
		}
	}

	// ʹ��keySet()��������ȡmaps�����е����м���������ȡ������Ӧ��ֵ��
	private static void traditionalMethod1(Map<String, String> maps) {
		Set<String> sets = maps.keySet();//a set view of the keys contained in this map
		// ȡ�õ�������������Ӧ��ֵ
		Iterator<String> it = sets.iterator();
		while (it.hasNext()) {
			String key = it.next();
			String value = maps.get(key);
			System.out.println(key + " : " + value);
		}
	}
}
