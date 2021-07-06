package com.rekha;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Comparator;

import com.rekha.example.Employee;



public class MainApp {

	public static void main(String[] args) {
		List <Employee>empList = Arrays.asList(
				
				new Employee(193,"Rekha", 19000.00),
				new Employee(194,"Kisan", 22000.00),
				new Employee(195,"Kritika", 30000.00),
				new Employee(196,"Vilas", 34000.00),
				new Employee(197,"Ashwini", 54000.00)
				);
		
		Collections.sort(empList,new Comparator<Employee>() {

			@Override
			public int compare(Employee e1, Employee e2) {
				if(e1.empCode > e2.empCode)
				return 1;
				
				else if (e1.empCode > e2.empCode)
					return -1;
				
				else
					return 0;
			}
			
		          
		        
				
		});
		
		System.out.println("Employee list after sorting using Comparator,");
		for(Employee emp:empList)
		{
			System.out.println(emp);
		}
		

	}

}
