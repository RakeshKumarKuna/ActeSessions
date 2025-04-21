package com.acte.Polymorphism;

public class PolyEx {
	
	public int add(int a,int b) {
		return a+b;
	}
	public int add(int a,int b,int c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		// Having many forms 
		// performing same names(same method sign) with diffrent parameters
        // method overloading method over riding
		PolyEx obj = new PolyEx();
		int res=obj.add(45, 95,5);
		System.out.println(res);
		
		
	}

}
