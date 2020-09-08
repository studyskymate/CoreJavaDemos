package com.studyskymate.dinesh.corejava;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Test {
	private static DecimalFormat df2 = new DecimalFormat("#.##");
	public static void main(String[] args) {
	    
	    //1099511627776
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Double arr[] = new Double[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextDouble();
		}
		for (int i = 0; i < n; i++) {

			Double x = arr[i];
		 int num1=(int) Math.ceil(Math.log(x) / Math.log(2));
		 int num2=(int) Math.floor(Math.log(x) / Math.log(2));
			System.out.println(num1);
			System.out.println(num2);
			
			
			if (num1 == num2) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			    
			}
		}

	
	}

}
