package com.studyskymate.dinesh.corejava.dsa;

import java.util.HashMap;
import java.util.Map;
 
public class StringExample 
{
    public static void main(String[] args) 
    {
        String blogName = "howtodoinjava dot com";
        char[] chars = blogName.toCharArray();
         
        Map<Character, Integer> map = new HashMap<>();
        for(char c : chars) 
        {
            if(map.containsKey(c)) {
                int counter = map.get(c);
                map.put(c, ++counter);
            } else {
                map.put(c, 1);
            }
        }
         
        System.out.println("Duplicate characters:");
         
        //Print duplicate characters
    
        for(char c:map.keySet()) {
        	if(map.get(c)>1) {
        		System.out.println(c);
        	}
        }
         
        System.out.println("Duplicate characters excluding white space :");
         
        //Print duplicate characters excluding white space
        for(char c : map.keySet()) {
            if(map.get(c) > 1 && !Character.isWhitespace(c)) {
                System.out.println(c);
            }
        }
         
        System.out.println("Distinct characters:");
         
        //Print distinct characters
        for(char c : map.keySet()) {
            if(map.get(c) == 1) {
                System.out.println(c);
            }
        }
        
        map.forEach((k,v)->
          System.out.println("k: "+k+" "+v)
        
        		);
        
        
    }
}
