package com.studyskymate.dinesh.corejava.strings.threading;

public class MultithreadingEx extends Thread{

	public void run() {
		for(int i=0;i<5;i++) {
			
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	 //checked exceptions
		
		System.out.println("Number "+i +" "+
		Thread.currentThread().getName());
		}
	}
	
	public static void main(String[] args) {
	 MultithreadingEx ex=new MultithreadingEx();
	 Thread thread1= new Thread(ex);
	 Thread thread2= new Thread(ex);
	  thread1.start();
	  try {
		thread1.join();
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  thread2.start();
	 
		
	}

}
