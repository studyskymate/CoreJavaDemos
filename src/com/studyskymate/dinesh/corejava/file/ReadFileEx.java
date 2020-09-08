package com.studyskymate.dinesh.corejava.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFileEx {

	public static void main(String[] args) {
		
		Path filepath=Paths.get("D:\\file","product.txt");
		
		//try with resourse
		try (Stream<String> lines=Files.lines(filepath);){
			
		List<String> filteredLines=lines.filter(s->s.contains("Laptop"))
			.collect(Collectors.toList());
		
		filteredLines.forEach(System.out::println);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
