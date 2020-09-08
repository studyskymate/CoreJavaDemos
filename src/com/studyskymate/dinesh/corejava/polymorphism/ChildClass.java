package com.studyskymate.dinesh.corejava.polymorphism;

import java.io.IOException;

public class ChildClass extends ParentClass{


   ChildClass() {super(); System.out.println("child constructor"); }

	
<<<<<<< HEAD
	public void displayChild() throws Exception {
		super.display();
=======
	public void displayChild() {
		
			try {
				super.display();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
>>>>>>> a4d0a0cc2ccb7bfd1b8ec41f300c009908298b03
		
		System.out.println(" DC "+super.x);
	}
	
<<<<<<< HEAD
   public long display() throws Exception{
	 System.out.println("child");
	 return x;
=======
   public void display() throws NullPointerException {
		System.out.println("");
>>>>>>> a4d0a0cc2ccb7bfd1b8ec41f300c009908298b03
	}
	
	
    void displayD() {
		System.out.println("");
	}
   
	public static void main(String[] args) {
		ChildClass c= new ChildClass();
	 try {
		c.displayChild();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
