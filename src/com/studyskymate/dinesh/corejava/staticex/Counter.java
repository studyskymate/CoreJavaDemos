package com.studyskymate.dinesh.corejava.staticex;

public class Counter {

	static int counter;
	
   Counter(){
		counter++;	
	}
	public static void main(String[] args) {
		Counter counterObj1=new Counter();  
		Counter counterObj2=new Counter();  
		Counter counterObj3=new Counter(); 
		
		System.out.println(counter);		
	}
}
