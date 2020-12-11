package com.studyskymate.dinesh.corejava.strings;

/* 
 * Save this in a file called Main.java and compile it. To test it 
 * create the file `input.txt` in the workspace / Working Directory
 * (For Eclipse/VisualStudio, by default this is the top level project folder)
 */

/* Do not add a package declaration */
import java.util.*;
import java.io.*;

/* DO NOT CHANGE ANYTHING ABOVE THIS LINE */
/* You may add any imports here, if you wish, but only from the 
   standard library */

/* Do not add a namespace declaration */
class Employee{

	int employeeId;
	String name;
	String department;
	int salary;
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", department=" + department + ", salary="
				+ salary + "]";
	}
	
	
}
public class Main {
    public static Map<String,Integer> processData(ArrayList<String> array) {
        /* 
         * Modify this method to process `array` as indicated
         * in the question. At the end, return a Map containing
         * the appropriate values
         *
         * Please create appropriate classes, and use appropriate
         * data structures as necessary.
         *
         * Do not print anything in this method.
         *
         * Submit this entire program (not just this method)
         * as your answer
         */
        Map<String,Integer> retVal = new HashMap<String,Integer>();
        List<Employee> listOfEmployees= new ArrayList<Employee>();
        for(String l: array) {
        	String[] str= l.split(",");
        	
        	if(str!=null) {
        		Employee e= new Employee();
        	if(str[0]!=null) {
        	e.setEmployeeId(Integer.valueOf(str[0].trim()));
        	}
          	if(str[1]!=null) {
            	e.setName(str[1].trim());
            	}	
          	if(str[2]!=null) {
            	e.setDepartment(str[2].trim());
            	}	
          	if(str[3]!=null) {
            	e.setSalary(Integer.valueOf(str[3].trim()));
            	}
          	
          	listOfEmployees.add(e);
        	}
        
        }
        
	
       Map<String, Employee> topEmployees= new HashMap<>();
    topEmployees =
    		   listOfEmployees.stream()
    		                .collect(java.util.stream.Collectors.groupingBy(
    		                    e -> e.department,
    		                    java.util.stream.Collectors.collectingAndThen(java.util.stream.Collectors.maxBy(java.util.Comparator.comparingInt(e -> e.salary)), Optional::get) 
    		                ));
    for (Map.Entry<String, Employee> entry : topEmployees.entrySet()) {
    
        retVal.put(entry.getKey(), entry.getValue().getEmployeeId());
        
    }

       return retVal;
    }

    public static void main (String[] args) {
        ArrayList<String> inputData = new ArrayList<String>();
        String line;
        try {
            Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));
            while(in.hasNextLine())
                inputData.add(in.nextLine());
            Map<String,Integer> retVal = processData(inputData);
            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
            for(Map.Entry<String,Integer> e: retVal.entrySet())
                output.println(e.getKey() + ": " + e.getValue());
            output.close();
        } catch (IOException e) {
            System.out.println("IO error in input.txt or output.txt ");
        }
    }
}
