package com.studyskymate.dinesh.corejava.strings.threading.sync;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableEx {

	public static void main(String[] args) {
		Callable c = () -> {
			return new Random().nextInt(10);
		};
		Callable c2 = () -> {
			return new Random().nextInt(10);
		};

		ExecutorService ex = Executors.newFixedThreadPool(10);
		Future<Integer> future = ex.submit(c);
		
		
		try {
			Integer i=future.get();
			System.out.println("O: "+Thread.currentThread().getName()+" "+i);
		} catch (InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 

	
		
		
	}

}
