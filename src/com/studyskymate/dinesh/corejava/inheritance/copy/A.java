package com.studyskymate.dinesh.corejava.inheritance.copy;

public interface A {
	
	public void display();
	
	default void display1() {
		
		System.out.println("Interface");
	}
	

    static void display2() {
		
		System.out.println("Interface");
	}
	
    
  	
	
}
