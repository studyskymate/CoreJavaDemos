package com.studyskymate.dinesh.corejava.polymorphism;

import java.io.IOException;

public class ChildClass extends ParentClass{


   ChildClass() {super(); System.out.println("child constructor"); }

	
	public void displayChild() {
		
			try {
				super.display();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		System.out.println(" DC "+super.x);
	}
	
   public void display() throws NullPointerException {
		System.out.println("");
	}
	
	
	public static void main(String[] args) {
		ChildClass c= new ChildClass();
	 c.displayChild();
	}

}
