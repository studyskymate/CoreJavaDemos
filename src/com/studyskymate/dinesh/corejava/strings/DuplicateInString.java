package com.studyskymate.dinesh.corejava.strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class DuplicateInString {

	public static void main(String[] args) {

		String s = "abca";

		// Method 1
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();

		char[] c = s.toCharArray();

		for (int i = 0; i < c.length; i++) {
			char ch = c[i];
			if (!hm.containsKey(ch)) {
				hm.put(ch, 1);
			} else if (hm.containsKey(ch)) {
				hm.put(ch, hm.get(ch) + 1);
			}
		}

		Iterator<Entry<Character, Integer>> i = hm.entrySet().iterator();

		while (i.hasNext()) {
			Entry<Character, Integer> e = i.next();
			if (e.getValue() > 1) {
				System.out.println(e.getKey() + " " + e.getValue());
			}

		}

		// Method 2  for Each

		hm.forEach((k, v) -> System.out.println("k: " + k + " v: " + v));

		// Method 3  Stream
		
		hm.entrySet().stream().filter(e->e.getValue()>1).forEach(e->System.out.println(e.getKey()+" "+e.getValue()));
	}

}
