package com.studyskymate.dinesh.corejava.constructor.bank;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	
		String bank;
		Scanner sc =new Scanner(System.in);
		
		 bank=sc.next();	
		
		if(bank.equals("ANZ")) {
			System.out.println(new ANZ().getrate());
			
		}else if(bank.equals("BSP")) {
			System.out.println(new BSP().getrate());
			
		}else if(bank.equals("Hfc")) {
			System.out.println(new Hfc().getrate());
		}
		

	}

}
