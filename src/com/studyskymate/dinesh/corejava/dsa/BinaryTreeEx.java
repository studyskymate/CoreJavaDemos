package com.studyskymate.dinesh.corejava.dsa;




public class BinaryTreeEx {
  Node root;
	
	class Node{
		int data;
	    Node left;
	    Node right;
	    Node(int data){
	    	this.left=null;
	    	this.right=null;
	    }
	}
	
	public void add(int data) {
		Node newNode=new Node(data);
		if(root==null) {
			root=newNode;
		}else {
		Node tmp=root;
		while(tmp!=null) {
			
		if(data<tmp.data)
		
		{
			tmp.left=newNode;
		}
			
		}
		
		}
		
	}
	
	public static void main(String[] args) {
	
		
	}

}
