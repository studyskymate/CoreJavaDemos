package com.studyskymate.dinesh.corejava.polymorphism.copy;

//Method overloading through
public class CalculateSum {
	public static void main(String[] args) {
		CalculateSum c = new CalculateSum();
		//which function will call??
		int sum = c.sum(100, 100);  //first method called..
		//let us now pass double type parameters
		double sumDouble = c.sum(100.20, 100.30);
		int sum2 = c.sum(100, 100,200);
		System.out.println("Sum1= "+sum);
		System.out.println("SumDouble= "+sumDouble);
		System.out.println("Sum2= "+sum2);	
	}
	public int sum(int number1, int number2) {
		return number1 + number2;
	}
	
	//let change the datatype
	//now we have two functions with same name and number of parameter
	
	public double sum(double number1, double number2) {
		return number1 + number2;
	}
	
	private int sum(int i, int j, int k) {
		return i+j+k;
	}

}
