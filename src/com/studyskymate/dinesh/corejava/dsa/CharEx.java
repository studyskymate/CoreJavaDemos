package com.studyskymate.dinesh.corejava.dsa;

import java.lang.reflect.Array;

public class CharEx {

	public static void main(String[] args) {
		
		for(int i=0;i<256;i++) {
			char c=(char) i;
			System.out.println((c));
		}
		
		boolean[] b= new boolean[256];
	
		for(boolean b1:b) {
			System.out.println(b1);
		}
		
		int[] in= new int[256];
		for(int i1:in) {
			System.out.println(i1);
		}
	}

}
