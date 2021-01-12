package com.studyskymate.dinesh.corejava.strings.collection;

import java.util.LinkedList;

public class LinkedListPoll {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();

		// adding elements
		list.add("Geeks");
		list.add(4);
		list.add("Geeks2");
		list.add(8);

		// printing the list
		System.out.println("The initial Linked List is : " + list);

		// using poll() to retrieve and remove the head
		// removes and displays "Geeks"
		System.out.println("Head element of the list is : " + list.poll());

		// printing the resultant list
		System.out.println("Linked List after removal using poll() : " + list);
		list.addFirst("First");
		System.out.println("Linked List after removal using add : " + list);
		list.offer("offer");
		System.out.println("Linked List after removal using offer : " + list);
		list.add("add");
		System.out.println("Linked List after removal using add : " + list);

	}

}
