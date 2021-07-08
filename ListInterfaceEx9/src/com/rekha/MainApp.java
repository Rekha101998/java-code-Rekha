package com.rekha;

import java.util.List;
import java.util.Vector;

public class MainApp {

	public static void main(String[] args) {
		Vector numbers = new Vector();
		
		for(int i=101;i<=120;i++)
			numbers.add(i);
		
		System.out.println("Vector Number = " + numbers );
		
		//remove()
         numbers.remove(2);
         System.out.println("vector after remov = " +numbers);
         
         //Add Element()
         Vector cities = new Vector();
         cities.addElement("Sangli");
         cities.addElement("Satara");
         cities.addElement("Solapur");
         
         System.out.println("Vector Cities = " + cities);
         
         System.out.println("Size of Vector = " + cities.size());
         
         //removeElement
         cities.removeElement("Satara");
         System.out.println("After remove element = " + cities);
         
         
         //removeAllElement()
         cities.removeAllElements();
         System.out.println("After remove Allelement = " + cities);
         
         //Add element
         Vector first = new Vector();
         first.addElement("Sweety");
         first.addElement("Angel");
         
         //clone
         Vector second = (Vector)first.clone();
         first.addElement("Kisan");
         
         System.out.println(first);
         System.out.println(second);
         
         //get
         System.out.println("Value at index 1 in Vector first = " + first.get(2));
         
         //sublist
         List someNumbers = numbers.subList(3, 10);
         System.out.println("someNumbers List = " +someNumbers);
         
         
         
         
         

         

		

	}

}
