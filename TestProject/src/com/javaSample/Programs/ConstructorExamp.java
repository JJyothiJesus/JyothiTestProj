package com.javaSample.Programs;

public class ConstructorExamp {
	
	 int age;
	 String name;
	 
	 //Default constructor
	 ConstructorExamp(){
		 this.name= "Jyothi" ;
		 this.age = 25 ;
	 }
	
	  //Parameterized constructor
	 ConstructorExamp(String n,int a){
		this.name=n;
		this.age=a;
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//object creation for class
		
		ConstructorExamp obj1 = new ConstructorExamp(); //default
		ConstructorExamp obj2 = new ConstructorExamp("Steve", 56); // parameterized
		
		//output
		System.out.println("Default consturctor :"+ obj1.name+" "+obj1.age);
		System.out.println("Parameterized consturctor :"+ obj2.name+" "+obj2.age);
	}

}
