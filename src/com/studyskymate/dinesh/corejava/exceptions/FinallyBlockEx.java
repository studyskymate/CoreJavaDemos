package com.studyskymate.dinesh.corejava.exceptions;

public class FinallyBlockEx {

	public static void main(String[] args) {

		try {
			String name = null;
			name = name.trim();
			
		}catch (NullPointerException ex) {
			System.out.println("NullPointerException");
			
		}catch (Exception ex) {
			System.out.println("Exception");
		} finally {
			System.out.println("Finally Block");
			
		}
		System.out.println("Out of try catch finally");
	}

}
