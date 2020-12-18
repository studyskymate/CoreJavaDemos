package com.studyskymate.dinesh.corejava.strings.threading;

import java.io.IOException;

public class ThreadDemo extends Thread{

	public static void main(String[] args) {
		  try {
			Runtime.getRuntime().exec("notepad++");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
