package com.studyskymate.dinesh.corejava.staticex;

public class StaticExample1 {
	
	StaticExample1(){
		System.out.println("constructor");
	}
	

	
	
	
	public static void main(String[] args) {
		StaticExample1 o=new StaticExample1();
	System.out.println("main");
	
	
	}
	
	static {
		System.out.println("static");
	}

}
