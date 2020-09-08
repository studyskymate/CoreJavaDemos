package com.studyskymate.dinesh.corejava.dsa;
// Java Program to create concatenation of all 
// substrings in lexicographic order. 
import java.util.*; 

class GFG 
{ 
	

static String lexicographicSubConcat(String s) 
{ 
	int n = s.length(); 

	// Creating an array to store substrings 
	int sub_count = n*(n+1)/2; 
	String []arr = new String[sub_count];	 

	// finding all substrings of string 
	int index = 0; 
	for (int i = 0; i < n; i++) 
		for (int len = 1; len <= n - i; len++) 
		{ 
			System.out.println("i="+i+" len="+len+" "+(i+len)+" "+s+" "+s.substring(i, i+len));
				arr[index++] = s.substring(i, i+len); 
		} 
	// Sort all substrings in lexicographic 
	// order 
	
	for(String s1: arr) {
		System.out.println(s1);
	}
	
	Arrays.sort(arr); 

	// Concatenating all substrings 
	String res = ""; 
	for (int i = 0; i < sub_count; i++) 
		res += arr[i];	 
		
	return res; 
} 

// Driver code 
public static void main(String[] args) 
{ 
	String s = "abc"; 
	System.out.println(lexicographicSubConcat(s)); 
} 
} 

// This code has been contributed by 29AjayKumar 
