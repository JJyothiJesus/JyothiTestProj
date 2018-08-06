package com.javaSample.Programs;

public class ObjectCreationExp {
	 //fields (or instance variable)
	String objName;
	int objAge;
	
	// constructor --Constructor looks like a method but it is in fact not a method. 
	//It’s name is same as class name and it does not return any value.
	  //Parameterized constructor
	ObjectCreationExp(String objName, int objAge){
	      this.objName = objName;
	      this.objAge = objAge;
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating objects
		ObjectCreationExp obj1 = new ObjectCreationExp("beginnersbook", 5);
		ObjectCreationExp obj2 = new ObjectCreationExp("google", 18);

		 //Accessing object data through reference
		
		
		System.out.println("First Value : " + obj1.objName + " " + obj1.objAge);
		System.out.println("Second Value :" + obj2.objName + " " + obj2.objAge);
		
	}

}
