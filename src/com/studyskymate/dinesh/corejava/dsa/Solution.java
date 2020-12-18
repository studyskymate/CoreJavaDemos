package com.studyskymate.dinesh.corejava.dsa;

public class Solution {


	    public static int removeDuplicates(int[] nums) {

	      if (nums.length == 0) return 0;
	    int i = 0;
	    for (int j = 1; j < nums.length; j++) {
	        if (nums[j] != nums[i]) {
	            i++;
	            nums[i] = nums[j];
	        }
	    }
	    System.out.println(i+1);
	    System.out.println("HII");
	
	    
	    return i + 1;
	    }
	
	public static void main(String[] args) {
		int num[]= {1,1,2,2,2,3,4,5};
		
		removeDuplicates(num);
	    for (int j = 0; j < num.length; j++) {
				System.out.print(num[j]);
			}

	}

}
