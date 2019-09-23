package com.studyskymate.dinesh.corejava.strings;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringsEx {

	public static void main(String[] args) {

		 String s= "India";
		 Map<String,Integer> m=new HashMap<String,Integer>();
		 
		 String[] c= s.split("");
		
		 for(String str:c) {
		   if(m.get(str) != null) {
			   m.get(str);
			   m.put(str,m.get(str)+1);
		   }else {
			   m.put(str,1);  
		   } 
		 }
	   
		 int row=5;
		 for (int i = 0; i <= 5; i++) 
	        {
	            //Printing i spaces at the beginning of each row
	             
	            for (int j = 1; j <= i; j++) 
	            {
	                System.out.print(" ");
	            }
	             
	            //Printing j *'s at the end of each row 
	             
	            for (int j = row; j > 0; j--) 
	            {
	                    System.out.print("* ");
	            }
	             
	            System.out.println();
	             
	            //Decrementing the row
	             
	            row--;
	        }
	    
	    
		
		
	}

}
