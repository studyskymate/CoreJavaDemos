package com.studyskymate.dinesh.corejava.file;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteToFileEx {

	public static void main(String[] args) throws IOException {
		
		String content = "Hello World !!";
		content+="\n";
		content+="Bye";
		 
		 Files.write(Paths.get("D:/product.txt"), content.getBytes());
	}

}
