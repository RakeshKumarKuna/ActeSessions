package com.acte.Inheritence;
public class Animal {
String animalName;
 String animalType;
 public Animal() {
	 //setters and getters tostring   param constucters
 }

	public String getAnimalName() {
	return animalName;
}
public void setAnimalName(String animalName) {
	this.animalName = animalName;
}
public String getAnimalType() {
	return animalType;
}
public void setAnimalType(String animalType) {
	this.animalType = animalType;
}
public String toString() {
	return "Animal [animalName=" + animalName + ", animalType=" + animalType + "]";
}
	public static void main(String[] args) {
		Animal obj = new Animal();
        obj.animalName="Lion";
        obj.animalType="wild";
        System.out.println(obj.animalName+" "+obj.animalType); //
       System.out.println(obj.toString());
       Animal obj1 = new Animal("tiger","wild");
       System.out.println(obj1.toString());
	}

	public Animal(String animalName, String animalType) {
		
		this.animalName = animalName;
		this.animalType = animalType;
	}

}
