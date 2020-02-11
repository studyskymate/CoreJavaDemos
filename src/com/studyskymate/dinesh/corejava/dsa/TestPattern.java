package com.studyskymate.dinesh.corejava.dsa;

//Java program to demonstrate extracting first 
//letter of each word using Regex 
import java.util.regex.Matcher; 
import java.util.regex.Pattern; 

public class TestPattern 
{ 
	static void printFirst(String s) 
	{ 
		//Pattern p = Pattern.compile("\\b[a-zA-Z]"); 
		Pattern p = Pattern.compile("[a-zA-Z0-9]+"); 
		
		
		Matcher m = p.matcher(s); 

		while (m.find()) 
			System.out.println(m.group()); 

		System.out.println(); 
	} 

	public static void main(String[] args) 
	{ 
		String s1 = "1G1eeks for 1Geeks"; 
		String s2 = "A Computer Science Portal for Gee1ks"; 
		printFirst(s1); 
		printFirst(s2); 
	} 
} 
