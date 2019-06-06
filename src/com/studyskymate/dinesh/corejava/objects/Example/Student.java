package com.studyskymate.dinesh.corejava.objects.Example;

public class Student {

	int rollNumber;
	String name;
	
	Student(){
		System.out.println("Constructor");
		}
	
	Student(int rollNumber)
	{
		this.rollNumber=rollNumber;
	}
	
	Student(int rollNumber,String name)
	{
		this.rollNumber=rollNumber;
		this.name=name;
	}
	
	public void assignValue(int rollnumber) {
		this.rollNumber=rollnumber;
	}
	
	
	public static void main(String[] args) {
		
		Student sudentObject1= new Student();
		

		sudentObject1.rollNumber=100;
		sudentObject1.name="DDD";
		
		System.out.println(sudentObject1.rollNumber);
		System.out.println(sudentObject1.name);
		
		
		Student sudentObject2= new Student(101);
		System.out.println(sudentObject2.rollNumber);
		
	}

}
