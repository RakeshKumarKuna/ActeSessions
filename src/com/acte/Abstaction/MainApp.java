package com.acte.Abstaction;

public class MainApp {

	public static void main(String[] args) {
		Atm obj=new Atm();
		obj.deposite(10000);
		obj.withdraw(2000);
         obj.statement();
	}

}
