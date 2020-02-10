package com.studyskymate.dinesh.corejava.dsa;

import java.util.Arrays;
import java.util.Collections;

public class CustomSort {

	public static void main(String[] args) {
		Integer arr[]= {1,2,6,8,5,3};
		
		int n= arr.length;
		int l=0;
		int r=n-1;
		int k=0;
		
		  while(l<r) {	
			while(arr[l]%2 ==0) {
				l++;
				k++;
			}
			while(arr[r]%2!=0 && l<r) {
				r--;
			}
			
			//swap
			int temp=arr[l];
			arr[l]=arr[r];
			arr[r]=temp;
	
		}
		
		 Arrays.sort(arr, 0, k); 
		 Arrays.sort(arr, k,n);
		 
		 for(Integer i:arr) {
			 System.out.print(i+" ");
		 }
		 
		 
		 
	}

}
