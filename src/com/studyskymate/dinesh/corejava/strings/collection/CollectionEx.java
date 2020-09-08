package com.studyskymate.dinesh.corejava.strings.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class User {
	int id;
	String name;
	String password;

	public User(int id, String name, String password) {
		super();
		this.id = id;
		this.name = name;
		this.password = password;
	}

}

public class CollectionEx {

	public static void main(String[] args) {

		User user1 = new User(1001, "Dinesh", "Mypassword1");
		User user2 = new User(1002, "Dinesh2", "Mypassword2");
		User user3 = new User(1003, "Dinesh3", "Mypassword3");

		List<User> listUser = new ArrayList<User>();

		listUser.add(user1);
		listUser.add(user2);
		listUser.add(user3);

		Iterator<User> itrUser = listUser.iterator();

		while (itrUser.hasNext()) {

			User user = itrUser.next();

			System.out.println(" ID: " + user.id + " Name: " + user.name + " password" + "" + user.password);

		}

		System.out.println("***************************");
		List<Integer> mynumberlist1 = new ArrayList<Integer>();

		for (int i = 100; i <= 105; i++) {
			mynumberlist1.add(i);
		}

		Iterator iterator = mynumberlist1.iterator();

		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		System.out.println("***************************");

		ArrayList<String> a = new ArrayList<String>();
		a.add("a");
		a.add("b");

		for (String l : a) {
			System.out.println(l);
		}

		
		Map<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "MAP1");
		map.put(2, "MAP2");

		Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();

		while (itr.hasNext()) {
			Map.Entry<Integer, String> entry = itr.next();

			System.out.println("KEY: " + entry.getKey());
			System.out.println("VALUE: " + entry.getValue());
		}

		System.out.println(map.get(1));
		// Hashtable,Queue,etc

	}

}
