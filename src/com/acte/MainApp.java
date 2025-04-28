package com.acte;
import com.acte.Operations.*;
public class MainApp {	
	public static void main(String[] args) {
		try {
			Thread.sleep(5000);
			System.out.println("Hello world");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	 Addition.addition(45, 84);
	 Sub.subtraction(84, 4);
	}

}
