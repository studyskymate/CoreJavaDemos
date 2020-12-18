package com.studyskymate.dinesh.corejava.strings.threading;

public class Care {

	public static void main(String[] args) {

		Object lock = new Object();

		Runnable r = () -> {
			synchronized (lock) {

				for (int i = 0; i < 10; i++) {
					if (i % 2 != 0) {
						
					   try {
						lock.wait();
						System.out.println(i +Thread.currentThread().getName());
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}}else {
						System.out.println(i +Thread.currentThread().getName());
						lock.notify();
					}
					/*
					 * try { Thread.currentThread().sleep(1000); } catch (InterruptedException e) {
					 * // TODO Auto-generated catch block e.printStackTrace(); }
					 */
				}
				
			}

		};

		Runnable r2 = () -> {
			synchronized (lock) {
				for (int i = 0; i < 10; i++) {
					if (i % 2 == 0) {
						System.out.println(i);
					 lock.notify();
					}
					/*
					 * try { Thread.currentThread().sleep(1000); } catch (InterruptedException e) {
					 * // TODO Auto-generated catch block e.printStackTrace(); }
					 */
				}
				
			}
		};

		
		Thread t = new Thread(r);
		Thread t2 = new Thread(r2);
		
		t.start();

		t2.start();

	}

}
