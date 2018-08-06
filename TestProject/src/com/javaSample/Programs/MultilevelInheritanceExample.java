package com.javaSample.Programs;

class Animals{  
void eat(){System.out.println("eating...");}  
}  
class Dogs extends Animals{  
void bark(){System.out.println("barking...");}  
}  
class BabyDog extends Dog{  
void weep(){System.out.println("weeping...");}  
}  

public class MultilevelInheritanceExample {

	public static void main(String[] args) {

		BabyDog bdg = new BabyDog();
		bdg.bark();
		bdg.eat();
		bdg.weep();
		
		
	}

}
