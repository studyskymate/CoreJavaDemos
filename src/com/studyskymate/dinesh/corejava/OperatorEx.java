package com.studyskymate.dinesh.corejava;

public class OperatorEx {

	public static void main(String[] args) {
	
		int i=10;
		
		boolean b1=Boolean.TRUE;
		System.out.println(!b1);
		
		int a=10; int b=2;
		System.out.println(a<<b);   //10*2^2=40
		System.out.println(10<<3);   //10*2^3=80
		System.out.println("---------------------------");
		
		System.out.println(10>>3);   //10 /2^3=
		
		System.out.println(i++);
		System.out.println(i);
		if(i==11) {
			System.out.println(" VALUE 11");
		}else if(i==10) {
			System.out.println("VALUE 10");
		}else {
			System.out.println("In else part");
		}
		
		 i=5;
		
		System.out.println(i--);
		System.out.println(i);
		if(i==11) {
			System.out.println(" VALUE 11");
		}else if(i==10) {
			System.out.println("VALUE 10");
		}else {
			System.out.println("In else part");
		}
		
		i=20;
		
		System.out.println(++i);
		System.out.println(i);
		if(i==21) {
			System.out.println(" VALUE 21");
		}else if(i==10) {
			System.out.println("VALUE 10");
		}else {
			System.out.println("In else part");
		}
		
		System.out.println(--i);
		System.out.println(i);
		if(i==21) {
			System.out.println(" VALUE 21");
		}else if(i==10) {
			System.out.println("VALUE 10");
		}else {
			System.out.println("In else part");
		}
		


	}

}
