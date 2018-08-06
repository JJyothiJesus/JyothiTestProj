package com.javaSample.Programs;


/*Dynamic Polymorphism ---- Method Overriding
It is also known as Dynamic Method Dispatch. Dynamic poly morphism is a process
in which a call to an overridden method is resolved at runtime rather, thats why it is called runtime polymorphism.
*/

class Animal1{
	   public void animalSound(){
		System.out.println("Default Sound");
	   }
	}

public class DynamicPolymorphism  extends Animal1 {
	public void animalSound(){
		System.out.println("Woof");
	   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	DynamicPolymorphism dp = new DynamicPolymorphism(); error
		

		/*Since both the classes, child class and parent class have the same method animalSound.
		Which of the method will be called is determined at runtime by JVM.
		*/
		Animal1 obj = new DynamicPolymorphism();
		
		obj.animalSound();
		
	}

}
