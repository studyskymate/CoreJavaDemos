package com.studyskymate.dinesh.corejava;

import java.util.Scanner;

public class Test2 {

	public static void main(String... args) {
		// code
		int T;
		double N;
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		while (T-- > 0) {
			N = sc.nextDouble();
			double n = 0;
			if (N == 0) {
				System.out.println("NO");
			} else {
				for (int i = 0; n < N; i++) {
					n = Math.pow(2, i);
				}
				if (n == N) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		}
		sc.close();
	}
}
