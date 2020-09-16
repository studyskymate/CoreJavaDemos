package com.studyskymate.dinesh.corejava.strings.collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> hm = new LinkedHashMap<Integer, String>();

		hm.put(1001, "Suva");
		hm.put(1002, "Nadi");
		hm.put(1003, "Samabula");
		
		//get the value at key 1003
		System.out.println(hm.get(1003));
		System.out.println(hm.remove(1003));
		
		for (Map.Entry m : hm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
