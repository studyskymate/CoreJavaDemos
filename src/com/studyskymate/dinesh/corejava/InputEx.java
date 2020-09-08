package com.studyskymate.dinesh.corejava;

import java.util.Scanner;

public class InputEx {



	public static void main(String[] args) {	
		
		 Scanner sc =new Scanner(System.in);
	     System.out.println("Enter first number");
	     int x = sc.nextInt();
	     
	     System.out.println("Enter second number");
	     int y = sc.nextInt();
	     
	     sc.close();
	     
	     int result=x+y;     
	     System.out.println("The sum is:  "+ result);
		

	}

}
