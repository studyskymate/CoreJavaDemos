package com.studyskymate.dinesh.corejava.java8;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileEx {

	public static void main(String[] args) {
		Path filePath=Paths.get("D:\\code", "a.txt");
		try(Stream<String> stream=Files.lines(filePath)){
			stream.forEach(s->System.out.println(s));		
		}catch(Exception ex) {
			
		}

	}
}
