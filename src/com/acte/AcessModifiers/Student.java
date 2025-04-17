package com.acte.AcessModifiers;

public class Student {
	//access modifiers
	// public,private defulat, protected
	//
 int stuRoll;
 String stuName;
String stuGender;
public Student() {
	// TODO Auto-generated constructor stub
}
public Student(int roll, String name) {
stuRoll=roll;
stuName=name;
}
public Student(int roll, String name,String Gender) {
	stuRoll=roll;
	stuName=name;
	stuGender=Gender;
}

public void displayStudentDetailes() {
	System.out.println(stuRoll+" "+stuName);
}

void displayStudentDetailesbk() {
	System.out.println(stuRoll+" "+stuName);
}

void displayStudentGenders() {
	System.out.println(stuRoll+" "+stuName+" "+stuGender);
}

}
