package com.Rekha.example;

public class SmartPhone extends Gadget {

	@Override
	public void create() {
	  System.out.println("smart Phone Object Created..");
		
	}

	@Override
	public void remove() {
		System.out.println("smart Phone Object Deleted..");
		
	}

	@Override
	public void show() {
		System.out.println("smart Phone Object using show function..");
		
	}

}
