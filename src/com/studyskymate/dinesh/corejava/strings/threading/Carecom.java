package com.studyskymate.dinesh.corejava.strings.threading;

public class Carecom implements Runnable{

	int remainder;
	
	public Carecom(int i) {
	this.remainder=i;
	}
      volatile int limit=10;
      volatile int num=0;
	@Override
	public void run() {
	
		while(num<limit) {
			if(num%2==0) {
			printOdd();	
			}
			
		}
		
	}
	
	private void printOdd() {
		
		
	}

	public static void main(String[] args) {
		Carecom c1= new Carecom(1);
		Carecom c2= new Carecom(0);
		
		Thread t1= new Thread(c1);
		Thread t2= new Thread(c2);
		
	}


	
	
	

}
