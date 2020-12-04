package com.studyskymate.dinesh.corejava.exceptions;

public class TestCustom {

	public void display() throws CustomEx {
		throw new CustomEx("My Exception");
	}
	
	
	public static void main(String[] args) {
		TestCustom t=new TestCustom();
		try {
			t.display();
		} catch (CustomEx e) {
			System.out.println(" Ex : " +e.getMessage());
		}
     
	}

}
