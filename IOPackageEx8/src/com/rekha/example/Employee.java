package com.rekha.example;

import java.io.Serializable;
import java.util.Scanner;

public class Employee implements Serializable{
	public int empCode;
	public String empName;
	public double salary;
	
	public void addEmployee()
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("\n Enter Employee code");
		empCode = scan.nextInt();

		System.out.print("\n Enter Employee name");
		empName = scan.next();
		
		System.out.print("\n Enter Employee salary");
		salary = scan.nextDouble();
		}

	@Override
	public String toString() {
		return "Employee [empCode=" + empCode + ", empName=" + empName + ", salary=" + salary + "]";
	}

	
	
	

}
