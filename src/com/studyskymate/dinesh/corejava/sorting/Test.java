package com.studyskymate.dinesh.corejava.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		 List<Employee> list=new ArrayList<Employee>();
			
		list.add(new Employee(1,"Z",20));
		list.add(new Employee(2,"G",20));
		list.add(new Employee(3,"C",18));
		list.add(new Employee(3,"B",17));
		list.add(new Employee(5,"A",16));

		Collections.sort(list,Collections.reverseOrder());
		
		list.forEach(System.out::print);
		
	}

}
