package com.studyskymate.dinesh.corejava;

public class PatternEx3 {

	public static void main(String[] args) {
		int row = 5;
		for (int i = 0; i <= 5; i++) {
			// Printing i spaces at the beginning of each row

			for (int j = 1; j <= i; j++) {
				System.out.print(" ");
			}

			// Printing j *'s at the end of each row

			for (int j = row; j > 0; j--) {
				System.out.print("* ");
			}

			System.out.println();

			// Decrementing the row 

			row--;
		}

	}

}
