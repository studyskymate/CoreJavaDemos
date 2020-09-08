package com.studyskymate.dinesh.corejava.polymorphism;

public class ChildClass extends ParentClass{


   ChildClass() {super(); System.out.println("child constructor"); }

	
	public void displayChild() throws Exception {
		super.display();
		
		System.out.println(" DC "+super.x);
	}
	
   public long display() throws Exception{
	 System.out.println("child");
	 return x;
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
