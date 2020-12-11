package com.studyskymate.dinesh.corejava.strings.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RemoveObj {
	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<Integer>();
<<<<<<< Updated upstream
		
		numbers.add(11);
		numbers.add(12);
		numbers.add(13);
		
		System.out.println("1ArrayList contains : " + numbers);//1,2,3   
		numbers.remove(new Integer(12));
=======
		numbers.add(1);
		numbers.add(2);
		numbers.add(3); 
		numbers.remove(2);
		System.out.println(numbers);
		
		//1,2,3 
		
>>>>>>> Stashed changes
		System.out.println("2ArrayList contains : " + numbers);//1,3 
		numbers.add(12);
		System.out.println("3ArrayList contains : " + numbers);//1,3,2
		
	   Iterator<Integer> itr =numbers.iterator();
	   
	   while(itr.hasNext()) {
		   Integer i=itr.next();
		   System.out.println("ITR: "+i);
		   if(i==12)
			   numbers.remove(new Integer(12));
	   }
	   
	   System.out.println("After ITR Remove ArrayList : " + numbers); //11,13
	}
}
