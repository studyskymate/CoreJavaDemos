package com.fnu.student.business;

import java.util.HashMap;

public class OverloadEx {

		public static void main(String aa) {	
			
		     // Creating an empty HashMap 
	        HashMap<String, Integer> hash_map = new HashMap<String, Integer>(); 
	  
	        // Mapping int values to string keys 
	        hash_map.put("Geeks", 10); 
	        hash_map.put("4", 15); 
	        hash_map.put("Geeks", 20); 
	        hash_map.put("Welcomes", 25); 
	        hash_map.put("You", 30); 
	  
	        // Displaying the HashMap 
	        System.out.println("Initial Mappings are: " + hash_map); 
	  
	        // Getting the value of "Geeks" 
	        System.out.println("The Value is: " + hash_map.get("Geeks")); 
	  
	        // Getting the value of "You" 
	        System.out.println("The Value is: " + hash_map.get("You")); 
		}
	

}
