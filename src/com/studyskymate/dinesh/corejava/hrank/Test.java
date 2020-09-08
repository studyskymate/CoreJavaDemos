package com.studyskymate.dinesh.corejava.hrank;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		double x=10.0;
		
		double y=Math.round(x *10/10);
		System.out.println(y);
		
		DecimalFormat df = new DecimalFormat(".#");
		System.out.println(df.format(x));

	}

}
