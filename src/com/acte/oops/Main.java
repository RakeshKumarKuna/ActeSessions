package com.acte.Oops;

public class Main {
	public void method1() {
		method2();
	}
	public void method2() {
		System.out.println("Main.method2()");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Encapulation obj=new Encapulation();
   obj.getStuid();
   obj.getStuName();
    obj.setStuid(87); 
	}

}
