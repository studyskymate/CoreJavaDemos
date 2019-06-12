package com.studyskymate.dinesh.corejava.polymorphism;


public class StaticInitializerBlockExample {

	//take some variable
	int x;
	
	//Constructor
	public StaticInitializerBlockExample() {
	System.out.println("Constructor Called :" +x);
	}
	//Static Initializer Block
	{
		x=100; //Initializing value of instance variable
		System.out.println("Static Initializer Block Called");
	}

	public static void main(String[] args) {
		StaticInitializerBlockExample sib= new StaticInitializerBlockExample();
		//Static Initializer Block called each time when object created
		StaticInitializerBlockExample sib2= new StaticInitializerBlockExample();
		//Thanks
		
	}

}
