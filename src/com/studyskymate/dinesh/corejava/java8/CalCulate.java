package com.studyskymate.dinesh.corejava.java8;

@FunctionalInterface
public interface CalCulate {
	void sum(int a, int b);

	default void sum2(int a, int b) {
		System.out.println("sum");
	}

	default void sum3(int a, int b) {
		System.out.println("sum");
	}

	static void sum4(int a, int b) {
		System.out.println("sum");
	}

	static void sum5(int a, int b) {
		System.out.println("sum");
	}

}
