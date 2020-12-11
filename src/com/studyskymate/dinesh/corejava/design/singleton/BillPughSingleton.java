package com.studyskymate.dinesh.corejava.design.singleton;

public class BillPughSingleton {

	private static class BillPughSingletonInner{
		private static final BillPughSingleton INSTANCE= new BillPughSingleton();
	}
	
	public static BillPughSingleton getInstance(){
		
		return BillPughSingletonInner.INSTANCE;
		
	}
	
}
