package com.studyskymate.dinesh.corejava.exceptions;

public class ExceptionsThrowsExample {

	public void display() throws ArithmeticException {
		int divisor = 0;
		if (divisor == 0) {
			throw new ArithmeticException();
		}
		System.out.println("Display");
	}

	public static void main(String[] args) {
		ExceptionsThrowsExample et = new ExceptionsThrowsExample();

		try {
			et.display();
		} catch (ArithmeticException ex) {
			System.out.println("Arithmatic Exception");
		} catch (Exception ex) {
			System.out.println("Exception occured");
		}

	}

}
