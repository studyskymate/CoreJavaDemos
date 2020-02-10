package com.studyskymate.dinesh.corejava.strings.threading;

class TestSynchronization1 {
	synchronized void  printTable(int n) {// method not synchronized
		for (int i = 1; i <= 5; i++) {
			System.out.println(n * i);
			try {
				Thread.sleep(400);
			} catch (Exception e) {
				System.out.println(e);
			}
		}

	}
}

class MyThread1 extends Thread {
	TestSynchronization1 t;

	MyThread1(TestSynchronization1 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(5);
	}

}

class MyThread2 extends Thread {
	TestSynchronization1 t;

	MyThread2(TestSynchronization1 t) {
		this.t = t;
	}

	public void run() {
		t.printTable(100);
	}
}

class TestSynchronization {
	public static void main(String args[]) {
		TestSynchronization1 obj = new TestSynchronization1();// only one object
		MyThread1 t1 = new MyThread1(obj);
		MyThread2 t2 = new MyThread2(obj);
		t1.start();
		t2.start();
	}
}
