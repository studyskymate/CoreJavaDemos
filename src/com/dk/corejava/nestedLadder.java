package com.dk.corejava;

public class nestedLadder {

	public static void main(String[] args) {
		boolean backgroundCheckStatus = true;
		boolean result = true;

		if (result) {
			System.out.println("Passed the Exam");
			if (backgroundCheckStatus) {
				System.out.println("Eligible for the Job");
			} else {
				System.out.println("Not Eligible for the Job");
			}
		}

	}

}
