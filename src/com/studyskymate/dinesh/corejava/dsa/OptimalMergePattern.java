package com.studyskymate.dinesh.corejava.dsa;

import java.util.PriorityQueue;

public class OptimalMergePattern {

	public static void main(String[] args) {

		// no of files
		int size = 5;
	//	int files[] = { 2, 3, 4, 5, 6, 7 };
		
		int files[] = { 10, 20, 15, 5, 25};
		// total no of computations
		// do be done final answer
		System.out.println("Minimum Computations = " + minComputation(size, files));
	}

	private static int minComputation(int size, int[] files) {
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		for (int i = 0; i < size; i++) {
			pq.add(files[i]);
		}

		int count = 0;
		while (pq.size() > 1) {
			// pop minimum element from min heap
			int temp = pq.poll() + pq.poll();
			count += temp;
			// add the temp element again to the heap
			pq.add(temp);
		}

		return count;
	}

}
