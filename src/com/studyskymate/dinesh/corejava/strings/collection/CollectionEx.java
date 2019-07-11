package com.studyskymate.dinesh.corejava.strings.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class CollectionEx {

	public static void main(String[] args) {
	
		
		ArrayList<String> a =new ArrayList<String>();
		a.add("a");
		a.add("b");
		
		for(String l:a) {
			System.out.println(l);
		}
		
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "MAP1");
		map.put(2, "MAP2");
		  
		   Iterator<Map.Entry<Integer, String>> itr =map.entrySet().iterator();
		
		   while(itr.hasNext()) {
			   Map.Entry<Integer, String>  entry=itr.next();
			   
			   System.out.println("KEY: "+entry.getKey());
			   System.out.println("VALUE: "+entry.getValue());
		   }
		   
		   
		System.out.println(map.get(1));
		//Hashtable,Queue,etc
		
		

	}

}
