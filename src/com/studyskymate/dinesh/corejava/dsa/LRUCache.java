package com.studyskymate.dinesh.corejava.dsa;

class Node {
	int data;
	Node next;
	Node pre;

	Node(int data) {
		this.data = data;
		this.next = null;
		this.pre = null;
	}
}
public class LRUCache {

	Node head=null;
	
	LRUCache(){
		
	}
	
	//set
	public void set(int data) {
		Node node= new Node(data);
		Node temp=head;
		head=node;
		node.next=temp;
		node.pre=head;
	} 
	
	
	//get
	public Node get() {
		
		return head;
	}
	
	
	public static void main(String[] args) {
	System.out.println("LRUCache");	
	}

}
