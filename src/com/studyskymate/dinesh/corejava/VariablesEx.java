package com.studyskymate.dinesh.corejava;

public class VariablesEx {
    static int a=10; //static variable
    int b=20; //instance v
    
	public static void main(String[] args) {
	System.out.println(a);
	
	VariablesEx o= new VariablesEx();
	o.display();
	System.out.println(o.b);
	}
	
	public void display() {
		 int b=50;  //local variable
		 System.out.println(b);
	}
	
	
	

}
