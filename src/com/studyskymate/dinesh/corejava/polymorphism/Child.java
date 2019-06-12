package com.studyskymate.dinesh.corejava.polymorphism;

public class Child extends Parent{

	public Child() {
		//super();   //By default default constructor provided by class
		//First Parent class constructor called	
		//called parent class instance variable
		System.out.println("Called Super class instance variable: "+super.p);
		//called parent class method
		super.display();
		System.out.println("Child Constructor");	
	}

	//parent class method called from child class method 
	public void childMethod() {
		super.display();
		System.out.println(super.p);
	}
	
	public static void main(String[] args) {
	   //create object
		Child childObject= new Child();
	//	super.p;// can not use super in static context
		
		childObject.childMethod();
		
	}

}
