package com.studyskymate.dinesh.corejava.objects;

import java.util.Scanner;

public class Student {
	
	String firstName;
	
	Student(){
		System.out.println("1111");
	}
	
	Student(String name){
		this.firstName=name;
	}
	
	public void assignValue(String name) {
		this.firstName=name;
	}
	
	
	public static void main(String[] args) {
		Student studentObj = new Student("kumar");//creating object
		
		//assigning value to instance variable
		
		//studentObj.firstName="Dinesh";  
		
		studentObj.assignValue("dkkk");
		System.out.println("Name: "+studentObj.firstName );
	}
	
	
}
