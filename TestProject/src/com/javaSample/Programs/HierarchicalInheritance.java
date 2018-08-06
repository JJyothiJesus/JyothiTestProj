package com.javaSample.Programs;

class Animalss{  
void eat()

{
	System.out.println("eating...");}  
}  
class Dogss extends Animalss{  
void bark(){
	System.out.println("barking...");}  
}  
class Cat extends Animalss{  
void meow(){
	System.out.println("meowing...");}  
}  

public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cat ct = new Cat();
		
		ct.meow();
		ct.eat();
		
		//ct.bark();//C.T.Error  because Cat Cannot Extend DOg class
		
	}

}
