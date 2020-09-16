package com.studyskymate.dinesh.corejava.strings.collection;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {

	public static void main(String[] args) {
		TreeMap<Integer, String> map = new TreeMap<Integer, String>();
		map.put(1000, "Fiji islands");
		map.put(1002, "India");
		map.put(1001, "Australia");
		map.put(1003, "Japan");

		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}

		// Maintains descending order
		System.out.println("descendingMap: " + map.descendingMap());
		// Returns key-value pairs whose keys are less than or equal to the specified
		// key.
		System.out.println("headMap: " + map.headMap(1002, true));
		// Returns key-value pairs whose keys are greater than or equal to the specified
		// key.
		System.out.println("tailMap: " + map.tailMap(1002, true));
		// Returns key-value pairs exists in between the specified key.
		System.out.println("subMap: " + map.subMap(1000, false, 1002, true));
	}

}
