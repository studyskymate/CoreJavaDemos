package com.studyskymate.dinesh.corejava.dsa;

import java.util.Arrays;

public class RemoveOverlapping {

	public static void main(String[] args) {
		String str=" asasa as a sa sas";
		System.out.println(str.split("s"));
		
		
		
		int substr[][] = { { 1, 4 }, { 5, 6 }, { 6, 7 } };
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(substr[i][j]);
			}
		}
	
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(substr[i][j]);
			}
		}
	}

}
