package com.studyskymate.dinesh.corejava.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Grade {

	public static void main(String[] args) {
		BufferedReader br = null;
		String strLine = "";

		try {
			br = new BufferedReader(new FileReader("D:\\marks.txt"));

			while ((strLine = br.readLine()) != null) {
                 float a=Float.valueOf(strLine);
             
              // System.out.println(a);
                     /*  A+ >= 85%,
            		   A >= 70% to < 85%
            		   B >= 60% to < 70 %
            		   C >= 50% to < 60%
            		   D >= 40% to < 50%
            		   F < 40%*/

               if(a>=85) {
            	   System.out.println("A+");
               }else if(a>=70 && a<85) {
            	   System.out.println("A");
               }else if(a >= 60 && a<70) {
            	   System.out.println("B");
               }else if(a >= 50 && a<60) {
            	   System.out.println("C");
               }else if(a >= 40 && a<50) {
            	   System.out.println("D");
               }else if(a<40){
            	   System.out.println("F");
               }
	
			}
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
