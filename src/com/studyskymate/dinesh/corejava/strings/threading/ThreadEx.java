package com.studyskymate.dinesh.corejava.strings.threading;

public class ThreadEx extends Thread{

	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i +""+ Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Main");
		ThreadEx t1=new ThreadEx();
		ThreadEx t2=new ThreadEx();
		t1.start();
		
	   // t1.join();
		t2.start();
	}

}
