package com.javaSample.Programs;

// SIngle Inheritance Example


class Animal{ 
	//Superclass
void eat(){System.out.println("Dog is eating... Nam nam nam");}  
}  

class Dog extends Animal{ 
	//Subclass Extending SUperClass
void bark(){System.out.println("Dog is barking...!");}  
}  

public class SingleInheritance {

	public static void main(String[] args) {

		Dog dg = new Dog();
		
		dg.bark();
		dg.eat();
	}

}
