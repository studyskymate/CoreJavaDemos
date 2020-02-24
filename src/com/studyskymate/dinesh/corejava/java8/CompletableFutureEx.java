package com.studyskymate.dinesh.corejava.java8;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureEx {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5);

		list.stream().map(num -> CompletableFuture.supplyAsync(() -> getNumber(num)))
				.map(CompletableFuture -> CompletableFuture.thenApply(n -> n * n)).map(t -> t.join())
				.forEach(s -> System.out.println(s));

	}

	private static int getNumber(int a) {
		return a * a;
	}
}
