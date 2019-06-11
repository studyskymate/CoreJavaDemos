package com.studyskymate.dinesh.corejava.inheritance;

public class StudentEx implements Student{

	public static void main(String[] args) {
		StudentEx o=new StudentEx();
		o.calculateMarks();

	}

	@Override
	public void calculateMarks() {
    System.out.println("hh");
	}

	@Override
	public void displayMarks() {
		
		
	}

}
