package com.studyskymate.dinesh.corejava;

import java.util.stream.Stream;

public class A {

	public static void main(String[] args) {
		String[] languages = {"Java", "Python", "JavaScript"};
		Stream numbers = Stream.of(languages);
		numbers.forEach(System.out::println);
	}

}
