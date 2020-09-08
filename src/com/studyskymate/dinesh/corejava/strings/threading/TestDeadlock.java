package com.studyskymate.dinesh.corejava.strings.threading;

public class TestDeadlock {

	



	public static void main(String[] args) {
		final  String res1 = "resourse1";
		final  String res2 = "resourse2";

		Thread t = new Thread() {
			public void run() {
				synchronized (res1) {
					System.out.println(" Locked Res1");
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (res2) {
					System.out.println(" Locked Res2");
				}
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				synchronized (res2) {
					System.out.println(" Locked Res2");
				}
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				synchronized (res1) {
					System.out.println(" Locked Res1");
				}
			}
		};
		
		t.start();
		t2.start();
	}

}
