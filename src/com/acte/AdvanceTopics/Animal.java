package com.acte.AdvanceTopics;

public class Animal {
 
	public void animalFood() {
		System.out.println("Animal.animalFood()");
	}
	
	public static Animal createObject(String input) {
		if(input=="dog") {
			Dog dog=new Dog();
			System.out.println("dog object created");
	       return dog;
		}
		else {
			Cat cat=new Cat();
			System.out.println("cat object created");
			return cat;
		}
	
	}
}
