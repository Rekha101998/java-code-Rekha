package com.rekha;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

import com.rekha.example.Employee;

public class MainApp {

	public static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		createEmployeeRecord();

	}
	public static void createEmployeeRecord()throws IOException{
		File reff = new File("c:/users/emprecords.bin");
		if(reff.exists()==false)
		{
			reff.createNewFile();
			System.out.print("Employee Records new binary file created");
		}
		else
		{
			ArrayList<Employee>empList = new ArrayList();
			
			while(true)
			{
				Employee emp = new Employee();
				emp.addEmployee();
				empList.add(emp);
				
				System.out.print("\n Do you want to add new Employee Record ? :");
				String ans = scan.next();
				
				if(ans.equalsIgnoreCase("yes"))
				{
					continue;
				}
				else
				{
					break;
				}
			}
			
			FileOutputStream fout = new FileOutputStream(reff);
			ObjectOutputStream ostream = new ObjectOutputStream(fout);
			
			ostream.writeObject(empList);
			System.out.println("\n Employee Records in the binary file");
			
			ostream.close();		}
	}

}
