package com.acte.StringsEx;

import java.lang.String;
public class StringIntro {

	public static void main(String[] args) {
		String name = "prasanna";
		String name1 = "Prasanna";
		System.out.println(name.toUpperCase());
		System.out.println(name.equalsIgnoreCase(name1)); //
		System.out.println(name.charAt(7));
		System.out.println(name.length());
		for (int i = 0; i <= 7; i++) {
			System.out.println(name.charAt(i));
		}
       System.out.println("----------------------------------------");
       String studentName ="bharath"; //concatination
        System.out.println(studentName + " Kumar"); // bharath kumar
        System.out.println(studentName); //
       String a="prasanna";
       a="bharath";
       System.out.println(a);
	}
	//

}
