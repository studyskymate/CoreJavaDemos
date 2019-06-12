package com.studyskymate.dinesh.corejava.polymorphism.copy;

public class OverloadingEx2 {

	public static void main(String[] args) {

		System.out.println(sum(1, 7));
	}

	public static int sum(int x, int y) {
		System.out.println("Method1");
		return x + y;
	}

}
