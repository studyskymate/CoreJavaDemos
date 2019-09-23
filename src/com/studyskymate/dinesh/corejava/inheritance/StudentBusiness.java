package com.studyskymate.dinesh.corejava.inheritance;

public interface StudentBusiness {

	public void registerStudent();
	public void calCulateGrades();
	public void activateStudents();
	public void checkStatusOfStudents();
	
	 default void common() {
	 	
	 }
	
     default void common2() {
		
	 }
}
