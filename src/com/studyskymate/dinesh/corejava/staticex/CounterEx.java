package com.studyskymate.dinesh.corejava.staticex;

public class CounterEx {

    static int counter=1;
	
	CounterEx(){
		System.out.println("In Counter");
		counter++;
		System.out.println(counter);
	}
		
	public static void main(String[] args) {
		
		CounterEx c1=new CounterEx();
		CounterEx c2=new CounterEx();
		CounterEx c3=new CounterEx();

	}

}
