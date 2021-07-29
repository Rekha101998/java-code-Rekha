package com.rekha;

public class MainApp {

	public static void main(String[] args) {
		
		Thread t1 = new Thread() {

			@Override
			public void run() {
				//task 1
				try {
					Thread.sleep(5000);
				} catch(InterruptedException e) {}
				System.out.print("\n Hello Thread 1");
				
			}
			
	};
	      Thread t2 = new Thread() {
	    	  @Override
			public void run() {
				//task 2
	    		  try {
						Thread.sleep(3000);
					} catch(InterruptedException e) {}
				System.out.print("\n Hello Thread 2");
			}
	    	  
	    	  
	      };
	      
	      Thread t3 = new Thread() {

			@Override
			public void run() {
				//task 3
				try {
					Thread.sleep(1000);
				} catch(InterruptedException e) {}
				for(int i=1;i<=10;i++) {
					System.out.println(i);
				}
			     
				
			   }

	      };
	      t1.start();
	      t2.start();
	      t3.start();
	      
	      
	    
		

	}

}
