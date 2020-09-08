package com.studyskymate.dinesh.corejava.java8;

public class Multitalented implements Poet, Writer {

	public static void main(String[] args) {
		Multitalented m = new Multitalented();
		m.write();
	}

	//Need to override the ambiguous method otherwise there will be compile time error
	@Override
	public void write() {
		Writer.super.write();
		System.out.println("In Multitalented class");
	}

}
