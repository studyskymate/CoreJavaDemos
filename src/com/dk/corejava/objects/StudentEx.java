package com.dk.corejava.objects;

public class StudentEx {

	int rollNumber;
	
	public void assignData(int rollNumbr) {
		this.rollNumber=rollNumbr;
	}
	public void display() {
		System.out.println(rollNumber);
	}
	public static void main(String[] args) {
		StudentEx student=new StudentEx();
		student.assignData(100);	
		student.display();
	}

}
