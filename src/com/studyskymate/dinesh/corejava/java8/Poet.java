package com.studyskymate.dinesh.corejava.java8;

public interface Poet {

	default void write() {
		System.out.println("Poet's default method");
	}

	static void write3() {
		System.out.println("poet Writer static default method");
	}

}
