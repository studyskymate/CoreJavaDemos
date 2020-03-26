package com.studyskymate.dinesh.corejava.java82;

import com.studyskymate.dinesh.corejava.java8.CalCulate;

public class CalCulateImpl {

	public static void main(String[] args) {
		CalCulate c = (x,y)->{System.out.println(x+y);};
		
        c.sum(10, 20);
        c.sum2(2, 3);
        c.sum3(3, 3);
	}

}
