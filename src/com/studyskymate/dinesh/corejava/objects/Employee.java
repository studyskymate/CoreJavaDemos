package com.studyskymate.dinesh.corejava.objects;

public class Employee {
	int employeeId;
	Employee(int employeeId){
		this.employeeId=employeeId;
		System.out.println("SerializeDeser Id: "+employeeId);
	}

	public static void main(String[] args) {
		Employee employeeObj=new Employee(1001);

	}

}
