package com.acte.interfaces;

public class MainApp {
//c -c extends
// c- I implements
// i- i extends	
// Functional interfaces
// marker interfaces	
	public static void main(String[] args) {
		IService obj=new Mail();
		System.out.println(obj.generateOtp());
		System.out.println(obj.addition(45, 99));
		obj.sendingMail();
	}

	
}
