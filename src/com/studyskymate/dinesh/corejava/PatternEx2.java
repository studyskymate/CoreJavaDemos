package com.studyskymate.dinesh.corejava;

public class PatternEx2 {

	public static void main(String[] args) {

		int i, j, k;
		//outer loop for row
		for (i = 1; i <= 5; i++) {
			//inner loop: print space
			for (j = 4; j >= i; j--) {
				System.out.print(" ");
			}
			
			//inner loop: print * with space
			for (k = 1; k <= i; k++) {
				System.out.print("* ");
			}
			//Print next line
			System.out.println("");
		}

	}
}
