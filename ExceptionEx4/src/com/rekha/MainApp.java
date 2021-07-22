package com.rekha;

import java.util.InputMismatchException;
import java.util.Scanner;
import com.rekha.example.ExceptionHandler;

public class MainApp {

	public static void main(String[] args) {
      int no, d, pos;
      Scanner scan = new Scanner(System.in);
      
      String []users = {"Smith", "Rekha","Kritika","Kisan","Kritwik"};
      
      try
      {
            System.out.print("Enter Number:");
    	  no = scan.nextInt();
    	  
    	  System.out.print("Enter Number:");
    	  d = scan.nextInt();
    	  
    	  float ans = no/d;
    	  System.out.println("Division = " + ans);
    	  
    	  System .out.print("Enter index number to print username:");
          pos = scan.nextInt();
          
          System.out.println("User at index " + pos + "=" + users[pos]);
          
	}
      catch(ArithmeticException ex)
      {
    	  System.out.println(new ExceptionHandler(ex));
      }
      catch(ArrayIndexOutOfBoundsException ex)
      {
    	  System.out.println(new ExceptionHandler(ex));
      }
      catch(InputMismatchException ex)
      {
    	  System.out.println(new ExceptionHandler(ex));
      }
      catch(Exception ex)
      {
    	  System.out.println(new ExceptionHandler(ex));
      }
      finally
      {
    	  System.out.println("finally...");
    	  
      }
      System.out.println("~End of Programm~");

}
}