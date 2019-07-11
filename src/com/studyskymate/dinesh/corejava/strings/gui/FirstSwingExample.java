package com.studyskymate.dinesh.corejava.strings.gui;

import javax.swing.*;  
public class FirstSwingExample {  
public static void main(String[] args) {  
JFrame f=new JFrame();//creating instance of JFrame  
          
JButton b1=new JButton("click1");//creating instance of JButton  
b1.setBounds(130,100,100, 40);//x axis, y axis, width, height  

JButton b2=new JButton("click2");   
b2.setBounds(50,50,100, 40);//x axis, y axis, width, height 

f.add(b1);//adding button in JFrame  
f.add(b2);        
f.setSize(400,500);//400 width and 500 height  
f.setLayout(null);//using no layout managers  
f.setVisible(true);//making the frame visible  

}  
}  