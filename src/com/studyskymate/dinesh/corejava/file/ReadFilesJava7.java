package com.studyskymate.dinesh.corejava.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadFilesJava7 {

	public static void main(String[] args) throws IOException {
		File file = new File("D:/file/product.txt");
		FileReader filereader = new FileReader(file);
		BufferedReader br = new BufferedReader(filereader);

		String line;
		while ((line = br.readLine()) != null) {
			System.out.println(line);
		}
	}
}
