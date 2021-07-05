package com.rekha;
import java.util.List;
import java.util.ArrayList;
public class MainApp {

	public static void main(String[] args) {
		List numbers = new ArrayList();
		
		//Add
		numbers.add(19);
		numbers.add(10);
		numbers.add(12);
		numbers.add(19);
		numbers.add(14);
		
		System.out.println("ArrayList number = " + numbers);
		
		//Size
		System.out.println("Size of ArrayList =" + numbers.size());
		
		//overloadede version of aad -
		numbers.add(1,30);
		System.out.println("ArrayList number = " + numbers);
		
		numbers.add(1,40);
		System.out.println("ArrayList number = " + numbers);
		
		//remove
		
		numbers.remove(3);
		System.out.println("ArrayList remove number = " + numbers);
		
		//contain
		
		System.out.println("Array List containc number or not check = " + numbers.contains(40));
		
		
		
	}

}
