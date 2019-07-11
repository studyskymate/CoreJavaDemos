package com.studyskymate.dinesh.corejava.strings.gui;

import java.awt.Button;
import java.awt.Frame;

public class AwtEx2 {
	AwtEx2(){
		Frame f=new Frame();
		Button b=new Button("Click");  
		b.setBounds(50, 50, 60, 60);
		f.add(b);
		f.setSize(300,300);  
		f.setLayout(null);  
		f.setVisible(true);  
	}
	
	public static void main(String[] args) {
		AwtEx2 a=new AwtEx2();

	}

}
