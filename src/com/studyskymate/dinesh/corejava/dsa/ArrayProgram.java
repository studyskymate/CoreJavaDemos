package com.studyskymate.dinesh.corejava.dsa;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class ArrayProgram {

	public static void main(String[] args) {

		List<String> l = new ArrayList<String>();
		l.add("a");
		l.add("b");
		l.add("c");
		l.add("d");

		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i));
             
			
			 
		}

		Iterator<String> i = l.iterator();
		

		while (i.hasNext()) {
			String a=i.next();
			System.out.println();
			/*
			 * if(a.equals("b")) { l.add("new"); }
			 */
		}

		String s="abcdefgf";
		Map hm= new HashMap<Character, Integer>();
		//char[] c=s.toCharArray();
		
		for(int j=0;j<s.length();j++) {
			char c=s.charAt(j);
			if(hm.containsKey(c)) {
				int value=(int) hm.get(c);
				hm.put(c,value+1);
			}else {
				hm.put(c, 1);
			}
		}
		
		
       Iterator<Map.Entry<Character,Integer>>  itr =hm.entrySet().iterator();
	    while(itr.hasNext()) {
	         Map.Entry<Character, Integer> map = itr.next();
	         System.out.println(map.getKey()+" "+map.getValue());
	        
	    }
       
	

	

	}


}
