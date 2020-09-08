package com.fnu.student.business;

public class Test {

	public static void main(String[] args) {
		
      Student student = new StudentImpl();
      
    String  s = student.getStudetName(12);
	
    System.out.println(s);
	}

}
