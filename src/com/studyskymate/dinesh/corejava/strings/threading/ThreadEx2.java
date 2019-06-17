package com.studyskymate.dinesh.corejava.strings.threading;

public class ThreadEx2 implements Runnable{

	public static void main(String[] args) {
		ThreadEx2 te=new ThreadEx2();
		Thread thread=new Thread(te);
		thread.start();
		
	}

	@Override
	public void run() {
		System.out.println("Thread is running");
	}

}
