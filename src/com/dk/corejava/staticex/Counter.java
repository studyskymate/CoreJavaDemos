package com.dk.corejava.staticex;

public class Counter {

	static int counter;
	
	Counter(){
		counter++;
		System.out.println(counter);
	}
	
	public static void main(String[] args) {
		//Creating objects  
		Counter counterObj1=new Counter();  
		Counter counterObj2=new Counter();  
		Counter counterObj3=new Counter(); 
		
	}

}
