package com.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * ֻ������ ʹ�� Collection ��� Collections.unmodifiableList() ���������ü���Ϊֻ��
 * 
 * 
 * @author Administrator
 * 
 */
public class UnmodifiableList {
	public static void main(String[] argv) throws Exception {
		List stuff = Arrays.asList(new String[] { "a", "b" });
		List list = new ArrayList(stuff);
		list = Collections.unmodifiableList(list);
		try {
			list.set(0, "new value");
		} catch (UnsupportedOperationException e) {
			
		}
		Set set = new HashSet(stuff);
		set = Collections.unmodifiableSet(set);
		
		Map map = new HashMap();
		map = Collections.unmodifiableMap(map);
		
		System.out.println("����������ֻ��");
	}

}
