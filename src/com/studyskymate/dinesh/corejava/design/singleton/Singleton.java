package com.studyskymate.dinesh.corejava.design.singleton;

public class Singleton {

	//https://www.journaldev.com/1377/java-singleton-design-pattern-best-practices-examples
	
	private static Singleton instance;

	private Singleton() {

	}

	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null) {
					instance = new Singleton();
				}
			}
		}

		return instance;
	}

}
