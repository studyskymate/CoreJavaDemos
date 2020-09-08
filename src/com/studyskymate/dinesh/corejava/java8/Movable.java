package com.studyskymate.dinesh.corejava.java8;

@FunctionalInterface
public interface Movable {

void display();
	
default void move() {}

}
