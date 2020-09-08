package com.studyskymate.dinesh.corejava.dsa;

public class LinkedListEx2 {

	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void insert(int data) {
		Node node = new Node(data);
		if (head == null) {
			head = node;
		} else {
			Node ptr = head;
			while (ptr.next != null) {
				ptr = ptr.next;
			}
			ptr.next = node;
		}

	}

	public static void display() {
		Node ptr = head;
		while (ptr != null) {
			System.out.print(ptr.data + " >");
			ptr = ptr.next;
		}
	}
	public static void middle() {
		Node ptr = head;
		Node ptr1 = head;
		
		while (ptr != null && ptr1.next!=null) {
			
			ptr = ptr.next;
			ptr1 = ptr.next.next;
		}
		System.out.println();
		System.out.println("Middle: "+ptr.data);
	}

	public static void main(String[] args) {

		insert(10);
		insert(20);
		insert(30);
		insert(40);
		insert(50);
		display();
		middle();

	}

}
