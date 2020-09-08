package com.studyskymate.dinesh.corejava.file;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WriteToFileEx2 {

	public static void main(String[] args) {

		Path path = Paths.get("D:/file/product1.txt");

		// Use try-with-resource to get auto-closeable writer instance
		try (BufferedWriter br = Files.newBufferedWriter(path);) {
			br.write("Hello Fiji");
			System.out.println("Written: Please check file");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
