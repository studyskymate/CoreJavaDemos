package com.studyskymate.dinesh.corejava.java8;

public interface Writer {
	 default void write() {
	        System.out.println("Writer default method");
	    }
	 
	 default void write2() {
	        System.out.println("Writer default method22");
	    }
	 
	 static void write3() {
	        System.out.println(" write Writer static default method");
	    }
}
