package com.studyskymate.dinesh.corejava.dsa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MaxSumContiguous {

	public static void main(String[] args) {
	 
		List<Integer> arr=new ArrayList<Integer>();
		
		//arr=Arrays.asList(-2, -3, 4, -1, -2, 1, 5, -3);
		arr=Arrays.asList(-2,1,-3,4,-1,2,1,-5,4);
		
		
        long maximum = Long.MIN_VALUE, currentMax = 0; 
  
        for (Integer i:arr) 
        { 
            currentMax = currentMax + i; 
            if (maximum < currentMax) 
                maximum = currentMax; 
            if (currentMax < 0) 
                currentMax = 0; 
        } 
        
		System.out.println("maximum:" +maximum);
			
	}

}
