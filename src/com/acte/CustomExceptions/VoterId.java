package com.acte.CustomExceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class VoterId {
public void method() throws UserNotFoundException,ArithmeticException,InputMismatchException,Exception {
	System.out.println("Enter Your Voter ID Number"); //8  digits and letters
	Scanner sc=new Scanner(System.in);
	//String id=sc.nextLine();
	String username=null;
	String userEntered=sc.nextLine();
     if(username==null) {
	    throw new UserNotFoundException("user is not found");
	}
	if(username.equals(userEntered)) {
		System.out.println("login");
	}else {
		System.out.println("check your username");
	}
}
	public static void main(String[] args) {
	VoterId name = new VoterId();
	try {
	name.method();
	}
	catch (Exception e) {
     e.getMessage();
	}
		/*	Integer convertedid=Integer.valueOf(id);
		if(id.length()==8) {
			System.out.println("Id Accepted");
		}
		else if(convertedid instanceof Integer)// converted number is a integer or not {
		{
		  throw new InputMismatchException("Please do not enter all the number");
		}*/
		 
          
		
	}

}
