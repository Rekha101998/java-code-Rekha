package com.rekha.example;

public class Employee {

	public int empCode;
	public String empName;
	public double salary;
	
	
	public Employee()
	{
		this.empCode = -1;
		this.empName = "xyz";
		this.salary = -1;
	}


	public Employee(int empCode, String empName, double salary) {
		super();
		this.empCode = empCode;
		this.empName = empName;
		this.salary = salary;
	}


	@Override
	public String toString() {
		
		return String.format("%10d %20s %10.2f", this.empCode, this.empName, this.salary);
	}
		

	

}
