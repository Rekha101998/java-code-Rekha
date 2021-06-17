package com.Rekha.child;

import com.Rekha.parent.Employee;

public class CloudEng extends Employee {

	@Override
	public void completeJob(String msg) {
		System.out.println("Employee is now Cloud Engineer. " + msg);	
		}
	

}
