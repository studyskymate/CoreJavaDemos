package com.studyskymate.dinesh.corejava.java8;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CompletableFutureEx {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(5);

		list.stream().map(num -> CompletableFuture.supplyAsync(() -> getNumber(num)))
				.map(CompletableFuture -> CompletableFuture.thenApply(n -> n * n))
				.
				map(t -> t.join())
				.forEach(s -> System.out.println(s));
		
		
		List<Integer> list2 = Arrays.asList(5,9,14);
		
		list2.stream().map(num->CompletableFuture.supplyAsync(()->getNumber(num)))
				.map(CompletableFuture->CompletableFuture.thenApply(n->n*n))
				.map(t->t.join())
				.forEach(s->System.out.println(s));

	}

	private static int getNumber(int a) {
		return a * a;
	}
	
	public Future<String> calculateAsync() throws InterruptedException {
	    CompletableFuture<String> completableFuture = new CompletableFuture<>();

	    Executors.newCachedThreadPool().submit(() -> {
	        Thread.sleep(500);
	        completableFuture.complete("Hello");
	        return null;
	    });

	    return completableFuture;
	}
}
