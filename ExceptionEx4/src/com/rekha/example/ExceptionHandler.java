package com.rekha.example;
import java.util.InputMismatchException;

public class ExceptionHandler extends Exception {
  
	public String errorCode;
    public String errMsg;
    
  public ExceptionHandler()
  {
	  super();
	  errorCode ="E0031"; 
	  errMsg = "Unhandled Exception";
  }
  
  public ExceptionHandler(Object exObj)
  {
	  if(exObj instanceof ArithmeticException)
	  {
		  errorCode = "E0032"; 
		  errMsg = "Division by ero is not valid";
	  }
	  else if(exObj instanceof InputMismatchException)
	  {
		  errorCode = "E0033"; 
		  errMsg = "Input is not valid.heck this type";
	  }
	  else if(exObj instanceof ArrayIndexOutOfBoundsException)
	  {
		  errorCode ="E0034"; 
		  errMsg = "Array index not valid";
	  }
	  else if(exObj instanceof ClassCastException )
	  {
		  errorCode ="E0035"; 
		  errMsg = "Class can not cast to the type you except. Check its valid or correct type";
	  }
	  else if(exObj instanceof Exception)
	  {
		  errorCode ="E0035"; 
		  errMsg = "Exception IS Unknown";
	  }
	  
	  }

@Override
public String toString() {

	return "ExceptionHandler [errorCode="+ errorCode + ", errMsg=" + errMsg +"]";
}
	  
  }


