package com.studyskymate.dinesh.corejava;

import java.util.Scanner;

public class CheckGrades {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks");
		int marks = sc.nextInt();

		if (marks >= 90) {
			System.out.println("Grade A");
		} else if (marks >= 80 && marks < 90) {
			System.out.println("Grade B");
		} else if (marks >= 60 && marks < 80) {
			System.out.println("Grade C");
		} else if (marks >= 40 && marks < 60) {
			System.out.println("Grade D");
		} else if (marks < 40) {
			System.out.println("Grade E");
		} else {
			System.out.println("Invalid");
		}
	}

}
