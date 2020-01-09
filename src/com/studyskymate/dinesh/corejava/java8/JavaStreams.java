package com.studyskymate.dinesh.corejava.java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Stream;

public class JavaStreams {

	public static void main(String[] args) {
           List<Integer> list= Arrays.asList(10,15,16,9);
         //  int j = list.stream().filter(i->i>10).mapToInt(i->i).sum();
           int j = list.stream().mapToInt(i->i).sum();
           System.out.println(j);
           
           //option2
         int sum=0;
         Iterator<Integer> i=list.iterator();

         while(i.hasNext()) {
        	 int x=i.next();
        	 sum=sum+x;
        
         }
    	 System.out.println("option 2 ="+sum);
    	 //option3
    	 
    	Stream<Integer> stream  = Stream.of(10,20,30);
    	stream.forEach(p->System.out.print(p));
	
	}

}
