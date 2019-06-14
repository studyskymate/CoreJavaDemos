package com.studyskymate.dinesh.corejava.exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {
		int x = 100;
		int y = 0;
		try {
			int z = x / y;
			System.out.println("z=" + z);
		}catch(ArithmeticException ex) {
			System.out.println("ArithmeticException :"
					   + ex.getMessage());
		} 
		catch (Exception ex) {
			System.out.println("You have provided wrong input :"
		   + ex.getMessage());
		}
		finally {
		System.out.println("Finally");	
		}
		System.out.println("z1=");

	}

}
