package com.studyskymate.dinesh.corejava.strings.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Sortingex {

	public static void main(String... aa) {

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 105; i >= 100; i--) {
			list.add(i);
		}
		for (int i = 105; i >= 100; i--) {
			list.add(i);
		}

		// list.remove(104);

		// Collections.sort(list);

		Iterator<Integer> itr = list.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("**************************");
		
	Set<Integer> set = new HashSet<Integer>();
		set.add(1001);
		set.add(1001);
		set.add(1002);
		set.add(null);
		set.add(null);
		set.add(1003);
       System.out.println("set:="+set);
		
		
		Iterator<Integer> itr1 = set.iterator();

		while (itr1.hasNext()) {
			System.out.println(itr1.next() + " Size: " + set.size());
		}

		System.out.println("**************************");

		Set<Integer> set3 = new HashSet<Integer>();
		set3.addAll(list);

		Iterator<Integer> itr3 = set3.iterator();
		while (itr3.hasNext()) {
			Integer i = itr3.next();
			System.out.println(i + " hash" + i.hashCode());
		}

		System.out.println("**************************");
		//

		System.out.println("**************************");
		Set<String> set4 = new HashSet<String>();

		set4.add("Z");
		set4.add("B");
		set4.add("A");
		set4.add("Z");
		set4.add("G");
		set4.add("A");

		Iterator<String> itr4 = set4.iterator();

		while (itr4.hasNext()) {
			String str = itr4.next();
			if (str.equals("G")) {
				itr4.remove();
				continue;
			}
			;

			System.out.println(str + " HAH CODE: " + str.hashCode());

		}
	}
}
