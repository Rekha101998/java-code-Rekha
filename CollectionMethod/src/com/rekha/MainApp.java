package com.rekha;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;


public class MainApp {

	public static void main(String[] args) {
		List numberList = Arrays.asList(19,34,67,89,64,55);
		
		//sort//
		Collections.sort(numberList);
        System.out.println("List of Number is sorted:" + numberList);
		
        //BinarySearch//
		int position = Collections.binarySearch(numberList, 100);
		System.out.println("Position of item 100 in numberList=" + position);
		
		//Reverse//
		Collections.reverse(numberList);
		System.out.println("Reversr of Number list  " + numberList);
		
		//Shuffle//
		Collections.shuffle(numberList);
		System.out.println("Shuffel of Number list  " + numberList);
		
		//Swap//
		Collections.swap(numberList, 0, 5);
		System.out.println("Swapping of Number list  " + numberList);
		
		//fill//
		ArrayList <Float>emptyList = new ArrayList();
		emptyList.add(1.5f);
		emptyList.add(1.9f);
		Collections.fill(emptyList, 56.90f);
		System.out.println("Empty list after filling " + emptyList);
		
		//copy//
		Object []myarray = numberList.toArray();
		
		System.out.println("NumberList Converting to typr array");
		for(Object r:myarray);
		{
			System.out.println(r);
		}
	}

}
