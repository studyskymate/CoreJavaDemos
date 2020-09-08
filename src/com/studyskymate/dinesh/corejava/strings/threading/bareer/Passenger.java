package com.studyskymate.dinesh.corejava.strings.threading.bareer;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class Passenger extends Thread{
    int duration;
	CyclicBarrier barrier;
	
	
	public Passenger(int duration, CyclicBarrier barrier,String name) {
		super(name);
		this.duration = duration;
		this.barrier = barrier;
	}


	@Override
	public void run() {
		try {
			Thread.sleep(duration); 
			System.out.println(Thread.currentThread().getName()+"  Arrived");
			int await = barrier.await();
			if(await == 0) {
				System.out.println("Four passengers have arrived so cab is going to start..");	
			}
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	


}
