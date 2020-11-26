package com.studyskymate.dinesh.corejava.sorting;



public class Employee implements Comparable<Employee>{

	int id;
	String name;
	int age;
	
	
	public Employee(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

	@Override
	public int compareTo(Employee o) {
		return this.getName().compareTo(o.getName());
	}
	@Override
	public String toString() {
		return "SerializeDeser [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	
	
}
