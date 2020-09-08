package com.studyskymate.dinesh.corejava.strings.threading.sync;

public class PrintEvenOddTester {

	public static void main(String[] args) {
		Printer p = new Printer();

		TaskEvenOdd te1 = new TaskEvenOdd(10, p, true);
		TaskEvenOdd te2 = new TaskEvenOdd(10, p, false);

		Thread t1 = new Thread(te1);
		Thread t2 = new Thread(te2);

		t1.start();
		t2.start();

	}

}
