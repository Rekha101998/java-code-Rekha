package com.Rekha.child;
import com.Rekha.Category.Electronics*;
public class Television extends Electronics {
	private String devicename;
	private float price;
	
	public Television() {}
	
	
	public Television(String deviceName,float price) {
		super("Television");
		this.devicename = deviceName;
		this.price = price;
		
	}
	public void show()
	{
		System.out.println( super.prodType + "\t" + super.deviceType + this.deviceName + "\t" + this.price);
	}

}
