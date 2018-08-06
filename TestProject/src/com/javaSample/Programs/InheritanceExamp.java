package com.javaSample.Programs;

//Inheritance Example 

class SuperclassTeacher {
	
	String designation = "Teacher";
	String college = "Beginnersbook";

	void does(){
		System.out.println("Teaching");
	   }
}

//class Subclass-name extends Superclass-name  
public class InheritanceExamp extends SuperclassTeacher {

	 //methods and fields  
	
	String mainSubject = "Maths";
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceExamp obj = new InheritanceExamp();
		
	      System.out.println(obj.college);
	      System.out.println(obj.designation);
	      System.out.println(obj.mainSubject);
	      
	      obj.does();
		

	}

}
