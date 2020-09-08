package com.studyskymate.dinesh.corejava.strings;

public class FirstLargest {

	public static void main(String[] args) {
		
	int arr[]= {1,3,4,5,10,3,2,32,-35};
	
	 int max=Integer.MIN_VALUE;
	//max=32
     for(int i=0;i<arr.length;i++) {
    	  int element=arr[i];
    	   if(max < element) {
    		   max= element;
    	   }
    	 
     }
	
	System.out.println(max);
	}

}
