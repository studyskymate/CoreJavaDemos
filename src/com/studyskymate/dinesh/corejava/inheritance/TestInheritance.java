package com.studyskymate.dinesh.corejava.inheritance;

class Animal {
     void eat() {
		System.out.println("Eating...");
	}
}

class Dog extends Animal {
	void bark() {
		System.out.println("Barking...");
	}
}

class TestInheritance {
	public static void main(String args[]) {
		Animal a=new Animal();
		Dog d = new Dog();
		d.bark();
		d.eat();
		
	}
}
