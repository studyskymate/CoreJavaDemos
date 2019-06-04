package com.dk.corejava.objects.Example;

public class Student {

	int rollNumber;
	
	Student(){
		System.out.println("Constructor");
		}
	
	Student(int rollNumber)
	{
		this.rollNumber=rollNumber;
	}
	
	
	public static void main(String[] args) {
		Student sudentObject1= new Student();
		sudentObject1.rollNumber=100;
		System.out.println(sudentObject1.rollNumber);
		
		Student sudentObject2= new Student(101);
		System.out.println(sudentObject2.rollNumber);
		
	}

}
