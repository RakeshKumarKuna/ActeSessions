package com.acte.AdvanceTopics;

import java.time.LocalDate;
import java.util.Date;  

public class MainApp {

	public static void main(String[] args) {
 /// two ways
// string litaral
	/*	String str1="Prasanna";  
		String str2="Prasanna";
        String str3=new String("Bharath");
        String str4=new String("Bharath");
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        System.out.println(str3);
        System.out.println(str4);
       System.out.println("-----------------------------"); 
         System.out.println(str1==str2); // true 
         System.out.println(str3==str4); // false  
         */
		// parent class can hold child class objects
		Cat obj=Cat.createCatObject();
	     System.out.println(obj);
	     //based on the input 
	     Animal obja= Animal.createObject("cat");   //dog object
	    System.out.println(obja);
	}

}
