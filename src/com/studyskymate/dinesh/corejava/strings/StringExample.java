package com.studyskymate.dinesh.corejava.strings;

public class StringExample {
	public static void main(String args[]) {
		
		
		//  String a1 = null;
	    //	String a2 = "";
	    //	System.out.println(a2.length());
		
		
		System.out.println("Bloomington".charAt(0));
		System.out.println("***************");
		
		String city = "Bloomington";
		System.out.println(city.substring(2,6));
		
		
		String a1 = "hello";
		String a2 = "world";
		System.out.println(a1.concat(a2));
		
		//trim
		String temp="   abc  ";
		System.out.println(temp.length());
		System.out.println(temp.trim());
		
		
		 //string literal
		 String s1 = "java";// creating string by java string literal
	     //String pool
		
		char ch[] = { 's', 't', 'r', 'i', 'n', 'g', 's' };
		
		
		String s2 = new String(ch);// converting char array to string
		
		String s3 = new String("example");// creating java string by new keyword
		//heap memory
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		String name = "ceitfiji";
		char ch1 = name.charAt(4);// returns the char value at the 4th index
		System.out.println(ch1);

		// out of bound
		String name1 = "ceit";
		//char ch2 = name1.charAt(10);// returns the char value at the 10th index
	//	System.out.println(ch2);

		
            //string buffer
			StringBuffer sb=new StringBuffer("Hello ");  
			sb.append("Java");//now original string is changed  
			System.out.println(sb);//prints Hello Java  
			
			
		
				StringBuilder sbl=new StringBuilder("Hello ");  
				sbl.append("Java");//now original string is changed  
				System.out.println(sbl);//prints Hello Java  
				
				StringBuilder sbi=new StringBuilder("Hello ");  
				sbi.insert(1,"Java");//now original string is changed  
				System.out.println(sbi);//prints HJavaello  
				
				StringBuilder sbr=new StringBuilder("Hello");  
				sbr.replace(1,3,"Java");  
				System.out.println(sbr);//prints HJavalo  
		
		 
	}

}
