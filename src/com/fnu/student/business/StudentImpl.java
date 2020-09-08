package com.fnu.student.business;

import java.util.HashMap;
import java.util.Map;

public class StudentImpl implements Student{

		static{
		
Map<Integer, String> map= new HashMap<Integer, String>();
 map.put(1001, "Fancis");
 map.put(1002, "Kumar");
 map.put(1003, "ABAC");	
		}

	@Override
	public String getStudetName(int id) {
		String name="";
		return name;
	}

	@Override
	public String getStudetGrade(int id) {
		
		return null;
	}

	@Override
	public String getStudetMarks(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean saveStudentData(int id) {
		// TODO Auto-generated method stub
		return false;
	}



}
