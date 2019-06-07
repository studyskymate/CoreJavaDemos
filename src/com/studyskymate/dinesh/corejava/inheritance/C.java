package com.studyskymate.dinesh.corejava.inheritance;


public class C implements A,B{

	public static void main(String[] args) {
		C c =new C();
	    c.displayA();
        c.displayB();
	}

	@Override
	public void displayA() {
		System.out.println("Method from Interface A");
		
	}
	
	@Override
	public void displayB() {
		System.out.println("from Interface B");
		
	}

}
