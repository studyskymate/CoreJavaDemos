package com.studyskymate.dinesh.corejava.constructor;

public class StudentImpl extends Student{

	public static void main(String[] args) {
		StudentImpl studentImpl =new StudentImpl();
		studentImpl.calculatesum(10, 50);

		float marks = studentImpl.getMarks(10);
		System.out.println("marks "+marks);
	}

	public void calculatesum(int x,int y) {
		int sum=x+y;
		System.out.println("Sum "+sum);
	}

	@Override
	public float getMarks(int studentid) {
		// TODO Auto-generated method stub
		return 60.6f;
	}

	
	
}
