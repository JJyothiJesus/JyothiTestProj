package com.javaSample.Programs;

// abstract class
abstract class Animala{
	   //abstract method
	   public abstract void animalSound();
	}

/*
 * we have an abstract class Animal that has an abstract method animalSound(),
since the animal sound differs from one animala to another, 
there is no point in giving the implementation to this method 
as every child class must override this method to give its own implementation details. 
That’s why we made it abstract.
Now each animal must have a sound, by making this method abstract
we made it compulsory to the child class to give implementation details to this method.
This way we ensures that every animal has a sound.
*/

public class AbstractClassExample extends Animala {
	
	
	public void animalSound(){
		System.out.println("Woof");
	   }
	public static void main(String[] args) {

		Animala obj = new AbstractClassExample();
		obj.animalSound();
	}

}
