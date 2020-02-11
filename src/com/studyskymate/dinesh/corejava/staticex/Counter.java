package com.studyskymate.dinesh.corejava.staticex;

public class Counter {

	static int counter;
	
   Counter(){
		counter++;	//1+1=2+1=3 
	}
	public static void main(String[] args) {
		Counter counterObj1=new Counter();  
		Counter counterObj2=new Counter();  
		Counter counterObj3=new Counter(); 
		
		System.out.println(counter);		
	}
}
