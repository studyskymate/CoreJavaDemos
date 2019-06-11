package com.studyskymate.dinesh.corejava.inheritance;

public interface Student {

	public void calculateMarks();
	public void displayMarks();
	
	default void commonFunction() {
		System.out.println("common");
	}
}
