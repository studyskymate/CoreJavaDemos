package com.studyskymate.dinesh.corejava.strings.threading.sync;

public class Printer {
	boolean printOdd = false;

	public void printEven(int n) throws InterruptedException {
		synchronized (this) {

			while (!printOdd) {
				wait();
			}

			System.out.println(Thread.currentThread().getName() + " " + n);
			printOdd=false;
			notifyAll();
		}
	}

	public void printOdd(int n) throws InterruptedException {
		synchronized (this) {
			while (printOdd) {
				wait();
			}
			System.out.println(Thread.currentThread().getName() + " " + n);
			printOdd=true;
			notifyAll();

		}
	}

}
