package com.studyskymate.dinesh.corejava.polymorphism;

public class StaticInitiEx {

	StaticInitiEx(){
		System.out.println("constr");
	}
	
	{  System.out.println("S I B"); }
	
	static {
		System.out.println("static");
	}
	
	public static void main(String[] args) {
		StaticInitiEx o = new StaticInitiEx();
		StaticInitiEx o2 = new StaticInitiEx();
	

	}

}
