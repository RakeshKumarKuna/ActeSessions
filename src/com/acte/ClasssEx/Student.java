package com.acte.ClasssEx;

public class Student {
	int stuId;
	String stuName;
	//0 -param constucter
	public Student(){
		System.out.println("defulat constucter");
	}
	public Student(String name,int id){
		//System.out.println("two param constucter");
		stuId=id;
		stuName=name;
	}
	public void nonStaticMethod() {
		System.out.println("Student.nonStaticMethod()");
	}
	public static void staticMethod() {
		System.out.println("Student.staticMethod()");
	}
	public static void main(String[] args) {
		Student stu=new Student("bharath",87);
	    System.out.println(stu.stuId+"   "+stu.stuName);
	    Student stu1=new Student("Prasanna",49);
	    System.out.println(stu1.stuId+"   "+stu1.stuName);
		
	}

}
