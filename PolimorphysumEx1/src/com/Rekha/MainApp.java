package com.Rekha;

import com.Rekha.child.CloudEng;
import com.Rekha.child.Developer;
import com.Rekha.child.Tester;
import com.Rekha.parent.Employee;

public class MainApp {

	public static void main(String[] args) {
	
		Employee emp;
		
		emp = new Employee();
		emp = completeJob("parent class reference");
		
		emp = new Developer();
		emp.completeJob("Child class msg");
		
		emp = new Tester();
		emp = completeJob("Child class tester");
		
		emp = new CloudEng();
		emp = completeJob("Child Class CloudEng");

	}

	private static Employee completeJob(String string) {
		// TODO Auto-generated method stub
		return null;
	}

		}


