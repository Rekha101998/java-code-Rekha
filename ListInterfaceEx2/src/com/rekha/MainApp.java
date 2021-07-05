package com.rekha;
import java.util.ArrayList;


import com.rekha.example.Product;
public class MainApp {

	public static void main(String []args) {
		
		ArrayList <Product>productsList = new ArrayList();
		
		productsList.add(new Product(101, "Monitor", 10000.00f));
		productsList.add(new Product(102, "Mouse", 5000.00f));
		productsList.add(new Product(103, "Keyboard", 6000.00f));
		productsList.add(new Product(104, "SMPS", 700.00f));
		
		System.out.println("Total number of products = " + productsList.size());
		
		
		System.out.println("Using toString() method of ArrayList class");
		
		System.out.println(productsList);
		
		System.out.println("Using index for loop");
		for(int i=0; i<productsList.size();i++)
		{
			System.out.println(productsList.get(i));
		}
		
		System.out.println("Using Enhanced for loop");
		for(Product p:productsList)
		{
			System.out.println(p);
		}
		
	}
		
		
		
		
		
		




	}

}
