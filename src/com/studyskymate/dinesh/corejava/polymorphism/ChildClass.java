package com.studyskymate.dinesh.corejava.polymorphism;

public class ChildClass extends ParentClass{


   ChildClass() {super(); System.out.println("child constructor"); }

	
	public void displayChild() {
		super.display();
		
		System.out.println(" DC "+super.x);
	}
	
   public void display() {
		
	}
	
	
	public static void main(String[] args) {
		ChildClass c= new ChildClass();
	 c.displayChild();
	}

}
