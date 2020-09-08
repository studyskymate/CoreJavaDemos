package com.studyskymate.dinesh.corejava.dsa;

import java.util.ArrayList;
import java.util.List;

public class ArrayProgram {
        
	public static void main(String[] args) {
		
    int size=10;
	int numbers[] =new int[size];

	for(int i=0;i<10;i++) {
		numbers[i]=i;
	}
	
	for(int i:numbers) {
		System.out.println(i);
	}
	}


}
