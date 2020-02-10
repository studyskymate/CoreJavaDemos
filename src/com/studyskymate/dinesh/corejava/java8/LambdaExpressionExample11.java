package com.studyskymate.dinesh.corejava.java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaExpressionExample11 {

	public static void main(String[] args) {
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(1, "Samsung A5", 17000f));
		list.add(new Product(3, "Iphone 6S", 65000f));
		list.add(new Product(2, "Sony Xperia", 25000f));
		list.add(new Product(4, "Nokia Lumia", 15000f));
		list.add(new Product(5, "Redmi4 ", 26000f));
		list.add(new Product(6, "Lenevo Vibe", 19000f));
		list.add(new Product(7, "Lenevo Vibe", 19000f));
		
		Stream<Product> s =list.stream().filter(p->p.price>1000);
		s.forEach(p->System.out.println(p.id));

		Stream<Product> filtered_data = list.stream().filter(p -> p.price > 20000);

		filtered_data.forEach(p -> System.out.println(p.id +" "+p.name));
		
		System.out.println("************");
		list.forEach(System.out::print);
		System.out.println("************");
		
        Collections.sort(list,(p1,p2)->{
        	 return p1.name.compareTo(p2.name);  
        });
         
        list.forEach(p->System.out.println(p.id+" "+p.name));
        System.out.println("************");
        
       List<Float> list11   =list.stream().filter(p -> p.price>1500).map(p->p.price).collect(Collectors.toList());
        
       Stream.iterate(1, element->element+1)  
       .filter(element->element%5==0)  
       .limit(4)  
       .forEach(System.out::println); 
       
       System.out.println("************");
        Float f=list.stream().map(p->p.price).reduce(0.0f,(sum,price)->sum+price);
       System.out.println("f:"+f);
       Float f2=list.stream().map(p->p.price).reduce(0.0f,Float::sum);
       System.out.println("f1:"+f2);
       
       double d=list.stream().collect(Collectors.summingDouble(p->p.price));
       System.out.println("d:"+d);
       System.out.println("************");
       
       Product p=list.stream().max((p1,p2)->p1.price >p2.price ?1:-1).get();   
       System.out.println(p.price);
       Product p11=list.stream().min((p1,p2)->p1.price >p2.price ?1:-1).get();   
       System.out.println(p11.price);
       
       StringJoiner joinNames = new StringJoiner(",");
       joinNames.add("Dinesh");
       joinNames.add("Kumar");
       System.out.println(joinNames.toString());
       
	}

}
