package com.rekha.example;

public class Product {
	
	private int prodCode;
	private float price;
	private String prodName;
	
	public Product()
	{
		this.prodCode = -1;
		
		this.prodName = "#UnknownProdName";
		this.price = 0.0f;
	}
	public Product(int prodCode, String prodName,  float price) {
		super();
		this.prodCode = prodCode;
		
		this.prodName = prodName;
		this.price = price;
	}
	@Override
	public String toString() {
		return String.format("%10d %20s %10.2f", this.prodCode, this.prodName, this.price);
	}
	

}