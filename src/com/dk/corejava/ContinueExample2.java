package com.dk.corejava;

public class ContinueExample2 {

	public static void main(String[] args) {
		/** 
		This  
		is  
		documentation  
		comment 
		*/  
		loop1:
			for(int i=0;i<3;i++) {
				loop2:
				for (int j=0;j<3;j++) {
					if(j==1) {
						continue loop1;
					}
					System.out.println(i+" "+j);
				}
			}

	}

}
