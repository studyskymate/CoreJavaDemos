package com.studyskymate.dinesh.corejava.polymorphism;

public class C extends P{


	 public int calculate(int x,int y) 
	 { 
		 return x*y; 
	 }

	public static void main(String[] args) {
	
	     P p = new C() ;
     	//C p =  new C() ;
	
	System.out.println(p.calculate(2, 10));
	}

}
