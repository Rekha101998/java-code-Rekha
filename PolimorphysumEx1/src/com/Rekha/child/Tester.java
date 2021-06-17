package com.Rekha.child;

import com.Rekha.parent.Employee;

public class Tester extends Employee {

	@Override
	public void completeJob(String msg) {
		
		System.out.println("Employee is not Tester, " +msg);
	}
	

}
