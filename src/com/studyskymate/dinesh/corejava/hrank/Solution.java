package com.studyskymate.dinesh.corejava.hrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
        
        /* Declare second integer, double, and String variables. */

        int i2;
        double d2;
        String s2;

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        
        i2=scan.nextInt();
        d2=scan.nextDouble();   
         s2=scan.next()+scan.nextLine();  
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+i2);
        /* Print the sum of the double variables on a new line. */
		DecimalFormat df=new DecimalFormat(".#");
        double sum2=d+d2;
        System.out.println(df.format(d+d2));
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
         System.out.println(s+s2);

        scan.close();
        
    }}
