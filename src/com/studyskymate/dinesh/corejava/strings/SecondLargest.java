package com.studyskymate.dinesh.corejava.strings;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class SecondLargest {

	public static void main(String[] args) {

		int[] arr = { 12, 3, 4, 5, 232 };

		int m1 = Integer.MIN_VALUE;
		int m2 = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > m1) {
				m2 = m1;
				m1 = arr[i];
		}
		}
		System.out.println(m1 + "," + m2 + ",");
		
		
		String anotherDate = "04 Apr 2016";
		 
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd MMM yyyy");
		LocalDate random = LocalDate.parse(anotherDate, df);
		 
		System.out.println(anotherDate + " parses as " + random);
	

}}
