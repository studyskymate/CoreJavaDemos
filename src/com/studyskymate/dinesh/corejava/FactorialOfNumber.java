package com.studyskymate.dinesh.corejava;

import java.util.Scanner;

public class FactorialOfNumber {

	static int factorial(int n) {
		if (n == 0)
			return 1;
		else
			return (n * factorial(n - 1));
	}

	public static void main(String args[]) {
		int i, fact = 1;
		//Input the number
		System.out.println("Enter a Number");
		Scanner sc= new Scanner(System.in);
		int number = sc.nextInt();
		
		fact = factorial(number);
		System.out.println("Factorial of " + number + " is: " + fact);
	}
}
