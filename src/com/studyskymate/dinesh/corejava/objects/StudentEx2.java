package com.studyskymate.dinesh.corejava.objects;

public class StudentEx2 {

	Integer rollNumber;
	StudentEx2(int rollNumbr){
		this.rollNumber=rollNumbr;
	}
	
	public void display() {
		System.out.println(rollNumber);
	}
	public static void main(String[] args) {
		StudentEx2 student=new StudentEx2(100);
		student.display();
	}

}
