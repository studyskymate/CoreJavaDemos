package com.studyskymate.dinesh.corejava.exceptions;

public class ExceptionEx4 {

	public static void main(String[] args) {
		int x=10;
		int y=0;
	
		try {
			int z = x / y;
			System.out.println("result "+z);
		} catch (ArithmeticException ex) {
			System.out.println("Arithmetic ex occured");
			System.exit(1);
		}
		catch (Exception ex) {
			System.out.println("Exception occured");
		}finally {
			System.out.println("Always runs : COnnections closing");
		}

		System.out.println("Hello");
		
	}

}
