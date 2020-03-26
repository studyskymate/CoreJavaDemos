package com.studyskymate.dinesh.corejava.strings.threading.bareer;

import java.util.concurrent.CyclicBarrier;

public class TestBareer {

	public static void main(String[] args) {
		CyclicBarrier barrier=new CyclicBarrier(4);
		Passenger p1=new Passenger(1000, barrier, "Dinesh");
		Passenger p2=new Passenger(2000, barrier, "Rahul");
		Passenger p3=new Passenger(2000, barrier, "Sham");
		Passenger p4=new Passenger(2000, barrier, "Anil");
		
		Passenger p5=new Passenger(1000, barrier, "Dinesh");
		Passenger p6=new Passenger(2000, barrier, "Rahul");
		Passenger p7=new Passenger(2000, barrier, "Sham");
		Passenger p8=new Passenger(2000, barrier, "Anil");
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
		p6.start();
		p7.start();
		p8.start();
		
	}

}
