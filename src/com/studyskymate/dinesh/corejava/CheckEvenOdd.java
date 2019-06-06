package com.studyskymate.dinesh.corejava;

import java.util.Scanner;

public class CheckEvenOdd {

	public static void main(String[] args) {
		int x;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a numner");
		
		x = sc.nextInt();
		if (x % 2 == 0) {
			System.out.println("It is Even Number");
		} else {
			System.out.println("It is Odd Number");
		}
	}
}
