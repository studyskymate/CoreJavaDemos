package com.studyskymate.dinesh.corejava.strings;

import java.util.Arrays;

public class AnagramEx {

	static final int MAX_CHAR = 256;

	public static void main(String[] args) {
		String a = "geeks";
		String b = "skgee";
		char[] c1 = a.toCharArray();
		char[] c2 = b.toCharArray();
		System.out.println(checkAnagram(c1, c2));

	}

	public static boolean checkAnagram(char[] c1,char[] c2) {
          boolean status=true;
	   
	    int[] count1= new int[MAX_CHAR];
	    int[] count2= new int[MAX_CHAR];
	    Arrays.fill(count1,0);
	    Arrays.fill(count2,0);
	 
	    if (c1.length!=c2.length) {
	    	System.out.println("False");
	    	return false;
	    }
	    for(int i=0;i<c1.length;i++) {
	    	count1[c1[i]]++;
	    	count2[c1[i]]++;
	    }
		
	    for(int i=0;i<MAX_CHAR;i++) {
	    	 if (count1[i] != count2[i]) 
	                return false; 
	    }
	    
		return status;
		
	}

}
