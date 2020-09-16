package com.studyskymate.dinesh.corejava.strings.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMapExample {

	public static void main(String[] args) {

		HashMap<Integer, String> hm = new HashMap<Integer, String>();

		hm.put(1, "A");
		hm.put(1, "B");
		hm.put(2, "A");
		hm.put(3, "A");
		hm.put(4, "A");

		// What is the size?
		System.out.println(hm.size());

		for (Map.Entry<Integer, String> entry : hm.entrySet()) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		System.out.println("*****************");
		// FInd out Duplicate caharecter count

		String s = "ceitceitfnu";

		System.out.println(s);
		HashMap<Character, Integer> hm2 = new HashMap<Character, Integer>();

		char[] charArr = s.toCharArray();

		for (char c : charArr) {

			if (!hm2.containsKey(c))
				hm2.put(c, 1);
			else if (hm2.containsKey(c)) {
				hm2.put(c, hm2.get(c) + 1);
			}

		}

		for (Map.Entry<Character, Integer> entry2 : hm2.entrySet()) {
			System.out.println(entry2.getKey() + " " + entry2.getValue());
		}

		System.out.println("*****************");

		String str = "ceit cei tf nu my duplicate duplicate element";
		System.out.println(str);
		String[] strArr = str.split(" ");
		for (String st : strArr) {
			System.out.println(st);
		}

	}

}
