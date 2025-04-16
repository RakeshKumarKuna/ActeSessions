package com.acte.Objects;
// class student , create 10 student objects from the user input data
import java.util.Scanner;

//100
public class StudentEx {
   int studentRoll;
   String studentName;                                               
  static String schoolName;

     
	public static void main(String[] args) {
		StudentEx obj1=new StudentEx();
		System.out.println("Enter student roll no");
		Scanner obj=new Scanner(System.in);
		obj1.studentRoll=obj.nextInt();
		System.out.println("enter student name");
		obj1.studentName=obj.next();

	}
}