package com.studyskymate.dinesh.corejava.polymorphism;

public abstract class ParentAbstract {

	private int i;
	protected int i2;
	ParentAbstract(){
		System.out.println("constr");
		i=10;
		i2=i;
	}

	
	{
		i=20;
		System.out.println("i="+i);
	}
	

	public static void main(String[] args) {
		

	}

}
