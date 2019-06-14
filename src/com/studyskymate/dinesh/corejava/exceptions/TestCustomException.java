package com.studyskymate.dinesh.corejava.exceptions;

public class TestCustomException {

	public void display() throws BusinessException {
		
		throw new BusinessException("Business Exception");
	}
	
	public static void main(String[] args)  {
		TestCustomException o=new TestCustomException();
	
			try {
				o.display();
			} catch (BusinessException e) {
				System.out.println("Exception :"+e.getMessage());
			}
		
	}

}
