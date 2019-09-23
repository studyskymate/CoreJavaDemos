package com.studyskymate.dinesh.corejava.staticex;

public class Student {

	static String collegeName= "kjnahsjnasj";
	static int counter=1;
	
	static void display() {
		collegeName="FNU";
		
	}
	
	
	public void display1() {	
	System.out.println("Student");

	}
	
	public static void main(String[] args) {
		Student s=new Student();
		
		display(); 
		s.display1();
		
		System.out.println("College name:" +collegeName);

	}

}
