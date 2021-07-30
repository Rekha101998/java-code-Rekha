package com.rekha;
import com.rekha.TestThread;
public class MainApp {

	public static void main(String[] args) {
		TestThread t1 = new TestThread();
		TestThread t2 = new TestThread();
		
		t1.start();
		t2.start();
		
		System.out.println("Main function ends here...");
		

	}

}
