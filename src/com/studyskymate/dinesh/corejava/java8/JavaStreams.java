package com.studyskymate.dinesh.corejava.java8;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
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
    	
    //	Stream<Integer> stream1  = Stream.of(new Integer[] {10,20,30});
    	//stream1.forEach(p->System.out.print(" "+p));
    	
    	//Convert to List
    //	List l=stream.filter(p->p>10).collect(Collectors.toList());
   // 	Integer[] a=stream.filter(p->p>10).toArray(Integer[]::new);
    	
        List<Integer> l11= Arrays.asList(12,232,223232);
    //	List l22=l11.parallelStream().filter(p-> p>232).collect(Collectors.toList());
	
    //	l22.forEach(System.out::print);
    	
	}

}
