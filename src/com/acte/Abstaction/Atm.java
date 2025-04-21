package com.acte.Abstaction;
// hiding the implementation and showing only nececcery detailes to the user
// abstcation classes - abstact key word
public class Atm {
	long accountNumber;
	int blanceAmount=0;
public void deposite(int amount) {
	this.blanceAmount=this.blanceAmount+amount;
}
public void withdraw(int amount) {
	this.blanceAmount=this.blanceAmount-amount;
}

public void statement() {
	System.out.println(this.blanceAmount);
}
}
