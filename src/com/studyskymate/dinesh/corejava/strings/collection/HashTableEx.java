package com.studyskymate.dinesh.corejava.strings.collection;

import java.util.Hashtable;
import java.util.Map;

public class HashTableEx {

	public static void main(String[] args) {
		Hashtable<Integer, String> ht = new Hashtable<Integer, String>();

		ht.put(1000, "Fiji islands");
		ht.put(1002, "India");
		ht.put(1001, "Australia");
		ht.put(1003, "Japan");

		for (Map.Entry m : ht.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

	}

}
