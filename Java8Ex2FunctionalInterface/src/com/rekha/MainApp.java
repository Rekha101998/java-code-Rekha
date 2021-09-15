package com.rekha;

public class MainApp {

	public static void main(String[] args) {
		SingleParameterInterface sp = (int number)->{System.out.println("Number is " + number);};
		
		sp.printInterface(100);
		
		TwoParameterInterface tp = (String un, String pw) -> {
			System.out.println("UserName : " + un + "and password :" + pw);
		};
			tp.printInterface("Rekha", "Rekha@1998");
		
		}
		
	}
	

	


