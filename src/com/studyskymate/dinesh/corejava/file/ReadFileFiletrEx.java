package com.studyskymate.dinesh.corejava.file;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.stream.Stream;

public class ReadFileFiletrEx {

	public static void main(String[] args) {
		
		Path filepath=Paths.get("D:\\file","product.txt");
		
		ArrayList<String> al = new ArrayList<String>();
		//try with resourse
		try (Stream<String> lines=Files.lines(filepath);){
			
			lines.forEach(e->al.add(e));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		for(String str:al) {
			System.out.println(str);
		}

	}

}
