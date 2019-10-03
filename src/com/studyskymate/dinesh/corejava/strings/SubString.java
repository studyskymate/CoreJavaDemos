package com.studyskymate.dinesh.corejava.strings;

import javax.swing.*;

public class SubString {

	public static void main(String[] args) {
		
		   String letters = "abcdefghijklmabcdefghijklm";
		    
		          // test substring methods
	        String output = "Substring from index 20 to end is " +
	            "\"" + letters.substring( 20 ) + "\"\n";
		    
	        output += "Substring from index 3 up to 6 is " +
		             "\"" + letters.substring( 3, 6 ) + "\"";
		   
		   JOptionPane.showMessageDialog( null, output,
		            "String substring methods", JOptionPane.INFORMATION_MESSAGE );
		    
		          System.exit( 0 );
		      }


	}


