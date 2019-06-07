package com.studyskymate.dinesh.corejava.inheritance.copy;

public class AImpl implements A,A1{

	public static void main(String[] args) {
		AImpl a=new AImpl();
      a.display();
	}

	@Override
	public void display() {
	System.out.println("display implemented");	
	}

}
