package com.studyskymate.dinesh.corejava.dsa;

public class LinkedListEx {
	Node head;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			this.data = d;
			this.next = null;
		}
	}

	private void addAtEnd(int data) {
		Node node = new Node(data);

		if (head == null) {
			head = node;
		} else {
			Node tmp = head;
			while (tmp.next != null) {
				tmp = tmp.next;
			}
			tmp.next = node;
		}
	}

	public static void main(String[] args) {
		LinkedListEx ll = new LinkedListEx();
		ll.addAtEnd(10);
		ll.addAtEnd(20);
		ll.addAtEnd(30);
		ll.addAtEnd(40);
		ll.traverse();
		ll.addAtEnd(5);
		ll.traverse();
		
		ll.addInFront(22);
		
		
	}

	private void addInFront(int i) {
		Node node =new Node(i);
		
	}

	private void traverse() {
		Node tmp = head;
		while (tmp != null) {
			System.out.print(tmp.data +"->");
			tmp = tmp.next;
		}
		System.out.println();
	}

}
