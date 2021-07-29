package com.rekha;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.IOException;
public class MainApp {

	public static void main(String[] args) throws IOException {
        File reff = new File("c:/Users/records.txt");
        
        if(reff.exists()==false)
        	System.out.println("file not exist");
        else
        {
        	FileInputStream fin = new FileInputStream(reff);
        	InputStreamReader isr = new InputStreamReader(fin);
        	
        	int code;
        	while(true)
        	{
        		code = isr.read();
        		if(code==-1)
        			break;
        		
        		char ch = (char)code;
        		System.out.print(ch);
        	}
        	isr.close();
        }

	}

}
