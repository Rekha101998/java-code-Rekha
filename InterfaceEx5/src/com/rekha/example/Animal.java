package com.rekha.example;

public class Animal implements Bird, Fish{

	@Override
	public void move() {
		System.out.println("bird and fish common implemantation by Animal class..");
		
	}

}
