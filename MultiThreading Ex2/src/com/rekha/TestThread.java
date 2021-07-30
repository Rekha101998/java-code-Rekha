package com.rekha;

public class TestThread extends Thread{

	@Override
	public void run() {
		for(int i=1;i<=5;i++)
		{
			try {
				Thread.sleep(3000);
			}catch(Exception ex) {}
            
			System.out.println(Thread.currentThread().getName() + ":" +i);
		}
	}
	

}
