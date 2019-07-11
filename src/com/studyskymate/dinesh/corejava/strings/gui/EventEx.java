package com.studyskymate.dinesh.corejava.strings.gui;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventEx extends Frame implements ActionListener,WindowListener{

	TextField tf;  
	EventEx(){
		  addWindowListener(this);  
		//create components  
		tf=new TextField();  
		tf.setBounds(60,50,170,20);
		Button b=new Button("click Here");
		b.setBounds(100,120,80,30);  
		b.addActionListener(this); //passing this instance
		add(b); add(tf);
		setSize(300,300);  
		setLayout(null);  
		setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		tf.setText("Welcome");  
	}
	
	public static void main(String[] args) {
		new EventEx();

	}

	@Override
	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent arg0) {
		 dispose();  
		
	}

	@Override
	public void windowClosing(WindowEvent arg0) {
		 dispose();  
		
	}

	@Override
	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
