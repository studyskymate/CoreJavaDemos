package com.studyskymate.dinesh.corejava.exceptions;

public class ExceptionEx2 {

	public static void main(String[] args) {
		int number1=100;
		int number2=0;
		try {
		int result_div= number1/number2;
		System.out.println(result_div);
		}catch(ArithmeticException ex) {
			System.out.println(ex);
		}
	}
}



