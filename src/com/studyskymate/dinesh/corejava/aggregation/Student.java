package com.studyskymate.dinesh.corejava.aggregation;

public class Student {
	
	Student( int id,String name,Address address){
		this.id=id;
		this.name=name;
		this.address=address;
	}
	 int id;
	 String name;
	 Address address;
	   
	public static void diaplay(Student student) {
		System.out.println(student.id);
		System.out.println(student.name);
		System.out.println(student.address.city);
	}; 
	
	public static void main(String[] args) {
		Address address=new Address("Suva");
		Student student=new Student(1, "Dinesh", address);
		diaplay(student);
	}


}
