package com.studyskymate.dinesh.corejava.staticex;

public class Student {

	static String collegeName="ABC";
	
	static void display() {
		collegeName="FNU";
	}
	
	public static void main(String[] args) {
		
		display(); 
		System.out.println("College name:" +collegeName);

	}

}
