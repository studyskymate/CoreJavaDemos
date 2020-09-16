package com.studyskymate.dinesh.corejava.strings;

public class StringEval {

	public static void main(String[] args) {
		
	 char[] c= {'A','b','c','d','e'}; 
		
	 System.out.println(new Integer(c[0]));
	 
	 //ABCD 65
	 //abcd 97
	 
	 if('a'>'A') {
		 System.out.println("Hey:  a is greater than A ");
	 }else{
		 System.out.println("Oh:  a is smaller than A ");
	 }
	 
	 
	 
	  String str= new String(c);
	 
	  
	  
	  
	  System.out.println(str.charAt(0));
	  
	  System.out.println(str.concat("fg"));	
	  
	  System.out.println(str.charAt(0));
	  
	  System.out.println(str);	
	  
	  char[] c2= str.toCharArray();
	  
	  for(char cref:c2) {
		  System.out.print(cref);
	  }
	  System.out.print("**********");
	  
	  for(int i=0; i<c2.length;i++ ) {
		  System.out.print(c2[i]);
	  }
		//print in reverse i.e edcba
	  System.out.print("**********");
	  for(int i=c2.length-1; i>=0;i-- ) {
		  System.out.print(c2[i]);
	  }
	  
	  
	  
	}
}
