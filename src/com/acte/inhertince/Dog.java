package com.acte.inhertince;

public class Dog extends Animal { 
	public Dog() {
System.out.println("Dog constucter");
	}
public void typeofAnimal() {
	System.out.println("This is Dog");
	super.runningSpeed();
	super.typeofFood();
}
// in java when ever create objects
//first super class constucter will be called
//child class will be called
//this means current class object
//super means parent class object


}
