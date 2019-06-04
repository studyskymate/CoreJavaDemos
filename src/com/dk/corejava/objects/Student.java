package com.dk.corejava.objects;

public class Student {

	String firstName;
	
	public static void main(String[] args) {
		Student studentObj = new Student();//creating object
		
		//assigning value to instance variable
		studentObj.firstName="Dinesh";  
		
		System.out.println("Name: "+studentObj.firstName );
	}
}
