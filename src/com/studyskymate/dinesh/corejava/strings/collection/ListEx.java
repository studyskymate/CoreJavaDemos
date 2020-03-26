package com.studyskymate.dinesh.corejava.strings.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {
		

		List<String> l= new ArrayList<String>();
		l.add("zDinesh");
		l.add("Dinesh");
		l.add("Dinesh");
		l.add("Kumar");
		

for(String s:l) {
	s=s+50;
}

System.out.println(l);
l.stream().sorted((s1,s2)-> -s1.compareTo(s2)).forEach(System.out::println);


 List<Integer> l2= Arrays.asList(5,2,6,8,1,1);
 Integer i=l2.stream().filter(p->p>2).reduce(0,(a,b)->a+b);
  System.out.println(i); //19
 
  
  List<Integer> l3= Arrays.asList(8,5,5);
  Integer i3=l3.stream().filter(p->p>2).reduce(0,Integer::sum);
  System.out.println(i3);
   
  
  List<Integer> l4= Arrays.asList(1,2,3);
  Integer i4=l4.stream().reduce(1,Add::sum);
  System.out.println(i4);
	}

	static class Add{
	 public static int sum(int a,int b){
		 System.out.println("a: "+a+" b "+b);
		return a*b;
	 }
	}

}
