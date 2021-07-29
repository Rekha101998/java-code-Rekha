package com.rekha;

import java.io.File;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.io.IOException;
import java.io.FileOutputStream;

public class MainApp {

	public static void main(String[] args)throws IOException {
		Scanner scan = new Scanner(System.in);
		
		File reff = new File("c:/Users");
		if(reff.exists()==false)
		{
			System.out.println("File not exist");
			reff.createNewFile();
			System.out.println("New File Created");
		}
		else
		{
			String username;
			System.out.println("enter username:");
			username = scan.next();
			
			FileOutputStream fout = new FileOutputStream(reff, true);
			OutputStreamWriter osw = new OutputStreamWriter(fout);
			
			osw.write("\n" + username);
			osw.close();
		}

	}

}
