package com.studyskymate.dinesh.corejava;

import java.math.BigInteger;

public class BinaryToDecimal {

	public static void main(String[] args) {
		
		int num=101;
		int temp=0;
		int p=0;
		while(num>0) {
			
			int rem=num%10;
		     temp+=(int) (rem*Math.pow(2, p));
		    num=num/10;
		    p++;
		}

		System.out.println("Dec: "+temp);
		num=temp;
		 int binary[] = new int[40];
	     int index = 0;
	     while(num > 0){
	       binary[index++] = num%2;
	       num = num/2;
	     }
	     for(int i = index-1;i >= 0;i--){
	       System.out.print(binary[i]);
	     }
	}

}
