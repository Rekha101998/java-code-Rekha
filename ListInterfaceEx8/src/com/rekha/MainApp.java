package com.rekha;

import java.awt.List;
import java.util.Collections;
import java.util.LinkedList;

public class MainApp {

	public static void main(String[] args) {
		
		LinkedList courseList = new LinkedList();
		courseList.add("Python");
		courseList.add("Java");
		courseList.add("Ruby");
		courseList.add("Swing");
		
		courseList.add(1, "SQL");
		courseList.set(2, "HTML");
		
		
		courseList.remove(2);
		
		Collections.sort(courseList);
		System.out.println("LinkedList Courses = " + courseList);
		

	}

}
